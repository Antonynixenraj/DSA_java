package BitManipulation;
public class DuplicateElement_in_Array_Using_Bitwise {
    public static int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }

}

/*

NOTES:
    (i) This method can applicable if an array has 1 non-duplicate or Entire array is duplicate
        eg:{1,1,2,3,3} => 2
           {1,1,2,2,3,3} => 0

    (ii) Concept : n^n = 0  XOR operator
        eg: 9^9 = 0

 */
