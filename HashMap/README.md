# HashMap Problems

## Problems Solved:

###  Contains Duplicate
Approach:
Traverse the array
Store elements in a HashSet
If element already exists → duplicate found
Alternatively, use HashMap to store frequency
If frequency becomes greater than 1 → duplicate exists

Time Complexity: O(n)
Space Complexity: O(n)

Key Insight:
- HashSet is preferred for existence check
- HashMap is useful when frequency tracking is needed

### First Unique Character in a String
Approach:
Use HashMap to store frequency of each character
Traverse string and build frequency map
Traverse string again
Return index of first character with frequency = 1
If no unique character → return -1

Time Complexity: O(n)
Space Complexity: O(n)
