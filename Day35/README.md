# Day 35 — Koko Eating Bananas 🍌

## Problem
Given banana piles and limited hours `h`, find the **minimum eating speed** `k` such that all bananas are eaten in time.

---

## Key Insight
This is **Binary Search on Answer Space**, not a normal array search.

- Minimum speed = 1
- Maximum speed = max pile size
- If a speed works, all higher speeds also work → monotonic condition

---

## Approach
1. Set search range between `1` and `maxPile`
2. For each mid speed:
    - Calculate total hours needed
3. If hours ≤ `h`, try smaller speed
4. Else, increase speed

---

## Complexity
- **Time Complexity**: `O(n log maxPile)`
- **Space Complexity**: `O(1)`

---

## Learning Outcome
- Binary Search applies beyond sorted arrays
- Correct boundaries are as important as the logic
- Always check for monotonic behavior before brute force

---

## Status
✅ Solved  
📘 Language: Java  