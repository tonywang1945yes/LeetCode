package previous.q0511;

public class Acountant {
    public String password="********";
    public static void main(String[] args){
        Acountant account=new Acountant();
        int c=account.checkPassword();
        System.out.println(c);
    }
    /**
     * 检验密码
     * 由于会计身份的特殊性，对会计的密码安全有较高的要求，
     * 会计的密码需要由8-20位字符组成；
     * 至少包含一个小写字母，一个大写字母和一个数字，不允许出现特殊字符；
     * 同一字符不能连续出现三次 (比如 "...ccc..." 是不允许的, 但是 "...cc...c..." 可以)。
     *
     * 如果密码符合要求，则返回0;
     * 如果密码不符合要求，则返回将该密码修改满足要求所需要的最小操作数n，插入、删除、修改均算一次操作。
     *
     * 示例：
     *
     * password: HelloWorld6
     * return: 0
     *
     * password: HelloWorld
     * return: 1
     *
     *
     */
    public  int checkPassword(){
        String oldPassword=password;
        int ptr=0;
        int counterUpper=0;
        int counterLower=0;
        int counterNumber=0;
        int countOperation=0;
        while(ptr<password.length()){
            if(password.charAt(ptr)<='Z'&&password.charAt(ptr)>='A'){
                counterUpper++;
            }else if(password.charAt(ptr)<='z'&&password.charAt(ptr)>='a'){
                counterLower++;
            }else if(password.charAt(ptr)<='9'&&password.charAt(ptr)>='0'){
                counterNumber++;
            }else{
               // password=password.substring(0,ptr)+password.substring(ptr+1);
                countOperation++;
                //
            }
            ptr++;
        }
//        System.out.println("lower: "+counterLower);
//        System.out.println("upper: "+counterUpper);
//        System.out.println("number: "+counterNumber);
//        System.out.println("operation: "+countOperation);
        for(int i=0;i<password.length();i++){
            int len=password.length();
            if(i+2<len){
                if(password.charAt(i)==password.charAt(i+1)&&password.charAt(i)==password.charAt(i+2)){
                    //三连一样

                    if(i+4<len){
                        //五连一样
                        if(password.charAt(i)==password.charAt(i+3)&&password.charAt(i)==password.charAt(i+4)){
                            if(password.charAt(i+2)<='Z'&&password.charAt(i+2)>='A'){
                                if(counterLower==0 || (counterLower>0&&counterNumber>0)){
                                    password=password.substring(0,i+2)+'a'+password.substring(i+3);
                                    countOperation++;
                                    counterLower++;
                                    i=i+2;
                                    continue;
                                }else if(counterNumber==0){
                                    password=password.substring(0,i+2)+'1'+password.substring(i+3);
                                    countOperation++;
                                    counterNumber++;
                                    i=i+2;
                                    continue;
                                }
                            }else if(password.charAt(i+2)<='z'&&password.charAt(i+2)>='a'){
                                if(counterUpper==0 || (counterUpper>0&&counterUpper>0)){
                                    password=password.substring(0,i+2)+'Z'+password.substring(i+3);
                                    countOperation++;
                                    counterUpper++;
                                    i=i+2;
                                    continue;
                                }else if(counterNumber==0){
                                    password=password.substring(0,i+2)+'2'+password.substring(i+3);
                                    countOperation++;
                                    counterNumber++;
                                    i=i+2;
                                    continue;
                                }
                            }else if(password.charAt(i+2)<='9'&&password.charAt(i+2)>='0'){
                                if(counterLower==0 || (counterLower>0&&counterNumber>0)){
                                    password=password.substring(0,i+2)+'b'+password.substring(i+3);
                                    countOperation++;
                                    counterLower++;
                                    i=i+2;
                                    continue;
                                }else if(counterUpper==0){
                                    password=password.substring(0,i+2)+'Z'+password.substring(i+3);
                                    countOperation++;
                                    counterUpper++;
                                    i=i+2;
                                    continue;
                                }
                            }
                        }
                    }

                        if(len<8){
                            if(password.charAt(i+1)<='Z'&&password.charAt(i+1)>='A'){
                                if(counterLower==0||(counterLower>0&&counterNumber>0)){
                                    password=password.substring(0,i+1)+'a'+password.substring(i+1);
                                    i++;
                                    countOperation++;
                                    continue;
                                }else if(counterNumber==0){
                                    password=password.substring(0,i+1)+'1'+password.substring(i+1);
                                    i++;
                                    countOperation++;
                                    continue;
                                }
                            }else if(password.charAt(i+1)<='z'&&password.charAt(i+1)>='a'){
                                if(counterNumber==0||(counterNumber>0&&counterUpper>0)){
                                    password=password.substring(0,i+1)+'0'+password.substring(i+1);
                                    i++;
                                    countOperation++;
                                    continue;
                                }else if(counterUpper==0){
                                    password=password.substring(0,i+1)+'A'+password.substring(i+1);
                                    i++;
                                    countOperation++;
                                    continue;
                                }
                            }else if(password.charAt(i+1)<='9'&&password.charAt(i+1)>='0'){
                                if(counterLower==0||(counterLower>0&&counterUpper>0)){
                                    password=password.substring(0,i+1)+'b'+password.substring(i+1);
                                    i++;
                                    countOperation++;
                                    continue;
                                }else if(counterUpper==0){
                                    password=password.substring(0,i+1)+'A'+password.substring(i+1);
                                    i++;
                                    countOperation++;
                                    continue;
                                }
                            }
                        }else if(len>20){
                            password=password.substring(0,i+1)+password.substring(i+2); //删除中间的字符
                            i--;
                            countOperation++;
                            continue;
                        }else{

                            if(password.charAt(i+1)<='Z'&&password.charAt(i+1)>='A'){
                                if(counterLower==0||(counterLower>0&&counterNumber>0)){
                                    password=password.substring(0,i+1)+'a'+password.substring(i+2);
                                    i++;
                                    countOperation++;
                                    continue;
                                }else if(counterNumber==0){
                                    password=password.substring(0,i+1)+'1'+password.substring(i+2);
                                    i++;
                                    countOperation++;
                                    continue;
                                }
                            }else if(password.charAt(i+1)<='z'&&password.charAt(i+1)>='a'){
                                if(counterNumber==0||(counterNumber>0&&counterUpper>0)){
                                    password=password.substring(0,i+1)+'0'+password.substring(i+2);
                                    i++;
                                    countOperation++;
                                    continue;
                                }else if(counterUpper==0){
                                    password=password.substring(0,i+1)+'A'+password.substring(i+2);
                                    i++;
                                    countOperation++;
                                    continue;
                                }
                            }else if(password.charAt(i+1)<='9'&&password.charAt(i+1)>='0'){
                                if(counterLower==0||(counterLower>0&&counterUpper>0)){
                                    password=password.substring(0,i+1)+'b'+password.substring(i+2);
                                    i++;
                                    countOperation++;
                                    continue;
                                }else if(counterUpper==0){
                                    password=password.substring(0,i+1)+'A'+password.substring(i+2);
                                    i++;
                                    countOperation++;
                                    continue;
                                }
                            }
                        }

                }else{
                    //没有三连一样
                    continue;
                }
            }
        }
        if(counterUpper==0){
            countOperation+=1;
            password=password+"A";

        }else if(counterLower==0){
            countOperation+=1;
            password=password+"a";
        }else if(counterNumber==0){
            countOperation+=1;
            password=password+"0";
        }
        if(password.length()>20){
            countOperation=countOperation+password.length()-20;
        }else if(password.length()<8){
            countOperation=countOperation-password.length()+8;
        }
        return countOperation;

    }
}
