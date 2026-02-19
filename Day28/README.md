# Day 28 – Implement strStr()

## 📌 Problem
Given two strings `haystack` and `needle`, return the index of the first
occurrence of `needle` in `haystack`.  
If `needle` does not exist, return `-1`.

---

## 🧠 Approach

- Slide the `needle` over the `haystack`
- For each position, compare characters one by one
- If all characters match, return the starting index
- If no match is found, return `-1`

This is a brute-force string matching approach that builds the base
for more optimized algorithms.

---

## 💻 Java Solution

```java

