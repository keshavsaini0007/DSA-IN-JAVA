import java.util.*;
public class make_binary_tree {
    
        static class Node{
            int data;
            Node leftNode;
            Node rightNode;

           Node(int data){
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
           }
        }
        static class BinaryTree{
        static int idx = -1;
           public static Node binary_tree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.leftNode  = binary_tree(nodes);
            newNode.rightNode = binary_tree(nodes);

            return newNode;
           }
        }
    
public static void main(String args[]){
    BinaryTree b = new BinaryTree();
    int tree[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    Node root = b.binary_tree(tree);
    System.out.println(root.data);

}
}



// import java.util.*; // Importing Java utility package

// public class make_binary_tree {

//     // Node class represents each node of the binary tree
//     static class Node {
//         int data;        // Data stored in the node
//         Node leftNode;   // Reference to the left child
//         Node rightNode;  // Reference to the right child

//         // Constructor to initialize a new node
//         Node(int data) {
//             this.data = data;
//             this.leftNode = null;
//             this.rightNode = null;
//         }
//     }

//     // BinaryTree class to create a binary tree from a given array
//     static class BinaryTree {
//         static int idx = -1;  // Index to keep track of current position in array

//         // Method to build binary tree from a given array of integers
//         // -1 in the array represents a null node
//         public static Node binary_tree(int nodes[]) {
//             idx++;  // Move to the next index

//             // If current node value is -1, it represents a null node
//             if (nodes[idx] == -1) {
//                 return null;
//             }

//             // Create a new node with current data
//             Node newNode = new Node(nodes[idx]);

//             // Recursively build the left and right subtrees
//             newNode.leftNode = binary_tree(nodes);
//             newNode.rightNode = binary_tree(nodes);

//             return newNode; // Return the constructed subtree root
//         }
//     }

//     public static void main(String args[]) {
//         BinaryTree b = new BinaryTree();  // Create an instance of BinaryTree

//         // Array representing the tree in pre-order format
//         //       _
//         // 1    / 4
//         // ├── 2
//         // │    \_5
//         // │   
//         // └── 3
//         //      \_6
//         int tree[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

//         // Construct the binary tree from array
//         Node root = b.binary_tree(tree);

//         // Print the data of the root node
//         System.out.println(root.data);
//     }
// }