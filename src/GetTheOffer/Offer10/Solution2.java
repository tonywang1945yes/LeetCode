package GetTheOffer.Offer10;

public class Solution2 {
    /*
    一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
    在某家企业的面试中真的遇到过此题。
    f(n)=f(n-1)+f(n-2)
    f(0)=1
    f(1)=1
    f(2)=2
     */

    public int numWays(int n) {
        if(n==0){return 1;}
        long x[]=new long[n+1];
        x[0]=1;
        x[1]=1;
        for (int i=2;i<=n;i++){
            x[i]=(x[i-1]+x[i-2])%1000000007;
        }
        return (int)(x[n]);
    }
}
