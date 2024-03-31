class Solution {
//     Brute force appraoch
//     public long countAlternatingSubarrays(int[] nums) {
//         int n = nums.length;
//         long count = 0;

//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 if (isAlternating(nums, i, j)) {
//                     count++;
//                 } else {
//                     break;
//                 }
//             }
//         }

//         return count;
//     }
    
//     public boolean isAlternating(int[] nums, int start, int end) {
//         for (int i = start; i < end; i++) {
//             if (nums[i] == nums[i + 1]) {
//                 return false;
//             }
//         }
//         return true;
//     }
    
    public long countAlternatingSubarrays(int[] nums) {
        long count = 0;
        int windowStart = 0;
        
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            if (windowEnd > 0 && nums[windowEnd] == nums[windowEnd - 1]) {
                windowStart = windowEnd;
            }
            count += windowEnd - windowStart + 1;
        }
        
        return count;
    }

}
