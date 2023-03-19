package lc337;

public class NumberOfEvenAndOddBits {
    public int[] evenOddBit(int n) {
        int[] evo=new int[2];
        int even=0,odd=0;
        for(int i=0;i<=31;i++){
            if(((n>>i)&1)>=1){
                if(i%2==0) even++;
                else odd++;
            }
        }
        evo[0]=even;
        evo[1]=odd;
        return evo;
    }
}
