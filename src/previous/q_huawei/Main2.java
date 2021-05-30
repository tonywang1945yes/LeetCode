package previous.q_huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static ArrayList<String> pathStrs=new ArrayList<String>();
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int numbers[]=new int [12];
        numbers[0]=0;
        numbers[1]=0;
        for(int i=2;i<12;i++){
            numbers[i]=sc.nextInt();
        }
        double distance[][]=new double[6][6];
        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                double dis=calcDistance(numbers[2*i],numbers[2*i+1],numbers[2*j],numbers[2*j+1]);
                distance[i][j]=dis;
                distance[j][i]=dis;
            }
        }
        ArrayList<String> countNum=new ArrayList<>();
        for(int i=1;i<=5;i++){
            countNum.add(Integer.toString(i));
        }
        Main2.getPath("",countNum);
        double min=10000000.0;
        for(int i=0;i<Main2.pathStrs.size();i++){
            double temp_dis=0.0;

            for(int j=0;j<4;j++){
                temp_dis+=distance[Integer.parseInt(Main2.pathStrs.get(i).substring(j,j+1))][Integer.parseInt(Main2.pathStrs.get(i).substring(j+1,j+2))];
            }
            temp_dis+=distance[0][Integer.parseInt(Main2.pathStrs.get(i).substring(0,1))];
            temp_dis+=distance[0][Integer.parseInt(Main2.pathStrs.get(i).substring(4,5))];
            if(temp_dis<min){
                min=temp_dis;
            }
        }
        System.out.println((int)min);
    }

    private static double calcDistance(int a1 , int b1,int a2,int b2){
        return Math.sqrt((double)((a1-a2)*(a1-a2)+(b1-b2)*(b1-b2)));
    }


    private static void getPath(String current,ArrayList<String> arr){
        if(arr.size()==0){
            Main2.pathStrs.add(current);
        }else if(arr.size()==1){
            Main2.pathStrs.add(current+arr.get(0));
        }else{
            for(int i=0;i<arr.size();i++){
                String temp= current+arr.get(i);
                ArrayList<String> temp1=new ArrayList<>();
                for(int j=0;j<arr.size();j++){
                    if(j!=i)
                    temp1.add(arr.get(j));
                }
                getPath(temp,temp1);
            }
        }
    }
}
