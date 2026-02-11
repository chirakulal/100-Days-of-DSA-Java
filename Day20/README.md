# Day 20 – Valid Anagram

## 📌 Problem
Given two strings `s` and `t`, return true if `t` is an anagram of `s`.

An anagram contains:
- Same characters
- Same frequency
- Order does not matter

Example:
Input: s = "rat", t = "tar"  
Output: true

---

## 🧠 Approach

Instead of sorting both strings (O(n log n)), we use a frequency array of size 26.

Steps:
1. If lengths are different → return false
2. Create an integer array of size 26
3. Increment count for characters in first string
4. Decrement count for characters in second string
5. If all values are zero → strings are anagrams

---

## 💻 Java Solution

```java
