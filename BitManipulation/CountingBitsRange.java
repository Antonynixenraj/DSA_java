package BitManipulation;

public class CountingBitsRange {

    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=bitcount(i);return arr;
        }
        return arr;
    }
    static int bitcount(int n) {
        int count=0;
        while (n > 0) {
                count += n & 1;
                n >>= 1;
        }
        return count;
    }

}

/*

Example 1:

Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
Example 2:

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101

 */
