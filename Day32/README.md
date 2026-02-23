# Day 32 – Check If a String Contains All Binary Codes of Size K

## 📌 Problem
Given a binary string `s` and an integer `k`, return `true` if every
binary code of length `k` appears as a substring of `s`.

---

## 🧠 Approach

- The total number of binary codes of length `k` is `2^k`
- Slide a window of size `k` across the string
- Store each substring in a `HashSet`
- If the set size reaches `2^k`, all codes exist

---

## 💻 Java Solution

```java
