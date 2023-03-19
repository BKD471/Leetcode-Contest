package concepts.Euclid;

public class CheckSubseqwithGCD1 {
    public boolean check(int[] a){
        int n=a.length;
        int res=a[0];
        for(int i=1;i<n;i++){
            res=Gcd.gcd(res,a[i]);
        }

        return res==1?  true:false;
    }
}
