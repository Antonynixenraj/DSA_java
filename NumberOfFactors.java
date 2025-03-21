public class NumberOfFactors {
    static int countFactors(int N) {
        double sqrt=(double) (Math.sqrt(N));
        int num=(int) (Math.round(sqrt));
        int count=0;
        for(int i=1;i<=num;i++){
            if(i*i==N)
                count++;
            else if(N%i==0)
                count+=2;
        }
        return count;
    }
}
