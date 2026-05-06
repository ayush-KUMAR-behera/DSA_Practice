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

### Ransom Note

Approach:
Use HashMap to store frequency of characters in ransomNote
Use another HashMap to store frequency of characters in magazine
Traverse ransomNote
For each character:
Check if it exists in magazine
Check if required frequency ≤ available frequency
If any character fails → return false
Otherwise → return true

Time Complexity: O(n + m)
Space Complexity: O(n + m)

### Maximum Number of Balloons

Approach:
Use HashMap to store frequency of characters in the input string
Store required frequency of characters for the word "balloon"
For each required character:
Divide available frequency by required frequency
Take the minimum value among all characters
Return that minimum as result

Time Complexity: O(n)
Space Complexity: O(1)

### Longest Palindrome
Approach:
Use HashMap to store frequency of each character
Traverse frequency values

Add all even frequencies directly
For odd frequencies:
Add frequency - 1 (pair contribution)
Track if any odd frequency exists
If odd exists → add 1 at the end for center character

Time Complexity: O(n)
Space Complexity: O(1)