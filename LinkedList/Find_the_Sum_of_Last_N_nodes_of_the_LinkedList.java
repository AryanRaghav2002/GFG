class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
      if (head == null) return 0;

        // Initialize two pointers
        Node fast = head;
        Node slow = head;

        // Move the fast pointer n nodes ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Move both pointers one step at a time until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Now, slow points to the first of the last n nodes
        // Sum the last n nodes
        int sum = 0;
        while (slow != null) {
            sum += slow.data;
            slow = slow.next;
        }

        return sum;
    }
}