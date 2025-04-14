package NumberSystem;

public class CountingDigitToSingle {
    public static int count(int n) {
        if(n<10)    return n;
        return n%9==0?9:n%9;
    }

}
