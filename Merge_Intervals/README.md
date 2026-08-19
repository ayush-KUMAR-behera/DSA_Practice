# Merge_Intervals

## Problems Solved

### Merge Intervals

Approach:

- Sort intervals by their starting value.
- Keep track of the current start and end.
- If the next interval overlaps, update the end.
- Otherwise, add the current interval to the result and start a new interval.
- Add the final interval after traversal.

Time Complexity: O(n log n)
Space Complexity: O(n)

Pattern: Merge_Intervals

### Insert Interval

Approach:
- Process intervals before the new interval.
- Merge all overlapping intervals.
- Add the merged interval.
- Add the remaining intervals.

Time Complexity: O(n)

Space Complexity: O(n)

Pattern: Merge_Intervals