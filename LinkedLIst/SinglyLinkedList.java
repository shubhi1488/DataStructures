public class SinglyLinkedList{
  Node head;
  public class Node{
    int data;
    Node next
      Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  public void insertBeg(int data){
    Node n1=new Node(data);
    if(head==null){
      head=n1;
    }
    n1.next=head;
    head=n1;
  }
  public void insertMiddle(int data,Node prev){
    Node n1=new Node(data);
    if(head==null){
      head=n1;}
    if(prev==null){
      System.out.println("previous cannot be null");
    }
    n1.next=prev.next;
    prev.next=n1;
  }
  public void insertend(int data){
    Node n1=new Node(data);
    Node temp=head;
    n1.next=null;
    while(temp!=null){
      temp=temp.next;
    }
    temp.next=n1;
  }
  public void print(){
    Node temp=head;
    while(temp.next!=null){
      System.out.println(temp.data+" ");
      temp=temp.next;
    }
    System.out.println();
  }
  public static void main(String args[]){
    SinglyLinkedList sll=new SinglyLinkedList();
    sll.insertbeg(10);
    sll.insertend(20);
    sll.insertmiddle(30);
    sll.print();
  }
}
    
