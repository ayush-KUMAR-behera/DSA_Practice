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

### Minimum Subarray

Approach:

Maintain minimum subarray sum ending at current index (bestEnd)
For each element:
Start a new subarray from current element
Or extend previous subarray
Choose the minimum of both options
Track overall minimum sum found

Time Complexity: O(n)
Space Complexity: O(1)

# Maximum Product Subarray

Approach:

Maintain maximum product ending at current index (maxEnd)
Maintain minimum product ending at current index (minEnd)
For each element:
Start a new subarray
Extend previous maximum product
Extend previous minimum product
Update global maximum product

Time Complexity: O(n)