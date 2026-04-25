# Two Pointer Problems

## Problems Solved:

### 1. Two Sum (Sorted Array)

**Approach:**
- Use two pointers (low, high)
- Move pointers based on sum

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

**Pattern:** Two Pointer

**Edge Cases:**
- No solution
- Negative numbers

### Remove Duplicates from Sorted Array

Approach:
- Use two pointers (i, j)
- Replace duplicates in-place

Time Complexity: O(n)
Space Complexity: O(1)

### Remove Element

Approach:
- Use two pointers (i, j)
- Overwrite unwanted values

Time Complexity: O(n)
Space Complexity: O(1)

### Move Zeroes

Approach:
- Move non-zero elements forward
- SwapElement Where is Zero

Time Complexity: O(n)  
Space Complexity: O(1)

### 3Sum

Approach:
- Sort the array
- Fix one element and use two pointers
- Skip duplicates to avoid repeated triplets

Time Complexity: O(n^2)  
Space Complexity: O(1)

### Container With Most Water

Approach:
- Use two pointers (start, end)
- Calculate area using min height
- Move pointer with smaller height

Time Complexity: O(n)  
Space Complexity: O(1)

### Merge Sorted Array

Approach:
- Use three pointers (i, j, k)
- Compare elements from both arrays
- Insert smaller element into result array
- Move corresponding pointer
- Copy remaining elements after one array ends

Time Complexity: O(n+m)  
Space Complexity: O(n+m)

### Best Time to Buy and Sell Stock

Approach:
- Track minimum price so far
- Calculate profit at each step
- Keep maximum profit

Time Complexity: O(n)  
Space Complexity: O(1)

