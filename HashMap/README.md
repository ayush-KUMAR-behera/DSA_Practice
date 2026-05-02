# HashMap Problems

## Problems Solved:

###  Contains Duplicate
Approach (Using HashSet):
- Traverse the array
- Store elements in a HashSet
- If element already exists → duplicate found

Approach (Using HashMap):
- Store element frequency in HashMap
- If frequency becomes greater than 1 → duplicate exists

Time Complexity: O(n)
Space Complexity: O(n)

Key Insight:
- HashSet is preferred for existence check
- HashMap is useful when frequency tracking is needed
