//Iterative approach-
public class Main
{
    static Node head;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node reverse(Node node){
       Node prev = null;
        Node curr = node;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }
    void print(Node node){
         while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
	public static void main(String[] args) {
		Main m=new Main();
		m.head = new Node(85);
        m.head.next = new Node(15);
        m.head.next.next = new Node(4);
        m.head.next.next.next = new Node(20);
 
        System.out.println("Given linked list");
        m.print(head);
        head = m.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        m.print(head);
	}
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//recursive approach-
