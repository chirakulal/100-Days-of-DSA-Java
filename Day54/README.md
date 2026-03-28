# 🚀 Day 54 – Find the String with LCP

## 📌 Problem Statement

Given an `n x n` **LCP matrix**, reconstruct the **lexicographically smallest string** `word` such that:

- `lcp[i][j]` represents the **length of the longest common prefix**
- between suffixes `word[i...n-1]` and `word[j...n-1]`

Return the valid string if possible, otherwise return an empty string `""`.

---

## 🧠 Intuition

The key observation is:

> If `lcp[i][j] > 0`, then `word[i] == word[j]`

Because if two suffixes share at least one character in common prefix,  
their starting characters must be the same.

So the problem can be solved in **2 main steps**:

1. **Construct** the smallest possible string greedily
2. **Verify** whether the constructed string matches the given LCP matrix

---

## ✅ Approach

### **Step 1: Construct the String**
- Start assigning characters from `'a'`
- If `lcp[i][j] > 0`, then positions `i` and `j` must have the same character
- Greedily assign characters to make the string **lexicographically smallest**

### **Step 2: Verify Using DP**
After constructing the string, rebuild the actual LCP matrix using:

```java
//if (word[i] == word[j]) {
//    dp[i][j] = 1 + dp[i + 1][j + 1];
//} else {
//    dp[i][j] = 0;
//}
```

Then compare it with the given matrix.

If any value mismatches → return `""`

---

## 💻 Java Solution

```java

```

---

## 🔍 Example

### **Input**
```java
//lcp = [[4,0,2,0],
//       [0,3,0,1],
//       [2,0,2,0],
//       [0,1,0,1]]
```

### **Output**
```java
//"abab"
```

### **Explanation**
- `lcp[0][2] = 2` → positions `0` and `2` must match
- `lcp[1][3] = 1` → positions `1` and `3` must match

So the smallest valid string becomes:

```java
//"abab"
```

---

## ⚠️ Why Verification is Necessary

Constructing a string based only on character matching is **not enough**.

For example:

```java
//lcp[3][3] = 3
```

This is impossible if the suffix starting at index `3` has length only `1`.

So we must **rebuild and validate** the LCP matrix completely.

---

## ⏱️ Complexity Analysis

### **Time Complexity**
- Constructing string → `O(n²)`
- Building DP LCP matrix → `O(n²)`
- Validation → `O(n²)`

✅ **Overall:** `O(n²)`

### **Space Complexity**
- DP matrix → `O(n²)`

✅ **Overall:** `O(n²)`

---

## 📚 Key Takeaway

This problem is a great example of:

- **Greedy Construction**
- **String Grouping**
- **Dynamic Programming**
- **Validation-based Problem Solving**

> Build the answer first, then verify whether it is truly valid.

---



