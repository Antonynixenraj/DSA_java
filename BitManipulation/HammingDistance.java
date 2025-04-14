package BitManipulation;

public class HammingDistance {
    static int humming(int x,int y){
        return setBits(x^y);
    }
    static int setBits(int n) {
        int count=0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

}
