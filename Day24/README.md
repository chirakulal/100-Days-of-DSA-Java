# Day 24 – First Unique Character in a String

## 📌 Problem
Given a string `s`, return the index of the first non-repeating character.
If no such character exists, return `-1`.

### Examples
Input: "leetcode"  
Output: 0

Input: "loveleetcode"  
Output: 2

Input: "aabb"  
Output: -1

---

## 🧠 Approach

This problem is solved using a two-pass strategy:

### Step 1 – Count Frequency
Count how many times each character appears using an array of size 26.

### Step 2 – Find First Unique
Traverse the string again and return the index of the first character
whose frequency is exactly 1.

This separation ensures correctness because we must know the final
frequency before deciding uniqueness.

---

## 💻 Java Solution

```java

