# Day 22 – Longest Substring Without Repeating Characters

## 📌 Problem
Given a string `s`, find the length of the longest substring without repeating characters.

Example:
Input: "abcabcbb"
Output: 3

Input: "bbbbb"
Output: 1

---

## 🧠 Approach – Sliding Window

We use two pointers:
- `left` pointer
- `right` pointer

Steps:
1. Expand window by moving `right`.
2. If duplicate appears:
    - Remove characters from the left until duplicate is removed.
3. Update maximum length at every step.

This ensures each character is added and removed at most once.

---

## 💻 Java Solution

```java


