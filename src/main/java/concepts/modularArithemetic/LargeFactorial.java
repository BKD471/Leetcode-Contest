package concepts.modularArithemetic;
import java.math.BigInteger;

public class LargeFactorial {
    private static final BigInteger LIMIT= BigInteger.valueOf((int)Math.pow(10,9)+7);
    public static  BigInteger fact(int n){
        BigInteger fact=BigInteger.valueOf(1);
        for(int i=2;i<=n;i++){
            BigInteger index=BigInteger.valueOf(i);
            fact=((fact.mod(LIMIT)).multiply( index.mod(LIMIT))).mod(LIMIT);
        }
        return fact;
    }

    public static BigInteger recursiveFact(int n){
        if(n<=1) return BigInteger.valueOf(1);
        BigInteger k=BigInteger.valueOf(n);
        return ( (k.mod(LIMIT)).multiply(recursiveFact(n-1).mod((LIMIT)))).mod(LIMIT);
    }

    public static void main(String[] args) {
        System.out.println(fact(69));
        System.out.println(recursiveFact(100));
    }
}
