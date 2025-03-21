package NumberSystem;

public class PrimeFactors {
    public int[] AllPrimeFactors(int N)
    {
        int sz=0;
        for(int i=2;i<=N;i++){
            if(N%i==0 && isPrime(i)){
                sz++;
            }

        }
        int a[]=new int[sz];
        for(int i=2,j=0;i<=N;i++){
            if(N%i==0 && isPrime(i)){
                a[j++]=i;
            }

        }
        return a;

    }
    static boolean isPrime(int n) {
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
