# Recursion

## Problems & Practice

- Sum of Natural Numbers
- Maximum Number in Array
- Factorial

### Sum of Natural Numbers

Approach:
- Use recursion to calculate `n + sum(n - 1)`.
- Base case: when `n == 1`, return `1`.
- Continue until the base case is reached.

Time Complexity: O(n)

Space Complexity: O(n)

Pattern: Recursion


### Maximum Number in Array

Approach:
- Recursively find the maximum value in the first `n - 1` elements.
- Compare it with the last element.
- Return the larger value.
- Base case: when `n == 1`, return the first element.

Time Complexity: O(n)

Space Complexity: O(n)

Pattern: Recursion


### Factorial

Approach:
- Use recursion to calculate `n * factorial(n - 1)`.
- Base case: when `n == 1`, return `1`.
- Continue until the base case is reached.

Time Complexity: O(n)

Space Complexity: O(n)

Pattern: Recursion