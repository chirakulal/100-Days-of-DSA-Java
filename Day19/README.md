# Day 19 – Longest Common Prefix

## 📌 Problem
Find the longest common prefix string amongst an array of strings.

## 🧠 Approach
1. Initialize prefix as the first string.
2. Compare prefix with each subsequent string.
3. Reduce the prefix until it matches the start of the current string.
4. Return the final prefix.

## ⏱ Complexity
- Time: O(n × m)
- Space: O(1)

## 💻 Java Solution
```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
