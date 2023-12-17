package middle;

public class main {
	public static void main(String[] args) {
		 Solution solution = new Solution();
		
		// Example 1
		 ListNode head1 = new ListNode(1);
		head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        
        ListNode middleNode1 = solution.middleNode(head1);
        System.out.println(middleNode1.val);
        
        // Example 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next = new ListNode(6);
        
        ListNode middleNode2 = solution.middleNode(head2);
        System.out.println(middleNode2.val);
	}
}