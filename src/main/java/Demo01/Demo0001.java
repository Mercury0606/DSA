package Demo01;

import java.util.Arrays;

public class Demo0001 {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        System.out.println(containsDuplicate(nums));

    }

    private static boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count()!=nums.length;

    }

}
