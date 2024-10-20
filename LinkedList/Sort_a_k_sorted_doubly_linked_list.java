class Solution {
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        if (head == null) return head;

        // Min-heap (priority queue) to store the nodes based on their data value
        PriorityQueue<DLLNode> minHeap = new PriorityQueue<>((n1, n2) -> n1.data - n2.data);

        DLLNode newHead = null, last = null;

        // Insert the first (k + 1) elements into the min-heap
        DLLNode current = head;
        for (int i = 0; current != null && i <= k; i++) {
            minHeap.add(current);
            current = current.next;
        }

        // Extract the minimum element from the heap and fix the doubly linked list
        while (!minHeap.isEmpty()) {
            DLLNode minNode = minHeap.poll();

            // If this is the first node, set it as the new head
            if (newHead == null) {
                newHead = minNode;
                newHead.prev = null;
                last = newHead;
            } else {
                // Otherwise, link the node to the last node in the sorted list
                last.next = minNode;
                minNode.prev = last;
                last = minNode;
            }

            // Insert the next node from the list into the heap, if it exists
            if (current != null) {
                minHeap.add(current);
                current = current.next;
            }
        }

        // Set the last node's next pointer to null
        last.next = null;

        return newHead;
    }
}