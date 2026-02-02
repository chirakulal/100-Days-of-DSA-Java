# Day 11 – Container With Most Water

## 📌 Problem
Given an array of heights, find two lines that together with the x-axis form a container that holds the most water.

🔗 LeetCode: Container With Most Water

---

## 🧠 Approach
The area of water depends on:
- The distance between the two lines
- The minimum height of the two lines

Using two pointers:
1. Start from both ends of the array
2. Calculate the area
3. Move the pointer pointing to the shorter line
4. Track the maximum area

This avoids checking all pairs.

---

## 💻 Java Solution

```java
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
