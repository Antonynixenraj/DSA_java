package NumberSystem;

import java.util.ArrayList;
public class SieveOfEratosthenes {
    static ArrayList<Integer> sieveOfEratosthenes(int n) {
        ArrayList<Integer> arr= new ArrayList<>();

        for(int i=2;i<=n;i++){
            if(isPrime(i))
                arr.add(i);
        }

        return arr;

    }
    static boolean isPrime(int n){

        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
