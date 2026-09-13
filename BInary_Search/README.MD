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

### Find First and Last Occurrence in Array

Approach:
- Use Binary Search to find the first occurrence.
- When target is found, store the index and continue searching left.
- Use Binary Search again to find the last occurrence.
- When target is found, store the index and continue searching right.
- Return `[-1, -1]` if the target is not present.

Time Complexity: O(log n)

Space Complexity: O(1)

Pattern: Binary Search

### Peak in Mountain Array

Approach:
- Use Binary Search on the mountain array.
- If `arr[mid] < arr[mid + 1]`, move to the right half.
- Otherwise, move to the left half including `mid`.
- The final `low` position is the peak index.

Time Complexity: O(log n)

Space Complexity: O(1)

Pattern: Binary Search

### Find Minimum in Rotated Sorted Array

Approach:
- Use Binary Search on the rotated sorted array.
- Compare `arr[mid]` with `arr[high]`.
- If `arr[mid] > arr[high]`, the minimum lies in the right half.
- Otherwise, the minimum lies at `mid` or in the left half.
- When `low == high`, `arr[low]` is the minimum.

Time Complexity: O(log n)

Space Complexity: O(1)

Pattern: Binary Search

### Search in Rotated Sorted Array

Approach:
- Use Binary Search on the rotated sorted array.
- Identify which half of the array is sorted.
- Check whether the target lies within the sorted half.
- If it does, search that half; otherwise, search the other half.
- Return `-1` if the target is not found.

Time Complexity: O(log n)

Space Complexity: O(1)

Pattern: Binary Search

### Koko Eating Bananas

Approach:
- Use Binary Search on the eating speed.
- `low = 1` and `high = maximum pile size`.
- Calculate the total hours needed at the current speed.
- If required hours are greater than `h`, increase the speed.
- Otherwise, store the speed and search for a smaller valid speed.

Time Complexity: O(n log m)

Space Complexity: O(1)

Pattern: Binary Search 