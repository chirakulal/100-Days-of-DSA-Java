# LeetCode 1784 – Check if Binary String Has at Most One Segment of Ones

## Problem
Given a binary string `s` without leading zeros, return `true` if it contains **at most one contiguous segment of ones**, otherwise return `false`.

### Example

Input:s = "1001"
Output:false


Explanation: Ones appear in multiple segments.

Input:s = "110"
Output:true


## Approach

The goal is to verify that all `1`s appear in a single continuous block.

Steps:
1. Traverse the string.
2. Once a `0` is found after `1`, mark it.
3. If another `1` appears after that `0`, return `false`.

If the loop finishes without this condition, return `true`.


Complexity
Time Complexity: O(n)
Space Complexity: O(1)

Key Insight

A valid string must follow the pattern:

111...11000...00

If another 1 appears after a 0, it means a second segment of ones exists.

## Java Solution

```java

