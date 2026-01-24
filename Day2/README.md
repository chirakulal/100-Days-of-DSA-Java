# Day 02 – Maximum Subarray (Kadane’s Algorithm)

## 📌 Problem
Given an integer array `nums`, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

🔗 LeetCode Problem: Maximum Subarray

---

## 🧠 Approach
Initially, a brute-force approach checks all possible subarrays, but it is inefficient.

Using **Kadane’s Algorithm**:
- Maintain a running sum
- Reset the sum when it becomes negative
- Track the maximum sum at each step

This ensures we always choose the optimal subarray ending at the current index.

---

## ⏱️ Complexity
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

## 💻 Java Solution

```java
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
