package NumberSystem;

public class NumberOfFactors {
    static int countFactors(int N) {

        int count=0;
        for(int i=1;i*i<=N;i++){
            if(i*i==N)
                count++;
            else if(N%i==0)
                count+=2;
        }
        return count;
    }
}
