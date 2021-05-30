package previous.q_huawei;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        String input2=sc.nextLine();
        int n=Integer.parseInt(input1);
        int p=0;
        for(int i=1;i<=n;i++){

            if(input2.charAt(p)=='0'){
                p++;
                String temp=input2.substring(p,p+8);
                for(int j=7;j>=0;j--){
                    System.out.print(temp.charAt(j));
                    p++;
                }

                System.out.print(" ");
            }else{
                p++;
                for(int j=0;j<8;j++){
                    System.out.print(input2.charAt(p));
                    p++;
                }
                System.out.print(" ");
            }
        }
    }
}
