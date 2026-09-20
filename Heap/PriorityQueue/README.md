# Heap / Priority Queue

## Problems & Practice

- Priority Queue as Min Heap
- Priority Queue as Max Heap
- Kth Smallest Element
- Kth Largest Element

## Complexity

- Peek: O(1)
- Insert: O(log n)
- Remove: O(log n)

## Kth Smallest Element

Approach:
- Use a Max Heap of size `k`.
- Add the first `k` elements to the heap.
- For each remaining element, compare it with the heap top.
- If the current element is smaller, remove the largest element and add the current element.
- The heap top is the `k`th smallest element.

Time Complexity: O(n log k)

Space Complexity: O(k)

Pattern: Heap / Priority Queue

### Kth Largest Element

Approach:
- Use a Min Heap of size `k`.
- Add the first `k` elements to the heap.
- For each remaining element, compare it with the heap top.
- If the current element is larger, remove the smallest element and add the current element.
- The heap top is the `k`th largest element.

Time Complexity: O(n log k)

Space Complexity: O(k)

Pattern: Heap / Priority Queue