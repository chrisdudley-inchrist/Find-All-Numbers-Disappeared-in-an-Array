import java.util.*;

/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array),
 * some elements appear twice and others appear once.
 *
 * Find all the elements of [1, n] inclusive that do not appear in this
 * array.
 *
 * Could you do it without extra space and in O(n) runtime? You may
 * assume the returned list does not count as extra space.
 *
 * Example:
 *
 * Input:
 * [4,3,2,7,8,2,3,1]
 *
 * Output:
 * [5,6]
 */

public class Main {

    public static void main(String[] args) {
        findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> dissappearedNums = new LinkedList<>();
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            dissappearedNums.add(nums[i]);
        }


        for (int i = 1; i <= length; i++) {
            if (dissappearedNums.contains(i)) {
                while (dissappearedNums.contains(i)) {
                    dissappearedNums.remove(dissappearedNums.indexOf(i));
                }
            } else {
                dissappearedNums.add(i);
            }
        }

        return dissappearedNums;
    }
}



