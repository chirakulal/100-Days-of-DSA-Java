# 📌 3070. Count Submatrices with Top-Left Element and Sum ≤ k

## 🧠 Problem Summary

Given a 2D matrix `grid` and an integer `k`, count the number of submatrices:
- That include the **top-left element (0,0)**
- Whose sum is **≤ k**

---

## 🔍 Key Insight

A brute-force approach would try all submatrices → **O(n⁴)**.

But here’s the important constraint:

> Every valid submatrix must start from (0,0)

👉 So each submatrix is uniquely identified by its **bottom-right corner (i, j)**.

This reduces the problem to checking all prefix submatrices.

---

## 💡 Approach: 2D Prefix Sum

We build a prefix sum matrix `pre` where:

- `pre[i][j]` = sum of elements from `(0,0)` to `(i,j)`

### Formula


pre[i][j] = grid[i][j]
+ pre[i-1][j]
+ pre[i][j-1]
- pre[i-1][j-1]


---

## 🧪 Example


Input:
grid = [[7,6,3],
[6,6,1]]
k = 18


### Prefix Matrix


[ 7, 13, 16 ]
[13, 25, 29 ]


### Valid Submatrices (≤ 18)


7, 13, 16, 13


✅ Output: `4`

---


⏱ Complexity Analysis

Time Complexity: O(m × n)

Space Complexity: O(m × n)