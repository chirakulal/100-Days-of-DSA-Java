# Day 13 – Majority Element (DSA Challenge)

## 📌 Problem
Given an array of size `n`, find the element that appears **more than n/2 times**.
The problem guarantees that such an element always exists.

---

## 🧠 Key Insight
If one element appears more than all others combined, then:
- Different elements can cancel each other
- The majority element will always remain

This leads to the **Boyer–Moore Voting Algorithm**.

---

## ✅ Approach: Boyer–Moore Voting Algorithm

1. Assume the first element is the candidate
2. Increase count if the same element appears
3. Decrease count if a different element appears
4. If count becomes 0, choose a new candidate
5. Final candidate is the majority element

---

## 💻 Java Code

```java

