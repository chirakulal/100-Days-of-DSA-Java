# Day 37 – Linked List Cycle 🔁

## 📌 Problem
Determine whether a linked list has a cycle.

LeetCode #141

---

## 🧠 Problem Statement

Given the head of a linked list, return:

- `true` → if there is a cycle
- `false` → otherwise

A cycle exists if some node’s `next` pointer connects back to a previous node.

---

## 💡 Approach – Floyd’s Cycle Detection Algorithm

We use two pointers:

- `slow` → moves 1 step at a time
- `fast` → moves 2 steps at a time

### Why it works:

- If there is **no cycle**, fast pointer reaches `null`.
- If there **is a cycle**, fast eventually catches slow.

---

## 💻 Java Solution

```java
