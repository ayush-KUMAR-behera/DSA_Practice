# Prefix Sum

## Problems Solved

### Find Pivot Index

Approach:
- Calculate the total sum of the array.
- Maintain `left` sum while traversing the array.
- Calculate `right` sum as `totalSum - left - currentElement`.
- If left sum equals right sum, return the current index.
- If no pivot index exists, return `-1`.

Time Complexity: O(n)
Space Complexity: O(1)

Pattern: Prefix Sum

### Subarray Sum Equals K

Approach:
- Maintain a running prefix sum.
- Store prefix sum frequencies in a HashMap.
- For each element, calculate `prefixSum - k`.
- If it exists in the map, add its frequency to the count.
- Store the current prefix sum in the HashMap.

Time Complexity: O(n)
Space Complexity: O(n)

Pattern: Prefix Sum + HashMap

### Subarray Sums Divisible by K

Approach:
- Maintain a running prefix sum.
- Calculate the remainder `sum % k`.
- Normalize negative remainders by adding `k`.
- Store the frequency of each remainder in a HashMap.
- If the same remainder appeared before, a subarray divisible by `k` exists.
- Add its frequency to the answer.

Time Complexity: O(n)
Space Complexity: O(k)

Pattern: Prefix Sum + HashMap

### Contiguous Array

Approach:
- Count the number of `0`s and `1`s while traversing the array.
- Calculate `diff = ones - zeros`.
- If `diff == 0`, the subarray from index `0` to current index has equal `0`s and `1`s.
- Store the first index where each `diff` occurs.
- If the same `diff` appears again, the elements between those indices contain equal `0`s and `1`s.
- Track the maximum length.

Time Complexity: O(n)
Space Complexity: O(n)


Pattern: Prefix Sum + HashMap