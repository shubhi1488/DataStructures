/*1. PreOrder Traversal-In this techniquewe we first print the data of root then move to left subtree and print the data then right subtree
It basically follows DLR(Display-Left-Right)
*/
#code-
  class Solution{
    public List<Integer>(TreeNode root){
      List<Integer>res=new ArrayList<>();
      Stack<TreeNode>stack=new Stack<TreeNode>();
      TreeNode curr=root;
      while(curr!=null || !stack.isEmpty()){
          while(curr!=null){
            stack.push(curr);
            curr=curr.left;
          }
      res.add(curr.val);
      curr=stack.pop();
      curr=curr.right;
      }
      return res;
    }
  }
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  /*Inorder Traversal- In this technique we first print the root data and then move to left and then right subtrees
  It basically follow LDR(left-display-right)
  */
  #code-
  class Solution{
    public List<Integer>(TreeNode root){
      List<Integer>res=new ArrayList<Integer>();
      Stack<TreeNode>stack=new Stack<TreeNode>();
      TreeNode curr=root;
      while(curr!=null || !stack.isEmpty()){
            while(curr!=null){
              stack.push(curr);
              curr=curr.left;
            }
       curr=stack.pop();
        res.add(curr.val);
        curr=curr.right;
      }
      return res;
    }
  }
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  /*PostOrder Traversal- In this technique we first go to left subtree then right subtree and then print the root data
  It basically follows LRD(left-right-display)
  */
  #code-
  class Solution{
    public List<Integer>(TreeNode root){
      List<Integer>res=new ArrayList<>();
      Stack<TreeNode>stack=new Stack<>();
      TreeNode curr=root;
      while(curr!=null || !stack.isEmpty()){
          while(curr!=null){
             stack.push(curr);
            curr=curr.left;
          }
       curr=stack.pop();
       curr=curr.right;
       res.add(curr.val);
      }
      return res;
    }
  }
