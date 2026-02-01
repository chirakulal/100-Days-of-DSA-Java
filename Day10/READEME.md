# Day 10 – Find All Numbers Disappeared in an Array

## 📌 Problem
Given an array of size `n` where elements are in the range `1` to `n`,
some numbers appear twice and others are missing.
Return all the missing numbers.

🔗 LeetCode: Find All Numbers Disappeared in an Array

---

## 🧠 Approach
Since all numbers are between `1` and `n`, each value can be mapped to an index.

1. Traverse the array and mark the index corresponding to each value as negative
2. Traverse the array again
3. Indices with positive values represent missing numbers

This approach uses the input array itself for marking.

---

## 💻 Java Solution

```java
