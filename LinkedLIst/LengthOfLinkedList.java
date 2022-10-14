//Iterative approach-
#code-
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
    
    public void push(int data){
        Node n1=new Node(data);
        n1.next=head;
        head=n1;
    }
    public int  getCount(){
        Node temp=head;
        int count=0;
        while(temp!=null){
           count++;
            temp=temp.next;
        }
        return count;
    }
	public static void main(String[] args) {
		Main m=new Main();
		m.push(1);
		m.push(2);
		m.push(3);
		m.push(4);
	System.out.println("number of elements present in the linked list is:"+m.getCount());
	}
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
