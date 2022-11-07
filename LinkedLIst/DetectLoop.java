//Floyd's cycle finding algorithm- it is a two pointer approach used to detect the loop in the linked list . 
//It is having two pointers slow and fast where slow moves by one position while fat moves by two position.
#code-
  public class Loop {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        static Node head=null;
        static class LinkedList{
            void insert(int data){
                Node n1=new Node(data);
                if(head==null){
                    head=n1;
                }
                else{
                    n1.next=head;
                    head=n1;
                }
            }
            boolean detectLoop(){
                Node slowpointer=head;
                Node fastpointer=head;
                while(slowpointer!=null && fastpointer!=null && fastpointer.next!=null){
                    slowpointer=slowpointer.next;
                    fastpointer=fastpointer.next.next;
                    if(slowpointer==fastpointer)
                        return true;
                }
                return false;
            }
        }

        public static void main(String[] args) {
            LinkedList l1=new LinkedList();
            l1.insert(10);
            l1.insert(20);
            l1.insert(30);
            l1.insert(40);

            //adding loop
//            Node temp=head;
//            while(temp.next!=null){
//                temp=temp.next;
//            }
//            temp.next=head;
            if(l1.detectLoop()){
                System.out.println("loop exist");
            }
            else{
                System.out.println("loop doesnot exist");
            }

        }
    }
}
