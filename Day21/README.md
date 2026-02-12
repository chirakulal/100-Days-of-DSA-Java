# Day 21 – Valid Parentheses

## 📌 Problem
Given a string containing only:
() {} []

Return true if:
- Every opening bracket has a matching closing bracket
- Brackets are closed in correct order
- No extra unmatched brackets remain

Example:
Input: "()[]{}"
Output: true


Input: "(]"
Output: false

---

## 🧠 Approach

Use a stack to track opening brackets.

Steps:
1. Traverse each character.
2. If it is an opening bracket → push to stack.
3. If it is a closing bracket:
    - If stack is empty → return false.
    - Pop top element and check if it matches.
4. After traversal, stack must be empty.

---

## 💻 Java Solution

```java
import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
    
