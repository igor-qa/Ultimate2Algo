package codingint;

/**
 * Created by borisgurtovyy on 11/13/17.
 */

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class LinkedList {

    // LEETCODE 237
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }



    // LEETCODE 141
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode hare = head;
        ListNode turtoise = head;
        while(hare!= null && hare.next != null){
            hare = hare.next.next;
            turtoise = turtoise.next;
            if(hare == turtoise){
                return true;
            }
        }
        return false;
    }


    // LEETCODE 328
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while(even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }


}
