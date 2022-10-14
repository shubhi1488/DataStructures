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
    public void deleteNode(int key){
      //store the head data and keep track of previous nodes
        Node temp=head,prev=null;
      //if the head containes the key then just move the head by one and return 
        while(temp!=null && temp.data==key){
           head=temp.next;
           return;
        }
      //if the head doesnot contain the key value then  store the head data in prev node and move to next node
        while(temp!=null && temp.data!=key){
            prev=temp;
            temp=temp.next;
        }
      //if the key is not present in the linked list just return the control
        if(temp==null){
            return;
        }
      //now just unlink the node from the linked list
        prev.next=temp.next;
        
    }
  //push the new data at that position
    public void push(int data){
        Node n1=new Node(data);
        n1.next=head;
        head=n1;
    }
  //print the linked list 
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
		m.deleteNode(1);
		System.out.println("linked list after deletion:");
		m.print();
	}
}
