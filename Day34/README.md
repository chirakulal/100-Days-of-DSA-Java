# Day 34 – Search a 2D Matrix

## 📌 Problem
Given a 2D matrix where each row is sorted and the first element of each row
is greater than the last element of the previous row, determine whether a
target value exists in the matrix.

---

## 🧠 Approach

- Treat the 2D matrix as a virtual 1D sorted array
- Apply Binary Search on the index range `0` to `(rows × cols - 1)`
- Convert mid index to row and column using:
    - `row = mid / cols`
    - `col = mid % cols`

---

## 💻 Java Solution

```java
