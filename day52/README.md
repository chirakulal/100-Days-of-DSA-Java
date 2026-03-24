# Day 52 – Construct Product Matrix

## LeetCode 2906: Construct Product Matrix

### Problem Statement
Given a matrix, construct another matrix where each cell contains the product of all other elements except itself, modulo `12345`.

---

## Approach

A division-based method is not safe here because modulo `12345` does not guarantee a valid modular inverse for every number.

So, the solution uses:

- **Prefix product** → product of all elements before the current index
- **Suffix product** → product of all elements after the current index

Then:


answer[i] = prefix[i] * suffix[i] % 12345
Why This Works

For every position, the required product is:

all elements on the left
multiplied by all elements on the right

Prefix stores the left contribution, and suffix stores the right contribution.

## Complexity Analysis
Time Complexity: O(n * m)
Space Complexity: O(n * m)

```java