package GetTheOffer.Offer17;

public class Solution {
    public int[] printNumbers(int n) {
        int len=0;
        if(n<=10){
            len=(int)Math.pow(10,n)-1;
        }else{
            len=2147483647;
        }
        int[] x=new int[len];
        for(int i=0;i<x.length;i++){
            x[i]=i+1;
        }
        return x;
    }
}
