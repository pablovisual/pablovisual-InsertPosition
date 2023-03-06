

public class InsertPosition {

    /**
     * Find the position that a number should be inserted into in a sorted array.
     * For instance, in the array {2,4,6,8,10}, inserting 5 would belong at position 2, since the resulting array
     * would be {2,4,5,6,8,10}, where the index of 5 is 2 (remember zero-indexing.)
     * See the test cases for more examples.
     *
     * You may assume no duplicate values.
     *
     * @param nums an array of ints.
     * @param target the number that would hypothetically be inserted.
     * @return return the index that a number should be inserted into a sorted array.
     */
    public int searchInsert(int[] nums, int target) {
        //create at index at position 0
        int index = 0;

        //return index if nums is empty
        if(nums.length == 0)
            return 0;

        //check if nums only has one item in the array
        else if(nums.length == 1) {
            if(target < nums[0])
                return 0;

            return 1;
        }

        //another if there are two items in nums array
        else if(nums.length == 2) {
            if(target < nums[0])
                return 0;

            else if(target > nums[1])
                return 2;

            else
                return 1;
        }

        //then lastly num array is bigger than size 2
        for(int idx = 0; idx < nums.length; ++idx) {
            if(target < nums[idx])
                return idx;
        }

        //return index+=nums.length since target was bigger than the other
        //numbers in the nums array
        index += nums.length;
        return index;
    }
}
