package codingint;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by borisgurtovyy on 11/9/17.
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int nonzeropointer = 0;
        for(int i=0; i<nums.length;i++) {
            if (nums[i] != 0) {
                nums[nonzeropointer] = nums[i];
                nonzeropointer++;
            }
        }
        for(;nonzeropointer<nums.length;nonzeropointer++){
            nums[nonzeropointer] = 0;
        }
    }

    @Test
    public void testMoveZeroes() {

        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

}
