Day 41 – Remove Element

Problem: Remove all occurrences of a given value from an array in-place and return the number of remaining elements.

Example
Input:
nums = [3,2,2,3]
val = 3

Output:
2
nums = [2,2,_,_]
Approach

Use a pointer k to track the next position for a valid element.

Traverse the array.

If nums[i] != val, place it at index k and increment k.

This ensures the first k elements contain the valid values while the rest can be ignored.

Complexity

Time Complexity: O(n)

Space Complexity: O(1)

