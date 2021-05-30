package previous.q_bytedance;

import java.util.Scanner;

public class Main2 {
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String str=sc.nextLine();
            System.out.println(test(str));
        }
    }

    public static String  test(String str){
        int p=0;
        while(true){
            if(p>=str.length()-2){
                break;
            }
            if(str.charAt(p)==str.charAt(p+1)){
                if(str.charAt(p+2)==str.charAt(p)){
                    if(p==str.length()-3) {
                        str = str.substring(0, p + 2);
                    }else{
                        str=str.substring(0,p+2)+str.substring(p+3);
                    }
                }else if(p<str.length()-3 && str.charAt(p+2)==str.charAt(p+3)){
                    str=str.substring(0,p+2)+str.substring(p+3);
                }else{
                    p=p+1;
                }
            }else{
                p=p+1;
            }
        }
        return str;
    }
}
