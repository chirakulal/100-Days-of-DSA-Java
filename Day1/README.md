# Day 01 – Best Time to Buy and Sell Stock

**Platform:** LeetCode  
**Difficulty:** Easy  
**Language:** Java

---

## 🧠 Problem Summary
Given an array where each element represents the stock price on a given day, find the maximum profit that can be achieved by buying on one day and selling on another future day.

---

## 💡 Approach
- Maintain the minimum price encountered so far.
- At each step, calculate the profit if sold on that day.
- Update the maximum profit accordingly.
- Single-pass greedy approach.

---

## ⏱️ Complexity
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

## ✅ Key Learning
Optimization can often be achieved by tracking key values instead of checking all combinations.
