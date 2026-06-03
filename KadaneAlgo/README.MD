# Kaden Algorithm

## Problem Solved

### Maximum Subarray

Approach:

Maintain maximum subarray sum ending at current index (bestEnd)
For each element:
Start a new subarray from current element
Or extend previous subarray
Choose the maximum of both options
Track overall maximum sum found

Time Complexity: O(n)
Space Complexity: O(1)