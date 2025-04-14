package BitManipulation;

public class PowerOf2 {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        else if(n%2!=0 || n==0) return false;

        int num=(int)(Math.log(n)/Math.log(2));
        return Math.pow(2,num)==n;
    }
}

/*

*   To find power of any number with log(n)/log(pow) => Eg: to find what is the power value of 1000 with 10 means (log(1000)/log(10))
            -> Output => 3.

* */