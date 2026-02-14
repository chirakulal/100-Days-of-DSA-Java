# Day 23 – Longest Repeating Character Replacement

## 📌 Problem
Given a string `s` consisting of uppercase English letters and an integer `k`, you can replace at most `k` characters.

Return the length of the longest substring that can be made of the same character after at most `k` replacements.

Example:
Input: s = "ABAB", k = 2  
Output: 4

Input: s = "AABABBA", k = 1  
Output: 4

---

## 🧠 Approach – Sliding Window

We maintain:
- `left` pointer
- `right` pointer
- Frequency array of size 26
- `maxFreq` → highest frequency in current window

### Valid Window Condition:

windowSize - maxFreq ≤ k

If this condition fails:
- Shrink the window from the left

---

## 💻 Java Solution

```java
