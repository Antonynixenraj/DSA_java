package NumberSystem;

public class SieveOfEratosthenes {
    static String isPrime(int n) {
        if(n==0||n==1) return "Neither Prime nor Composite";

        else if (n<0) return "Not a Positive number";

        return sieveOfEratosthenes(n)[n]?"Not Prime":"Prime";

    }
    static boolean[] sieveOfEratosthenes(int n){
        boolean[] prime=new boolean[n+1];

        for(int i=2;i*i< prime.length;i++){
            for (int j = i*i; j < prime.length && !prime[i]; j+=i) {
                prime[j] = true;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(97));
    }
}
