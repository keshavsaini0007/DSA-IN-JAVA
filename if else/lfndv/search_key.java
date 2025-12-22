import java.util.*;

public class search_key {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root,int val){

        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data < val){
            root.right = insert(root.right, val);
        }

        else {
            root.left = insert(root.left, val);
        }

        return root;
    }

    


    public static void InOrder(Node root){
        if(root == null){
            return ;
        }
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }


    // for time complexity O(H)

    public static boolean search(int val,Node root){

        if(root == null){
            return false ;
        }
        if(root.data == val){
            return true;
        }
        
        if(root.data < val){
            if(search( val, root.right)){
                return true;
            }
        }

        else {
            if(search(val, root.left)){
                return true;
            }
        }
        return false;
    }

    //  for time complexity O(N)

    // public static boolean search(int val,Node root){

    //     if(root == null){
    //         return false ;
    //     }
    //     if(root.data == val){
    //         return true;
    //     }
       
    //     if(search(val,root.left) || search(val,root.right)){
    //         return true;
    //     }
    //     else return false;
    // }

    public static void main(String args []){
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i = 0; i<values.length ; i++){
            root = insert(root, values[i]);
        }

        InOrder(root);

        int val = 3;
        System.out.println("\n"+search(val,root));
    }
}
