package NumberSystem;

import java.util.ArrayList;

public class SieveOfEratosthenes_CountPrime {

    static ArrayList<Integer> sieveOfEratosthenes(int n) {
        ArrayList<Integer> arr= new ArrayList<>();
        boolean[] prime=isPrime(n);

        for(int i=2;i<prime.length;i++){
            if(!prime[i])
                arr.add(i);
        }

        return arr;

    }
    public static boolean[] isPrime(int n){
        boolean[] prime =new boolean[n+1];

        for(int i=2;i*i< prime.length;i++){
            for(int j = i *i; j< prime.length && !prime[i]; j+=i){
                prime[j]=true;
            }
        }
        return prime;
    }

}

