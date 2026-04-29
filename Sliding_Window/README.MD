# Sliding Window

## Problem Solved

### Max Sum Subarray of Size K
Approach:
Calculate sum of first window of size k
Slide the window:
Remove left element
Add next element
Track maximum sum

Time Complexity: O(n)
Space Complexity: O(1)

### Minimum Size Subarray Sum
Approach:
Use two pointers (low, high)
Expand window by increasing high
When sum ≥ target:
Update minimum length
Shrink window from left
Repeat until end

Time Complexity: O(n)
Space Complexity: O(1)

### Longest Substring with K Unique Characters
Approach:
- Use two pointers (low, high)
- Maintain frequency map
- Expand window
- Shrink when unique characters exceed k
- Track max length when size == k

Time Complexity: O(n)  
Space Complexity:O(n)

