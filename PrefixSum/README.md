# Prefix Sum

## Problems Solved

### Find Pivot Index

Approach:
- Calculate the total sum of the array.
- Maintain `left` sum while traversing the array.
- Calculate `right` sum as `totalSum - left - currentElement`.
- If left sum equals right sum, return the current index.
- If no pivot index exists, return `-1`.

Time Complexity: O(n)
Space Complexity: O(1)

Pattern: Prefix Sum