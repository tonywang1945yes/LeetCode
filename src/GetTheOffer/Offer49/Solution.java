package GetTheOffer.Offer49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int nthUglyNumber(int n) {
        //一个数是丑数当且仅当它除以2，3，5中的某一个是丑数
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        if(n<=4){
            return n;
        }else{
            int p5=0;
            int p3=1;
            int p2=2;
            while(arr.size()<n){
                int t2=arr.get(p2);
                int t3=arr.get(p3);
                int t5=arr.get(p5);
                if(t2*2<=t3*3&&t2*2<=t5*5){
                    arr.add(t2*2);
                    if(t2*2==t3*3)
                        p3++;
                    if(t2*2==t5*5)
                        p5++;
                    p2++;
                }
                else if(t3*3<=t2*2&&t3*3<=t5*5){
                    arr.add(t3*3);
                    if(t2*2==t3*3)
                        p2++;
                    if(t3*3==t5*5)
                        p5++;
                    p3++;
                }else{
                    arr.add(t5*5);
                    if(t5*5==t3*3)
                        p3++;
                    if(t2*2==t5*5)
                        p2++;
                    p5++;
                }
            }
            return arr.get(n-1);
        }
    }

    public boolean isUgly(int n) {
        if (n<=0){
            return false;
        }
        while((n%2)==0){
            n/=2;
        }
        while((n%3)==0){
            n/=3;
        }
        while((n%5)==0){
            n/=5;
        }
        if(n==1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Solution solution=new Solution();
        System.out.println(solution.nthUglyNumber(1352 ));
    }
}
