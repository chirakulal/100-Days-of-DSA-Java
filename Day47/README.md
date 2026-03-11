# Day 47 – Longest Palindromic Substring

## Problem

Given a string `s`, return the longest palindromic substring in `s`.

A palindrome is a string that reads the same forward and backward.

## Example

Input:
babad

Output:
bab

Note: "aba" is also a valid answer.

## Approach

Instead of checking all substrings, expand around each character as the center of a palindrome.

For each index:

* Check odd length palindrome `(i, i)`
* Check even length palindrome `(i, i+1)`

Update the longest palindrome found.

## Complexity

Time Complexity: O(n²)
Space Complexity: O(1)

## Key Learning

Expanding around the center is a much more efficient approach than brute force substring checking.
