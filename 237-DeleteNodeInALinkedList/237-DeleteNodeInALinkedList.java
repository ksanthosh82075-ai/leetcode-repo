// Last updated: 8/14/2026, 2:36:36 PM
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}