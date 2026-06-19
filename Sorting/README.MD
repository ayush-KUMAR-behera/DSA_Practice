# Sorting

## Problem Solved

### Selection Sort

- Approach:

Divide the array into sorted and unsorted parts
Find the minimum element from the unsorted part
Swap it with the first unsorted position
Repeat until the array is sorted

- Time Complexity:

Best Case: O(n²)
Average Case: O(n²)
Worst Case: O(n²)

Space Complexity: O(1)

Pattern: Sorting (Selection Sort)

### Bubble Sort

- Approach:

Compare adjacent elements
Swap them if they are in the wrong order
After each pass, the largest element moves to its correct position
Repeat until the array is sorted
If no swaps occur in a pass, stop early

- Time Complexity:

Best Case: O(n)
Average Case: O(n²)
Worst Case: O(n²)

Space Complexity: O(1)

Pattern: Sorting (Bubble Sort)

### Insertion Sort

Approach:

Assume the first element is already sorted
Pick the next element and insert it into its correct position in the sorted part
Shift larger elements one position to the right
Repeat until the entire array is sorted

Time Complexity:

Best Case: O(n)
Average Case: O(n²)
Worst Case: O(n²)

Space Complexity: O(1)

Pattern: Sorting (Insertion Sort)

### Merge Sort

Approach:

Divide the array into two halves
Recursively sort the left half
Recursively sort the right half
Merge the two sorted halves into a temporary array
Copy merged elements back to the original array

Time Complexity:

Best Case: O(n log n)
Average Case: O(n log n)
Worst Case: O(n log n)

Space Complexity: O(n)

Pattern: Divide and Conquer

### Quick Sort

Approach:

Choose a pivot element
Partition the array such that:
Elements smaller than pivot go to the left
Elements greater than pivot go to the right
Place pivot in its correct position
Recursively sort left and right partitions

Time Complexity:

Best Case: O(n log n)
Average Case: O(n log n)
Worst Case: O(n²)

Space Complexity: O(log n)

Pattern: Divide and Conquer