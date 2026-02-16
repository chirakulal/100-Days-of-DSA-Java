# Day 25 – String Compression

## 📌 Problem
Given a character array, compress it in-place by replacing consecutive
repeating characters with the character followed by its count.

Return the new length of the compressed array.

### Example
Input:
['a','a','b','b','c','c','c']

Output:
['a','2','b','2','c','3']

---

## 🧠 Approach

This problem is solved using two pointers:

- Read pointer: scans the input array
- Write pointer: writes the compressed result back into the same array

Steps:
1. Count consecutive occurrences of a character
2. Write the character once
3. Write the count only if it is greater than 1
4. Move pointers accordingly

This ensures in-place compression with no extra space.

---

## 💻 Java Solution

```java

