# Day 14 – Single Number (Bit Manipulation)

## 📌 Problem
Given a non-empty array of integers, every element appears twice except for one.
Find that single one.

🔗 LeetCode: Single Number

---

## 🧠 Approach
Instead of using extra space to count frequencies, this solution uses the XOR operator.

### XOR Properties:
- `x ^ x = 0`
- `x ^ 0 = x`
- XOR is commutative and associative

When all duplicate numbers cancel each other out, the unique number remains.

---

## 💻 Java Solution

```java

