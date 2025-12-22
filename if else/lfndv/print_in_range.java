import java.util.*;

public class print_in_range {
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

    public static Node delete(Node root,int val){

        if(root.data > val){
            root.left = delete(root.left, val);
        }

        else if(root.data < val){
            root.right = delete(root.right, val);
        }
        
        else {   // root.data == val
            // case 1
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2 
            else if(root.left == null){
                return root.right;
            }

            // case 3
            else if(root.right == null){
                return root.left;
            }

            Node IS = InOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static void PrintInRange(Node root,int x,int y){

        if(root == null){
            return;
        }
        if(x <= root.data && root.data <= y){
            PrintInRange(root.left,x,y);
            System.out.print(root.data+" ");;
            PrintInRange(root.right,x,y);
        }
        else if(root.data < x){
            PrintInRange(root.right,x,y);
        }
        else if(root.data > y){
            PrintInRange(root.left,x,y);
        }
    }

    public static Node InOrderSuccessor(Node root){
        if(root.left == null){
            return root;
        }
        return InOrderSuccessor(root.left);
    }
    public static void main(String args []){
        int values[] = {8,5,3,1,4,6,10,14};
        Node root = null;

        for(int i = 0; i<values.length ; i++){
            root = insert(root, values[i]);
        }

        InOrder(root);
        System.out.println();
        PrintInRange(root,4,10);
    }
}


