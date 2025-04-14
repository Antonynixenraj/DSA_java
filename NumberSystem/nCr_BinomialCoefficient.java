package NumberSystem;

public class nCr_BinomialCoefficient {
    public static int nCr(int n, int r) {
        if (r == 0 || n == r)
            return 1;

        if (n < r)
            return 0;

        r = Math.min(r, n - r);
        long res = 1;

        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res /= (i + 1);
        }

        return (int) res;
    }
}
