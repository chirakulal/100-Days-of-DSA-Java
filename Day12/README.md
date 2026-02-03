# Day 12 – Squares of a Sorted Array

## 📌 Problem
Given a sorted integer array (which may contain negative numbers), return a new array containing the squares of each number, sorted in non-decreasing order.

🔗 LeetCode: Squares of a Sorted Array

---

## 🧠 Approach
Although the input array is sorted, squaring negative numbers can disrupt the order.

Key observations:
- The largest square comes from either the largest positive number or the largest negative number (by absolute value).
- Use two pointers starting from both ends of the array.
- Compare absolute values and place the larger square at the end of the result array.

This avoids an additional sorting step.

---

## 💻 Java Solution

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0, right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[pos] = nums[left] * nums[left];
                left++;
            } else {
                result[pos] = nums[right] * nums[right];
                right--;
            }
            pos--;
        }

        return result;
    }
}
