package previous.q0511;

import java.util.ArrayList;


public class Editor {
    public static void main(String[] args){
        Editor e=new Editor();

        e.textExtraction("给定一段字符串，重新排版，使得每行恰好有32个字符，并输出至控制台首行缩进，其余行数左对齐，每个短句不超过32个字符。");


    }
    public void  textExtraction(String data){
        char[] labelSet={',','.',';',':','，','。','；','：'};
        ArrayList<String> subSentences=new ArrayList<>();
        for(int i=0;i<data.length();i++){
            for(int j=0;j<labelSet.length;j++){
                if(data.charAt(i)==labelSet[j]){
                    subSentences.add(data.substring(0,i+1));
                    data=data.substring(i+1);
                    i=0;
                    break;
                }
            }
        }
        int max=32;
        for(int i=0;i<subSentences.size();i++){
            int counter=0;
            int counter2=0;

            if(i==0){
                System.out.print("    ");
                max=28;
            }else if(i==subSentences.size()-1){
                System.out.print(subSentences.get(i));
                break;
            }

            String firstPrint=subSentences.get(i);
            String nextPrint=subSentences.get(i+1);

            for(int j=0;j<firstPrint.length();j++){
                char temp_c=firstPrint.charAt(j);

                if (checkIsChineseLabel(temp_c)||temp_c < 256) {
                        counter += 1;
                } else {
                        counter += 2;
                }

            }

            for(int j=0;j<nextPrint.length();j++){
                char temp_c=nextPrint.charAt(j);

                if (temp_c < 256||checkIsChineseLabel(temp_c)) {
                        counter2 += 1;
                } else {
                        counter2 += 2;
                }

            }

            if(counter+counter2<=max){
                System.out.print(firstPrint);
                max=max-counter;
                continue;
            }else{
                System.out.println(firstPrint);
                max=32;
            }

        }

    }

    private boolean checkIsChineseLabel(char temp_c){
        if(temp_c=='，'||temp_c=='。'||temp_c=='；'||temp_c=='：'){
            return true;
        }else{
            return false;
        }
    }
}
