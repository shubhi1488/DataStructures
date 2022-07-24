//Design a stack with operations on middle element
public class DLLNode {
    DLLNode prev;
    DLLNode next;
    int data;
    DLLNode(int data){
        this.data=data;
    }
}
class Stack{
    DLLNode head;
    DLLNode mid;
    DLLNode prev;
    int size;
    void push(int x){
        DLLNode n1=new DLLNode(x);
        if(size==0){
            head=n1;
            mid=n1;
            size++;
            return;

        }
        head.next=n1;
        n1.prev=head;
        head=head.next;
        if(size%2!=0){
            mid=mid.next;
        }
        size++;
    }
    int pop(){
        int data=-1;
        if(size==0){
            System.out.println("stack is empty");
        }
        if(size!=0){
            if(size==1){
                head=null;
                mid=null;
            }
            else{
                data=head.data;
                head=head.prev;
                head.next=null;

            }
            size--;
        }
        return data;
    }
    int findMiddle(){
        if(size==0){
            System.out.println("stack is empty");
            return -1;
        }
        return mid.data;
    }
    void deleteMiddle(){
        if(size!=0){
            if(size==1){
                head=null;
                mid=null;
            } else if (size==2) {
                head=head.prev;
                mid=mid.prev;
                head.next=null;
            }
            else{
                mid.next.prev=mid.prev;
                mid.prev.next=mid.next;
                if (size%2==0){
                    mid=mid.prev;
                }
                else{
                    mid=mid.next;
                }
            }
            size--;
        }
    }

    public static void main(String[] args) {
        Stack ms = new Stack();
        ms.push(11);
        ms.push(22);
        ms.push(33);
        ms.push(44);
        ms.push(55);
        ms.push(66);
        ms.push(77);
        ms.push(88);
        ms.push(99);

        System.out.println("Popped : " + ms.pop());
        System.out.println("Popped : " + ms.pop());
        System.out.println("Middle Element : "
                + ms.findMiddle());
        ms.deleteMiddle();
        System.out.println("New Middle Element : "
                + ms.findMiddle());
    }
    }
