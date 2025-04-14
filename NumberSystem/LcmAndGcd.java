package NumberSystem;

public class LcmAndGcd {
    public static int[] lcmAndGcd(int a, int b) {
        int lcm=(a*b)/gcd(a,b);

        return new int[]{lcm,gcd(a,b)};
    }

    public static int gcd(int n1, int n2) {

        int mul=Math.max(n1,n2),div=Math.min(n1,n2),rem=mul%div;
        while(rem!=0){
            mul=div;
            div=rem;
            rem=mul%div;
        }
        return div;
    }

}



