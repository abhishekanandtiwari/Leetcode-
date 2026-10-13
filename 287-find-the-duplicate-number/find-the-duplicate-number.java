class Solution {
    public int findDuplicate(int[] nums) {
        // Phase 1: Finding the intersection point in the cycle
        int tortoise = nums[0];
        int hare = nums[0];
        
        do {
            tortoise = nums[tortoise];        // Move tortoise 1 step
            hare = nums[nums[hare]];          // Move hare 2 steps
        } while (tortoise != hare);
        
        // Phase 2: Finding the entrance to the cycle
        // Reset tortoise to start; moving both at same speed will meet at the duplicate
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        
        return tortoise;
    }
}