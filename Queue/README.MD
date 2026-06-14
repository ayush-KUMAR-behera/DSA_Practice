# Queue Problems

## Problems Solved:

### Queue Implementation Using Array

Approach:

Use an array to store queue elements
Maintain two pointers:
front → points to first element
rear → points to next insertion position
enQueue() inserts element at rear
deQueue() removes element from front
peek() returns front element without removing it
display() prints queue elements from front to rear

Time Complexity:

EnQueue: O(1)
DeQueue: O(1)
Peek: O(1)
IsEmpty: O(1)
Display: O(n)

Space Complexity: O(n)

Pattern: Queue (Array Implementation)

### Queue Implementation Using Linked List

Approach:

Use a linked list to store queue elements
Maintain two pointers:
front → points to first element
rear → points to last element
enQueue() inserts a new node at the rear
deQueue() removes the node from the front
peek() returns the front element without removing it
display() traverses and prints queue elements

Time Complexity:

EnQueue: O(1)
DeQueue: O(1)
Peek: O(1)
IsEmpty: O(1)
GetSize: O(1)
Display: O(n)

Space Complexity: O(n)

Pattern: Queue (Linked List Implementation)
