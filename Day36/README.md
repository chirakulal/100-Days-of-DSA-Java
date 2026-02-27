# Day 36 – Reverse Linked List 🔁

## 📌 Problem
Reverse a singly linked list and return the new head.

LeetCode #206

---

## 🧠 Problem Understanding

Given a linked list:

1 → 2 → 3 → 4 → 5 → null

Return:

5 → 4 → 3 → 2 → 1 → null

The goal is to reverse the direction of the `next` pointers.

---

## 💡 Approach (Iterative – Optimal)

We use **three pointers**:

- `prev` → tracks the reversed part
- `current` → node being processed
- `next` → temporarily stores the next node

### Algorithm Steps

1. Store `current.next` in `next`
2. Reverse the pointer (`current.next = prev`)
3. Move `prev` to `current`
4. Move `current` to `next`
5. Repeat until `current == null`

---

## 💻 Java Implementation

```java
