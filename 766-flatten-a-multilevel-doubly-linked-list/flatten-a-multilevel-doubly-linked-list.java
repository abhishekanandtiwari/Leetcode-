/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) return null ;

        Stack<Node> stack = new Stack<>() ;
        Node curr = head;
        Node prev = null;

        stack.push(curr);

        while(!stack.isEmpty()) {
            curr = stack.pop();
             if (prev != null) {
                prev.next = curr;
                curr.prev = prev;
            }

              if (curr.next != null) {
                stack.push(curr.next);
            }

             if (curr.child != null) {
                stack.push(curr.child);
                curr.child = null; 
            }

                        
            prev = curr;
        }
        
        return head;
    }
}

    