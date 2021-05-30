package previous.q_huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static int [][] table=new int[40][50];
    public static void main(String  args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> x=new ArrayList<>();
        ArrayList<Integer> y=new ArrayList<>();
        for(int i=0;i<n;i++){
            x.add(sc.nextInt());
            y.add(sc.nextInt());
        }

        int min=1000;
        for(int i=0;i<100;i++){
            initTable(x,y);
            ArrayList<Integer> x0=new ArrayList<>();
            ArrayList<Integer> y0=new ArrayList<>();
            for (int j = 0; j < x.size(); j++) {
                x0.add(x.get(i));
                y0.add(y.get(i));
            }
            int counter=0;
            while(x0.size()>0) {

                int index = getRandom(x0.size());
                int x_index = x0.get(index);
                int y_index = y0.get(index);

                int model = getRandom(4);
                if(counter<10){
                    System.out.println(table[x_index][y_index]);
                }
                ArrayList<Integer> to_clear=clear(x_index,y_index,model);
                ArrayList<Integer> x2=new ArrayList<>();
                ArrayList<Integer> y2=new ArrayList<>();

                for(int k=0;k<x0.size();k++){
                    if(to_clear.contains(k)){
                        System.out.println(k);
                        continue;
                    }else{
                        x2.add(x0.get(k));
                        y2.add(y0.get(k));
                    }
                }
                x0=x2;
                y0=y2;
                counter++;
            }
            if(counter<min){
                min=counter;
            }
        }
    }

    public static int getRandom(int up){
        return (int)(Math.random()*up);
    }

    public static void initTable(ArrayList<Integer> x,ArrayList<Integer> y){
        for(int i=0;i<40;i++){
            for(int j=0;j<50;j++){
                table[i][j]=-1;
            }
        }
        for(int i=0;i<x.size();i++){
            int x0=x.get(i);
            int y0=y.get(i);
            table[x0][y0]=i;
        }
    }

    public static ArrayList<Integer> clear(int x1,int y1,int model){

        ArrayList<Integer> res=new ArrayList<>();
        if(model==0){
            for(int j=0;j<50;j++){
                if(table[x1][j]>=0) {
                    res.add(table[x1][j]);
                    table[x1][j] = -1;
                }
            }
        }else if(model==1){
            for(int i=0;i<40;i++){
                if(table[i][y1]>=0){
                    res.add(table[i][y1]);
                    table[i][y1]=-1;
                }
            }
        }else if(model==2){
            res.add(table[x1][y1]);
            table[x1][y1]=-1;
            int i=x1;int j=y1;
            while(i-1>=0&&j-1>=0){
                i=i-1;
                j=j-1;
                if(table[i][j]>=0){
                    res.add(table[i][j]);
                    table[i][j]=-1;
                }
            }
            while(i+1<40&&j+1<50){
                i=i+1;
                j=j+1;
                if(table[i][j]>=0){
                    res.add(table[i][j]);
                    table[i][j]=-1;
                }
            }

        }else if(model==3){
            res.add(table[x1][y1]);
            table[x1][y1]=-1;
            int i=x1;int j=y1;
            while(i-1>=0&&j+1<50){
                i=i-1;
                j=j+1;
                if(table[i][j]>=0){
                    res.add(table[i][j]);
                    table[i][j]=-1;
                }
            }
            while(i+1<40&&j-1>=0){
                i=i+1;
                j=j-1;
                if(table[i][j]>=0){
                    res.add(table[i][j]);
                    table[i][j]=-1;
                }
            }
        }
        return res;
    }
}
