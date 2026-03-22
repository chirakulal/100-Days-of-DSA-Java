# Day 51 - Determine Whether Matrix Can Be Obtained By Rotation

## Problem
Given two `n x n` binary matrices `mat` and `target`, return `true` if it is possible to make `mat` equal to `target` by rotating `mat` in 90-degree increments. Otherwise, return `false`.

---

## Key Insight
A square matrix has only 4 possible rotation states:
- 0°
- 90°
- 180°
- 270°

That means we do not need any advanced logic beyond checking all 4 possibilities.

---

## Approach
For each possible rotation:
1. Compare `mat` with `target`
2. If they are equal, return `true`
3. Otherwise, rotate `mat` by 90° clockwise

If none of the 4 states match, return `false`.

---

## Java Solution

```java
