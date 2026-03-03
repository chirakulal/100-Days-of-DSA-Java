# Day 40 – Maximum Consecutive Ones 📊

## 📌 Problem
Find the maximum number of consecutive 1’s in a binary array.

LeetCode #485

---

## 🧠 Problem Statement

Given a binary array `nums`, return the maximum number of consecutive 1's in the array.

---

## 🔹 Example

Input:
[1,1,0,1,1,1]

Output:
3

---

## 💡 Approach

1. Initialize two variables:
    - `count` → current streak of 1’s
    - `max` → maximum streak found so far

2. Traverse the array:
    - If element is `1` → increment `count`
    - Update `max`
    - If element is `0` → reset `count` to 0

3. Return `max`

---

## 💻 Java Code

```java
