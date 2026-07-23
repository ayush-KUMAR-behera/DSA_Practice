# Singly Linked List Implementation

## Approach:

Use a Node class containing data and next pointer
Maintain a head pointer to the first node
Support insertion and deletion at both beginning and end
Reverse the list by changing node links iteratively
Traverse the list for printing elements

# Time Complexity:

Add First: O(1)
Add Last: O(n)
Delete First: O(1)
Delete Last: O(n)
Reverse: O(n)
Print: O(n)
IsEmpty: O(1)
GetSize: O(1)

# Space Complexity: O(n)

Pattern: Singly Linked List

### Doubly Linked List

## Approach:
- Each node stores data, previous, and next pointers.
- Maintain a head pointer to the first node.
- Support insertion and deletion at both ends.
- Traverse in the forward direction.
- Reverse the list by swapping previous and next pointers.

# Operations Implemented
- Add First
- Add Last
- Delete First
- Delete Last
- Search
- Reverse
- Display

# Time Complexity

| Operation | Complexity |
|----------|------------|
| Add First | O(1) |
| Add Last | O(n) |
| Delete First | O(1) |
| Delete Last | O(n) |
| Search | O(n) |
| Reverse | O(n) |
| Display | O(n) |

# Space Complexity: O(n)

### Circular Singly Linked List

# Approach:
- Each node stores data and a reference to the next node.
- The last node (tail) always points back to the head.
- Maintain both `head` and `tail` pointers for efficient insertion.
- Traverse until reaching the tail to avoid infinite loops.

# Operations Implemented
- Add First
- Add Last
- Delete First
- Delete Last
- Reverse
- Display
- is Empty
- get Size

# Time Complexity

| Operation | Complexity |
|-----------|------------|
| Add First | O(1) |
| Add Last | O(1) |
| Delete First | O(1) |
| Delete Last | O(n) |
| Reverse | O(n) |
| Display | O(n) |
| Is Empty | O(1) |
| Get Size | O(1) |

# Space Complexity: O(n)
