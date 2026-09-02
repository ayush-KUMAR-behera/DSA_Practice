# Binary Search

## Binary Search

Approach:
- Works on a sorted array.
- Find the middle element.
- If target equals middle → return index.
- If target is smaller → search left half.
- If target is larger → search right half.
- Return `-1` if target is not found.

Time: O(log n)
Space: O(1)

Pattern: Binary Search

### Ceil in Array

Approach:
- Use Binary Search on the sorted array.
- If `arr[mid] < target`, search the right half.
- Otherwise, store `mid` as a possible ceil and search the left half.
- Return `-1` if no ceil exists.

Time Complexity: O(log n)

Space Complexity: O(1)

Pattern: Binary Search