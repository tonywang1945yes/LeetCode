package previous.q_bytedance;

import java.util.Scanner;

public class Main {
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int n=1019;
        int x=1024-n;
        int sum=0;
        for(int i=3;i>=0;i--){
            int m=(int)Math.pow(4,i);
            sum=sum+(x/m);
            x=x%m;
        }
        System.out.println(sum);
    }


}
