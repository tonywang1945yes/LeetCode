package GetTheOffer.Offer10;

public class Solution1 {

    public int fib(int n) {
        if(n==0){return 0;}
        long x[]=new long[n+1];
        x[0]=0;
        x[1]=1;
        for (int i=2;i<=n;i++){
            x[i]=(x[i-1]+x[i-2])%1000000007;
        }
        return (int)(x[n]);
    }

}
