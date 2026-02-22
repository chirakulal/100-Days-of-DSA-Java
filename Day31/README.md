## Day 31 – Binary Gap

### Problem
Given a positive integer `n`, find the maximum distance between two **consecutive 1s** in its binary representation.  
If fewer than two `1`s exist, return `0`.

### Key Insight
- “Adjacent 1s” means consecutive `1`s in order
- `0`s may exist between them
- No other `1` should be in between

### Approach
- Scan the number bit by bit
- Track the position of the previous `1`
- Compute distance with the current `1`
- Maintain the maximum gap

### Example
n = 22
Binary = 10110
Positions of 1s = [1, 2, 4]
Max gap = 2


### Complexity
- Time: O(number of bits)
- Space: O(1)

### Learning
This problem emphasized how precise interpretation of constraints is critical in DSA.

