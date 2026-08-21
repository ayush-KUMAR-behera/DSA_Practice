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

### Interval List Intersections

Approach:
- Use two pointers for both interval lists.
- Find overlap using:
  - Start = max(start1, start2)
  - End = min(end1, end2)
- If start <= end, an intersection exists.
- Move the pointer of the interval that ends first.

Time Complexity: O(n + m)

Space Complexity: O(k)

Pattern: Merge_Intervals

### Overlapping Intervals

Approach:
- Sort intervals by start time.
- Compare each interval with the previous interval.
- If current start <= previous end, an overlap exists.
- If no overlap is found, return false.

Time Complexity: O(n log n)

Space Complexity: O(1)

Pattern: Merge_Intervals

### Meeting Rooms

Approach:
- Sort start times and end times separately.
- Use two pointers to process meetings chronologically.
- If a meeting starts before the earliest meeting ends, allocate a new room.
- Otherwise, free a room and move the end pointer.
- Track the maximum number of rooms required.

Time Complexity: O(n log n)

Space Complexity: O(1)

Pattern: Merge_Intervals