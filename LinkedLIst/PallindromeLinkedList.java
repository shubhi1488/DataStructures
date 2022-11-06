//The linked list will be a pallindrome linked list if by reversing we will get the same linked list 
//example- abba 
#code
class Solution{
public boolean pallindrome(Node head){
if(head==null){
return true;
}
Node mid=middle(head);
Node last=reverse(mid.next);
Node curr=head;
while(last!=null){
  if(last.data!=curr.data)
           return false;
  last=last.next;
  curr=curr.next;
}
return true;
}
Node middle(Node head){
      Node slow=head;
      Node fast=head;
      while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
           }
}
Node reverse(Node head){
    if(head==null || head.next==null)
           return head;
    Node newhead=reverse(head.next);
    Node headnext=head.next;
    headnext.next=head;
    head.next=null;
    return newhead;
    }
}
