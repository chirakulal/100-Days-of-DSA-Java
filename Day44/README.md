Day 43 – Minimum Number of Flips to Make the Binary String Alternating 🔄
📌 Problem

Find the minimum number of flips required to make a binary string alternating.

LeetCode #1888

🧠 Problem Statement

Given a binary string s, you can perform two operations:

Move the first character of the string to the end.

Flip any character (0 → 1 or 1 → 0).

Return the minimum number of flips required to make the string alternating.

An alternating string has no two adjacent characters equal.

🔹 Example

Input:

111000

Output:

2
💡 Approach

An alternating string can only have two patterns:

010101...

101010...

Since rotations are allowed, create a new string:

s2 = s + s

Generate both alternating patterns.

Use a sliding window of size n to simulate every rotation.

Count mismatches with both patterns and track the minimum flips.

💻 Java Code
