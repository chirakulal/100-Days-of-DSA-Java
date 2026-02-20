# Day 29 – Maximum Average Subarray I

## 📌 Problem
Given an integer array `nums` and an integer `k`, find the maximum
average value of any contiguous subarray of length `k`.

---

## 🧠 Approach (Sliding Window)

- Compute the sum of the first `k` elements
- Slide the window across the array:
    - Add the new element entering the window
    - Subtract the element leaving the window
- Track the maximum sum found
- Divide the maximum sum by `k` to get the maximum average

This avoids recalculating sums from scratch.

---

## 💻 Java Solution

```java
