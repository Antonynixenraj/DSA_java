package BitManipulation;
import java.util.ArrayList;
import java.util.List;
public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int total = 1 << n;
        List<List<Integer>> result = new ArrayList<>();

        for (int mask = 0; mask < total; mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subset.add(nums[i]);
                }
            }
            result.add(subset);
        }

        return result;
    }

    public static void main(String[] args) {
        int a[]={3,4,21,35,32,12,54,75};
        System.out.println(subsets(a));
    }
}

/*

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]

 */
