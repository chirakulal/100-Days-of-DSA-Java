# 📌 3567. Minimum Absolute Difference in Sliding Submatrix

## 🧠 Problem Summary

Given an `m x n` integer matrix `grid` and an integer `k`, for every contiguous `k x k` submatrix, compute the minimum absolute difference between any two **distinct** values in that submatrix.

Return a 2D matrix `ans` where `ans[i][j]` represents the result for the submatrix starting at `(i, j)`.

If all elements in a submatrix are the same, the answer is `0`.

---

## 🔍 Key Insight

A brute-force approach for each submatrix would compare every pair of elements, which is unnecessary.

Instead:

- Only **distinct values** matter
- After sorting distinct values, the minimum absolute difference must occur between **adjacent elements**

So for each `k x k` submatrix:
1. Collect all elements
2. Store them in a `TreeSet` to remove duplicates and keep them sorted
3. Scan adjacent values to find the minimum difference

---

## 💡 Approach

For every valid top-left corner `(i, j)`:

- Build a `TreeSet<Integer>`
- Insert all values from the current `k x k` submatrix
- If the set has size `0` or `1`, answer is `0`
- Otherwise, iterate through the sorted set and compute the minimum difference between consecutive elements

---

## ✅ Java Solution

```java
