# Stack Problems

## Problems Solved:

### Stack Implementation Using Array

Approach:
- Use an array to store stack elements
- Maintain a top pointer
- Perform push, pop, peek, search operations

Time Complexity:
- Push: O(1)
- Pop: O(1)
- Peek: O(1)
- Search: O(n)

Space Complexity: O(n)

Pattern: Stack (Array Implementation)

### Stack Implementation Using Linked List

Approach:

Use a linked list to store stack elements
Maintain a top pointer to the first node
Push inserts a node at the beginning
Pop removes the top node
Peek returns the top element without removing it
Search traverses the linked list to find an element

Time Complexity:

Push: O(1)
Pop: O(1)
Peek: O(1)
Search: O(n)
Display: O(n)

Space Complexity: O(n)

Pattern: Stack (Linked List Implementation)

Key Insight:

Stack follows LIFO (Last In First Out)
Linked List implementation supports dynamic size
No stack overflow due to fixed capacity
Push and Pop always happen at the head node