# Day 53 – Equal Sum Grid Partition I

## Problem

Given an `m x n` grid of positive integers, determine whether it is possible to make **exactly one horizontal or vertical cut** such that:

* both resulting parts are **non-empty**
* the **sum of elements** in both parts is equal

Return `true` if such a partition exists, otherwise return `false`.

---

## Example

### Example 1

**Input:**

```java
//grid = [[1,4],[2,3]]
```

**Output:**

```java
//true
```

**Explanation:**
A horizontal cut after the first row gives:

* Top sum = `1 + 4 = 5`
* Bottom sum = `2 + 3 = 5`

So the grid can be equally partitioned.

---

### Example 2

**Input:**

```java
//grid = [[1,3],[2,4]]
```

**Output:**

```java
//false
```

**Explanation:**
No horizontal or vertical cut produces equal sums.

---

## Approach

Since only **one straight cut** is allowed, we do not need to check all possible subgrids.

We only need to check:

* **horizontal cuts** → using row sums
* **vertical cuts** → using column sums

### Steps:

1. Compute the **total sum** of the grid.
2. If the total sum is **odd**, return `false`.
3. Compute:

    * sum of each row
    * sum of each column
4. Traverse row sums and check if any prefix equals `total / 2`.
5. Traverse column sums and check if any prefix equals `total / 2`.
6. If found, return `true`; otherwise return `false`.

---

## Why This Works

A valid cut divides the grid into **two parts with equal sum**.

That means one side must always sum to:

```java
//total / 2
```

So instead of recomputing each partition repeatedly, we just check if the running sum of rows or columns reaches that target.

---

## Java Solution




---

## Complexity Analysis

* **Time Complexity:** `O(m × n)`
* **Space Complexity:** `O(m + n)`

---

## Key Takeaway

This problem looks like a partitioning problem, but the restriction of **only one straight cut** makes it much easier.

The trick is to reduce the problem into checking whether any **row prefix sum** or **column prefix sum** equals **half of the total sum**.

---
