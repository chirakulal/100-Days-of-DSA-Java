# Day 42 – Minimum Changes To Make Alternating Binary String 🔄

## 📌 Problem
Given a binary string `s` consisting of only `0` and `1`, return the **minimum number of operations** required to make the string alternating.

LeetCode #1758

---

## 🧠 Problem Understanding

A string is **alternating** if no two adjacent characters are the same.

Valid examples:
010101
101010


Example:

Input:

s = "0100"


Possible alternating strings:


0101
1010


Output:

1


Explanation:


0100
0101
^


Only **one change** is needed.

---

## 💡 Approach

There are only **two possible alternating patterns**:


Pattern 1 → 010101...
Pattern 2 → 101010...


### Steps:

1. Traverse the string.
2. Assume the string should follow **Pattern 1 (0101...)**.
3. Count mismatches between the string and this pattern.
4. If mismatches for Pattern 1 = `count`,  
   then mismatches for Pattern 2 = `n - count`.
5. Return the **minimum** of both.

---

## 💻 Java Code

```java
