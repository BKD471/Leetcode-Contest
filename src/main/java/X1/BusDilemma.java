package X1;

public class BusDilemma {
    public int solve(int[] A, int B) {
        int n=A.length;
        int mn=A[0],mx=A[0];
        for(int i=1;i<n;i++){
            A[i]=A[i]+A[i-1];
            mn=Math.min(mn,A[i]);
            mx=Math.max(mx,A[i]);
        }

        mn=(mn>=0)? 0:-mn;

        mx=(mx<=0)?B:B-mx;
        if(mn>mx) return 0;
        return mx-mn+1;
    }
}
