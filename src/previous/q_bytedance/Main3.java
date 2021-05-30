package previous.q_bytedance;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1=Integer.parseInt(sc.nextLine());
        for(int iter=0;iter<n1;iter++){
            int n2=Integer.parseInt(sc.nextLine());
            String str=sc.nextLine();
            test(n2,str);

        }
    }

    public static void test(int n,String str){
        String[] input=str.split(" ");
        ArrayList<Integer> indexs=new ArrayList<>();
        n=input.length;
        int [] out=new int[n];

//        if(n==1){
//            System.out.println(1);
//            return;
//        }else if(n==2){
//            if(input[0].equals(input[1])){
//                System.out.println(2);
//            }else{
//                System.out.println(3);
//            }
//            //return;
//        }

        //首先处理不比两边高的情况
        for(int i=0;i<n;i++){
            int j1=i+1;
            if(j1==n){
                j1=0;
            }
            int j2=i-1;
            if(j2<0){
                j2=n-1;
            }
            if(Integer.parseInt(input[i])<=Integer.parseInt(input[j1]) && Integer.parseInt(input[i])<=Integer.parseInt(input[j2])){
                indexs.add(i);
            }
        }

        while(indexs.size()>0){
            out[indexs.get(0)]=1;
            indexs.remove(0);
        }

        //然后处理只比左边高的情况
        for(int i=0;i<n;i++){
            int j1=i+1;
            if(j1==n){
                j1=0;
            }
            int j2=i-1;
            if(j2<0){
                j2=n-1;
            }
            if(Integer.parseInt(input[i])<=Integer.parseInt(input[j1]) && Integer.parseInt(input[i])>Integer.parseInt(input[j2])){
                indexs.add(i);
            }
        }

        while(indexs.size()>0){
            if(indexs.get(0)-1<0){
                out[indexs.get(0)]=out[n]+1;
            }else {
                out[indexs.get(0)] = out[indexs.get(0)-1]+1;
            }
            indexs.remove(0);
        }

        //然后处理只比右边高的情况
        for(int i=0;i<n;i++){
            int j1=i+1;
            if(j1==n){
                j1=0;
            }
            int j2=i-1;
            if(j2<0){
                j2=n-1;
            }
            if(Integer.parseInt(input[i])>Integer.parseInt(input[j1]) && Integer.parseInt(input[i])<=Integer.parseInt(input[j2])){
                indexs.add(i);
            }
        }

        while(indexs.size()>0){
            if(indexs.get(0)+1==n){
                out[indexs.get(0)]=out[0]+1;
            }else{
                out[indexs.get(0)] = out[indexs.get(0)+1]+1;
            }
            indexs.remove(0);
        }

        //然后处理比两边高的情况
        for(int i=0;i<n;i++){
            int j1=i+1;
            if(j1==n){
                j1=0;
            }
            int j2=i-1;
            if(j2<0){
                j2=n-1;
            }
            if(Integer.parseInt(input[i])>Integer.parseInt(input[j1]) && Integer.parseInt(input[i])>Integer.parseInt(input[j2])){
                //此时两边必然都有值
                out[i]=getMaxPlusOne(out[j1],out[j2]);
            }
        }

        //输出
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=out[i];
        }
        System.out.println(sum);
    }

    public static int getMaxPlusOne(int n1,int n2){
        if(n1>=n2){
            return n1+1;
        }else {
            return n2+1;
        }
    }
}
