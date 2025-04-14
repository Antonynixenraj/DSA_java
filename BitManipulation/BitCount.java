package BitManipulation;

// To calculate No.of 1's in given decimal number to Binary format
public class BitCount {
    static int setBits(int n) {
        int count=0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
