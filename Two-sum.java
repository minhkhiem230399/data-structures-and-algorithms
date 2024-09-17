class Solution {

    public static int[] twoSum(int[] nums, int target) {
        // create map to stored the value
        HashMap<Integer, Integer> map = new HashMap<>();

        // Loop each in element in the array
        for (int i = 0; i < nums.length; i++) {
            int cp = target - nums[i];

            if (map.containsKey(cp)) {
                return new int[] { map.get(cp), i };
            }

            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }
}
