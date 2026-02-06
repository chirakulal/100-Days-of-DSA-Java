# Day 15 – Find Pivot Index

## 📌 Problem
Find an index where the sum of elements on the left equals the sum on the right.

🔗 LeetCode: Find Pivot Index

---

## 🧠 Approach
First compute the total sum.
Then maintain a running left sum and check whether:

leftSum == totalSum - leftSum - nums[i]

---

## 💻 Java Solution

```java
class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) totalSum += num;

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
