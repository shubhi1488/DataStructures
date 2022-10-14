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
   public boolean search(Node head,int x){
       Node curr=head;
       while(curr!=null){
           if(curr.data==x){
               return true;
           }
        curr=curr.next;   
       }
       return false;
   }
	public static void main(String[] args) {
		Main m=new Main();
		m.push(1);
		m.push(2);
		m.push(3);
		m.push(4);
		if(m.search(m.head,7)){
		    System.out.println("yes");
		}
		else{
		    System.out.println("No");
		}
	}
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  //recursive approach-
  public boolean search(Node head,int x){
  if(head==null){
    return false;
  }
  if(head.data==x){
    return true;
  }
  return search(head.next,x);
}
