# Day 46 – Add Two Numbers

## 📌 Problem

Two linked lists represent two non-negative integers.
Digits are stored in **reverse order**, and each node contains a single digit.

Add the two numbers and return the sum as a linked list.

LeetCode Problem #2

---

## 🔹 Example

Input
l1 = [2,4,3]
l2 = [5,6,4]

Output
[7,0,8]

Explanation
342 + 465 = 807

---

## 💡 Approach

1. Traverse both linked lists simultaneously.
2. Add the values of nodes along with the carry.
3. Create a new node with `(sum % 10)`.
4. Update carry using `(sum / 10)`.
5. Continue until both lists and carry are exhausted.

---

## ⏱ Complexity

Time Complexity: **O(max(m, n))**
Space Complexity: **O(max(m, n))**

---

## 🧑‍💻 Language Used

Java
