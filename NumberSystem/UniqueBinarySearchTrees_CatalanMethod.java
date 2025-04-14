package NumberSystem;

public class UniqueBinarySearchTrees_CatalanMethod {
        public static int numTrees(int n) {
            long res = 1;
            for (int i = 0; i < n; i++) {
                res = res * (2 * n - i) / (i + 1);
            }
            return (int) (res / (n + 1));

        }
}

//        factorial(2 * n) / (factorial(n + 1) * factorial(n));


