# Day 38 – Merge Two Sorted Lists 🔗

## 📌 Problem
Merge two sorted linked lists and return the merged sorted list.

LeetCode #21

---

## 🧠 Problem Statement

You are given two sorted linked lists.

Merge them into one sorted linked list by splicing together the nodes of the first two lists.

---

## 💡 Approach

We use:

- A **dummy node** to simplify head handling
- A **current pointer** to build the merged list

### Steps:
1. Compare values of both lists
2. Attach the smaller node
3. Move the respective pointer
4. Move `current` forward
5. Attach remaining nodes after one list ends

---

## 💻 Java Solution

```java
