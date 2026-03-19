# 📌 3212. Count Submatrices With Equal Frequency of X and Y

## 🧠 Problem Summary

Given a 2D grid containing `'X'`, `'Y'`, and `'.'`, count submatrices that:
- Include the top-left cell `(0,0)`
- Have equal number of `'X'` and `'Y'`
- Contain **at least one `'X'`**

---

## 🔍 Key Insight

A naive solution would try all submatrices → **O(n⁴)**.

But since every valid submatrix must include `(0,0)`:
👉 Each submatrix is uniquely defined by its bottom-right corner `(i, j)`

---

## 💡 Transformation Trick

Instead of counting `'X'` and `'Y'` separately:

- `'X' → +1`
- `'Y' → -1`
- `'.' → 0`

Now:
> Equal number of X and Y ⟺ sum = 0

---

## ⚠️ Important Condition

Sum = 0 is not enough.

Example:
Sum = 0 but no `'X'` present ❌

👉 So we must also ensure:
- At least one `'X'` exists

---

## 💡 Approach

We maintain two prefix matrices:

1. `sum[i][j]` → balance of X and Y
2. `countX[i][j]` → number of X

For each cell `(i, j)`:
- If `sum[i][j] == 0`
- AND `countX[i][j] > 0`

👉 Count it as valid

---

## 🧪 Example


Input:
grid = [["X","Y","."],
["Y",".","."]]


Converted:

1 -1 0
-1 0 0


Valid submatrices = 3

---

## Complexity

Time: O(m × n)

Space: O(m × n)