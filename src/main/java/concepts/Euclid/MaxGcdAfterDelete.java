package concepts.Euclid;

public class MaxGcdAfterDelete {
    public int maxGcd(int[] A){
        int n=A.length;
        int[] left=new int[n];
        int[] right=new int[n];

        int start=A[0];
        left[0]=A[0];
        for(int i=1;i<n;i++) {
            start=Gcd.gcd(start,A[i]);
            left[i]=start;
        }

        int end=A[n-1];
        right[n-1]=A[n-1];
        for(int i=n-2;i>=0;i--){
            end=Gcd.gcd(end,A[i]);
            right[i]=end;
        }

        int mxGcd=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(i==0) mxGcd=Math.max(mxGcd,right[i+1]);
            else if(i==n-1) mxGcd = Math.max(mxGcd, left[i-1]);
            else mxGcd=Math.max(mxGcd,Gcd.gcd(left[i-1],right[i+1]));
        }
            return mxGcd;
    }
}
