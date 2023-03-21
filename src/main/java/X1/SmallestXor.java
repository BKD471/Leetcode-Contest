package X1;

public class SmallestXor {
    public int solve(int A, int B) {
        int res=0;
        for(int i=31;i>=0;i--){
            if(B==0) return res;
            if(((A>>i)&1)==1) {
                res=(res | (1<<i));
                B--;
            }
        }
        if(B>0){
            for(int i=0;i<31;i++){
                if(B==0) return res;
                if( ((A>>i)&1)==0){
                    res=(res | (1<<i));
                    B--;
                }
            }
        }
        return res;
    }
}
