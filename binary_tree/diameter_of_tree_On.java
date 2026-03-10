import java.util.*;
public class diameter_of_tree_On {
    
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
    }
    //     public static int height(Node root){
    //         if(root == null){return 0;}
    //         int left = height(root.left);
    //         int right = height(root.right);
    //         return (left>=right ? left : right) +1;
    //     }
    // }
        static class TreeInfo{
            int ht;
            int dia;
            TreeInfo(int ht, int dia){
                this.ht = ht;
                this.dia = dia;
            }
        }

        public static TreeInfo diameter2(Node root){
            if(root == null){
                return new TreeInfo(0, 0);
            }
            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.right);

            int MyHeight = Math.max(left.ht , right.ht) + 1;

            int diam1 = left.dia;
            int diam2 = right.dia;
            int diam3 = left.ht + right.ht + 1;

            int mydiam = Math.max(Math.max(diam1 , diam2) , diam3);
            
            TreeInfo myInfo = new TreeInfo(MyHeight, mydiam);
            return myInfo;
        }

    public static void main(String args[]){
        int arr[] = {1,2,3,2,-1,-1,4,-1,-1,5,-1,2,-1,-1,7,5,-1,3,-1,-1,4,2,1,-1,-1,9,-1,-1,-1};
        binarytree B = new binarytree();
        Node root = B.maketree(arr);
        System.out.println(diameter2(root).dia);
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







