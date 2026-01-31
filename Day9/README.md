# Day 09 – Missing Number

## 📌 Problem
Given an array containing `n` distinct numbers taken from the range `0` to `n`, find the one number that is missing from the array.

🔗 LeetCode: Missing Number

---

## 🧠 Approach
The numbers are supposed to be from `0` to `n`.

1. Calculate the expected sum using the formula:
   n × (n + 1) / 2
2. Calculate the actual sum of elements in the array
3. The difference between expected sum and actual sum is the missing number

This approach avoids sorting and extra space.

---

## 💻 Java Solution

check the file
