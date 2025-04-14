package BitManipulation;

public class RangeXOR {
    public static int findXOR(int L, int R){

        return computeXOR(R)^computeXOR(L-1);
    }
    private static int computeXOR(int n) {
        if (n % 4 == 0) return n;
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return n + 1;
        return 0;
    }


}

/*
NOTE:
    -> This used t find XOR of given range
        eg:(6,9) [6^7^8^9]
        output: 0

    -> This Code runs in O(1) Time and space complexity
*/