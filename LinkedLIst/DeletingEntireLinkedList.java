public class Main
{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    public void deleteNode(){
        head=null;
        
    }
    public void push(int data){
        Node n1=new Node(data);
        n1.next=head;
        head=n1;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
	public static void main(String[] args) {
		Main m=new Main();
		m.push(1);
		m.push(2);
		m.push(3);
		m.push(4);
		System.out.println("linked list is:");
		m.print();
		m.deleteNode();
		System.out.println("linked list after deletion:");
        System.out.println("linked list is deleted");
	}
}
