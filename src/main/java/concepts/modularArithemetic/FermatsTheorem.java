package concepts.modularArithemetic;

public class FermatsTheorem {
    public int calPow(int n,int p,int m){
        if(n==0) return 0;
        if(p==0) return 1;

        long res=(calPow(n,p/2,m)%m);
        res=((res%m)*(res%m))%m;
        return p%2==0? (int)(res+m): (int)(((n%m)*(res%m)+m)%m);
    }

    public int solve(int A, int B)
    {
        return calPow(A, B-2, B);
    }
}
