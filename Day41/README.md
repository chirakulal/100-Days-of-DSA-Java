# Day 41 – 3Sum (Medium) 🔥

## 📌 Problem
Find all unique triplets in the array which gives the sum of zero.

LeetCode #15

---

## 🧠 Problem Statement

Given an integer array `nums`, return all the triplets
[nums[i], nums[j], nums[k]] such that:

nums[i] + nums[j] + nums[k] == 0

Conditions:
- No duplicate triplets
- Indices must be different

---

## 🔹 Example

Input:
[-1,0,1,2,-1,-4]

Output:
[[-1,-1,2],[-1,0,1]]

---

## 💡 Approach

1. Sort the array.
2. Fix one element using a loop.
3. Use two pointers (left & right) to find the remaining two numbers.
4. Skip duplicates carefully.
5. Move pointers based on sum comparison.

---

## 💻 Java Code

```java

