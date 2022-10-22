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
public class ReverseLinkedList {
     static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node reverse(Node head){
        if(head==null|| head.next==null)
            return head;
        Node rest=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return rest;

    }
    static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static void push(int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
    }

    public static void main(String[] args) {
       push(1);
       push(2);
       push(3);
       push(4);
       push(5);
        System.out.println("linked list before reversing");
        print();
        head=reverse(head);
        System.out.println("linked list after reversing");
        print();

    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Reversing the linked list using tail recursion-
#code-
