package NumberSystem;

public class Power {
    public static double myPow(double x, double n) {

        if ((x == 0 && n < 0) || (n==0 && x==0))
            throw new ArithmeticException("Undefined");


        else if(x<0) {

            x*=-1;

            if (n % 2 != 0){
                if(n%1==0 && n%1==0)
                    return Math.round(Math.exp(n * Math.log(x))) * -1;
                return Math.exp(n * Math.log(x)) * -1;
            }
        }
        if(n%1==0 && n%1==0)
            return Math.round(Math.exp(n * Math.log(x)));

        return Math.exp(Math.log(x)*n);
    }



}

