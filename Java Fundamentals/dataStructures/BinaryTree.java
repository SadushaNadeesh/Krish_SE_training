package dataStructures;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Sadusha
 */

//// A Java program to introduce Binary Tree 
public class BinaryTree {
    //Tree implement with Linked list.
    // Root of Binary Tree
    public Node root;

    BinaryTree(int key) {
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    }
    
    //Preorder traversal is used to create a copy of the tree
    //Use to return the values of the node.
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(node.getValue()+" ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    //After getting the deepest node delete the node.
    void deleteNodeOfBinaryTree(int value) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node presentNode = queue.remove();

            if (presentNode.getValue() == value) {
                presentNode.setValue(getDeepestNode().getValue());
                DeleteDeepestNode();
                System.out.println("\nDeleted the node!");
                return;
            } else {
                if (presentNode.getLeft() != null) {
                    queue.add(presentNode.getLeft());
                }
                if (presentNode.getRight() != null) {
                    queue.add(presentNode.getRight());
                }
            }
        }
        System.out.println("Did not find the node!");
    }

    private Node getDeepestNode() {

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        Node presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.getLeft() != null) {
                queue.add(presentNode.getLeft());
            }
            if (presentNode.getRight() != null) {
                queue.add(presentNode.getRight());
            }
        }
        return presentNode;
    }

    private void DeleteDeepestNode() {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        Node previousNode, presentNode = null;
        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.getLeft() == null) {
                previousNode.setRight(null);
                return;
            } else if ((presentNode.getRight() == null)) {
                presentNode.setLeft(null);
                return;
            }
            queue.add(presentNode.getLeft());
            queue.add(presentNode.getRight());
        }
    }
    //find a value in the tree
    Node search(int value) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node presentNode = queue.remove();
            if (presentNode.getValue() == value) {
                System.out.println("\nValue : " + value + " is found in Tree !");
                return presentNode;
            } else {
                if (presentNode.getLeft() != null) {
                    queue.add(presentNode.getLeft());
                }
                if (presentNode.getRight() != null) {
                    queue.add(presentNode.getRight());
                }
            }
        }
        System.out.println("Value-" + value + " is not found in Tree!");
        return null;
    }
}

//A node in a binary tree 
//class containing left and right child of current node and key value
class Node {

    int value;
    Node left;
    Node right;
    
    //Inserts the given data into the binary tree.
    public Node(int item) {
        value = item;
        left = right = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}

class Test {

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();

        //create root
        t.root = new Node(1);   
        t.root.left = new Node(2);
        t.root.right = new Node(3);
        t.root.left.left = new Node(4);
        /* 2 and 3 become left and right children of 1 
               1 
             /   \ 
            2      3 
          /    \    /  \ 
        4 null null null  */  //4 becomes left child of 2
        
        t.traversePreOrder(t.root);
        t.deleteNodeOfBinaryTree(4);
        System.out.println("\nPre order Traversal: ");
        t.traversePreOrder(t.root);
        System.out.println(t.search(3).value);
        
    }
}
/*
1 2 4 3 
Deleted the node!

Pre order Traversal: 
1 2 3 
Value : 3 is found in Tree !
3
*/