package BitManipulation;

public class AddSub {
    static int addition(int a, int b) {
        while (b != 0) {
            int carry = a & b;  // Calculate carry
            a = a ^ b;          // Sum without carry
            b = carry << 1;     // Shift carry left
        }
        return a;
    }
    public static int subtract(int a, int b) {
        while (b != 0) {
            int borrow = (~a) & b;  // Calculate borrow
            a = a ^ b;              // Subtract without borrow
            b = borrow << 1;        // Shift borrow left
        }
        return a;
    }

}
