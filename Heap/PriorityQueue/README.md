# Heap / Priority Queue

## Problems & Practice

- Priority Queue as Min Heap
- Priority Queue as Max Heap
- Kth Smallest Element
- Kth Largest Element
- Top K Frequent Elements
- Top K Frequent Words

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

### Top K Frequent Elements

Approach:
- Use a HashMap to count the frequency of each element.
- Use a Min Heap based on frequency.
- Add each frequency entry to the heap.
- If heap size becomes greater than `k`, remove the least frequent element.
- The remaining elements in the heap are the top `k` frequent elements.

Time Complexity: O(n log k)

Space Complexity: O(n)

Pattern: HashMap + Heap / Priority Queue

### Top K Frequent Words

Approach:
- Use a HashMap to count the frequency of each word.
- Use a Min Heap based on frequency.
- For equal frequencies, keep lexicographically smaller words.
- Maintain the heap size at `k` by removing the least desirable word.
- Remove the remaining words from the heap and reverse the result.

Time Complexity: O(n log k)

Space Complexity: O(n)

Pattern: HashMap + Heap / Priority Queue