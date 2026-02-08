# Day 17 – Valid Palindrome

## 📌 Problem
Check whether a given string is a palindrome after ignoring non-alphanumeric characters and case differences.

🔗 Platform: LeetCode  
💻 Language: Java

---

## 🧠 Approach

1. Remove non-alphanumeric characters using regex.
2. Convert the string to lowercase.
3. Use the two-pointer technique:
    - Compare characters from start and end.
    - Move pointers inward until mismatch or completion.

---

## ⏱ Complexity

- Time Complexity: O(n)
- Space Complexity: O(1) (Two-pointer approach)

---

## 💻 Java Solution

```java

