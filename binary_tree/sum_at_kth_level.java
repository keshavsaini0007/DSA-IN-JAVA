import java.util.*;
public class  sum_at_kth_level{
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


    public static void LevelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> Q = new LinkedList<>();
        Q.add(root);
        Q.add(null);
        while(!Q.isEmpty()){
            Node currNode = Q.remove();
            if(currNode == null){
                System.out.println();
                if(Q.isEmpty()){
                    break;
                }else {
                Q.add(null);
                }
            }
            else {
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    Q.add(currNode.left);
                }
                if(currNode.right != null){
                    Q.add(currNode.right);
                }
            }
        }
    }
}

    public static void main(String args[]){
        int arr[] = {1,2,3,2,-1,-1,4,-1,-1,5,-1,2,-1,-1,7,5,-1,3,-1,-1,4,2,1,-1,-1,9,-1,-1,-1};
        binarytree B = new binarytree();
        Node root = B.maketree(arr);
        B.LevelOrder(root);
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