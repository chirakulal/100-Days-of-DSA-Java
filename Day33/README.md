# Day 33 – Binary Search

## 📌 Problem
Given a sorted array `nums` and a target value, return the index of the target
if it exists. Otherwise, return `-1`.

---

## 🧠 Approach

Binary Search works by repeatedly dividing the search space in half.

Steps:
1. Initialize `left` and `right` pointers
2. Find the middle index
3. Compare middle element with target
4. Eliminate half of the array based on comparison
5. Repeat until found or search space is empty

---

## 💻 Java Solution

```java
