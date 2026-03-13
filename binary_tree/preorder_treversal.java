import java.util.*;
public class preorder_treversal{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binarytree{
        static int idx = -1;

        public static Node maketree(int[] arr){
            idx++; 
            if(arr[idx] == -1) return null;

            Node newNode = new Node(arr[idx]);
            newNode.left = maketree(arr);
            newNode.right = maketree(arr);
            return newNode;
        }
       public static void PreOrder(Node root){
        
            if(root == null) {
            System.out.print(-1+" "); 
            return;
            }
            System.out.print(root.data+" ");
            
            PreOrder(root.left);
            PreOrder(root.right);
          
        }
    }
     

    

    public static void main(String args[]){
        int arr[] = {1,2,3,2,-1,-1,4,-1,-1,5,-1,2,-1,-1,7,5,-1,3,-1,-1,4,2,1,-1,-1,9,-1,-1,-1};
        binarytree B = new binarytree();
        Node root = B.maketree(arr);
        B.PreOrder(root);
    }
}
      //                  1
      //                 / \
      //                /   \
      //               /     \
      //              2       7
      //             / \     / \
      //            3   5   5   4
      //           / \   \   \   \
      //          2   4   2   3   2
      //                         / \
      //                        1   9   
      //                         