# Day 30 – Prime Number of Set Bits in Binary Representation

## Problem
Given two integers `left` and `right`, count how many numbers in the range `[left, right]`
have a **prime number of set bits** in their binary representation.

## Key Concepts
- Binary representation
- Counting set bits
- Prime number checking

## Approach
1. Loop from `left` to `right`
2. Count the number of `1`s in each number’s binary form
3. Check if the count is prime
4. Increment result if true

## Important Notes
- `1` is **not** a prime number
- Binary conversion is only used to count set bits
- The main logic is iteration + math

## Time Complexity
- O(N log N), where N is the size of the range

## Example
Input: `left = 6, right = 10`  
Output: `4`

## Learning Outcome
This problem reinforces that understanding fundamentals
(prime numbers and counting bits) is more important than memorizing tricks.