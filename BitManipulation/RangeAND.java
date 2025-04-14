package BitManipulation;

public class RangeAND {
    public static int rangeBitwiseAnd(int left, int right) {
        while (left < right)
            right = right & (right - 1);

        return right;
    }
}


/*
NOTE:
        -> This used t find XOR of given range
            eg:(6,9) [6 & 7 & 8 & 9]
            output: 0

        -> This Code runs in O(log(n)) Time and o(1) space complexity
*/
