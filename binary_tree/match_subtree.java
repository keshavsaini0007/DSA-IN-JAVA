
import java.util.*;
public class match_subtree {
    
// by time complexity O(n)
  
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

        static int id = -1;
        public static Node Maketree(int[] brr){
            id++;
            if(brr[id] == -1) return null;

            Node newNode = new Node(brr[id]);
            newNode.left = Maketree(brr);
            newNode.right = Maketree(brr);
            return newNode;
        }
        
    }
        
    
    public static boolean isidentical(Node root,Node subroot){
        if(root  ==  null && subroot == null){
            return true;
        }
        if(subroot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(root.data == subroot.data){
           return isidentical(root.left,subroot.left) && isidentical(root.right,subroot.right);
        }
        return false;
    }
    public static boolean issubtree(Node root,Node subroot){
        if(subroot == null){
            return true;
        }
        if(root == null){
            return false;
        }

        if(root.data == subroot.data){
            if(isidentical(root,subroot)){
                return true;
            }
        }
        return issubtree(root.left,subroot) || issubtree(root.right,subroot);
    }


    public static void main(String args[]){
        int arr[] = {1,2,3,2,-1,-1,4,-1,-1,5,-1,2,-1,-1,7,5,-1,3,-1,-1,4,2,1,-1,-1,9,-1,-1,-1};
        binarytree B = new binarytree();
        Node root = B.maketree(arr);
        // int brr[] = {2,1,-1,-1,9,-1,2,-1,-1};
        int brr[] = {2,1,-1,-1,9,-1,-1};
        Node subroot = B.Maketree(brr);
        System.out.println(issubtree(root,subroot));
    }
}
      //                tree  

      //                  1
      //                 / \
      //                /   \
      //               /     \
      //              2       7                 subtree          subtree
      //             / \     / \
      //            3   5   5   4                  2                  2 
      //           / \   \   \   \                / \                / \
      //          2   4   2   3   2              1   9              1   9
      //                         / \                  \
      //                        1   9                  2
      //                                              







