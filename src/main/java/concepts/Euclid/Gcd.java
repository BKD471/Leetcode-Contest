package concepts.Euclid;


public class Gcd {
    public static int gcd(int a, int b) {
        if (a == 0 || b == 0) return a + b;
        if (a == b) return b;

        return gcd(b % a, a);
    }
}
