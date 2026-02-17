# Day 26 – Valid Palindrome II

## 📌 Problem
Given a string `s`, return true if the string can be a palindrome after deleting
at most one character. Otherwise, return false.

### Examples
Input: "abca"  
Output: true

Input: "abcda"  
Output: false

---

## 🧠 Approach

This problem is solved using the two-pointer technique.

Steps:
1. Use two pointers starting from the beginning and end of the string.
2. If characters match, move both pointers inward.
3. On mismatch, try skipping either:
    - the left character
    - the right character
4. If either option results in a valid palindrome, return true.
5. If more than one deletion is required, return false.

A helper function is used to check palindrome within a given range.

---

## 💻 Java Solution

```java

