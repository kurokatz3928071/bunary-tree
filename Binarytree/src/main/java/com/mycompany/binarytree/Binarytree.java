/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.binarytree;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
/**
 *
 * @author Aspire S7
 */
public class Binarytree {
    Node root;

    public Binarytree() {
        root = null;
    }

    
    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRecursive(root.left, data);
        } else if (data > root.data) {
            root.right = insertRecursive(root.right, data);
        }

        return root;
    }

   
    public void inOrderTraversal() {
        inOrderTraversalRecursive(root);
    }

    private void inOrderTraversalRecursive(Node root) {
        if (root != null) {
            inOrderTraversalRecursive(root.left);
            System.out.print(root.data + " ");
            inOrderTraversalRecursive(root.right);
        }
    }

    public static void main(String[] args) {
        Binarytree binaryTree = new Binarytree();

        
        binaryTree.insert(45);
        binaryTree.insert(87);
        binaryTree.insert(234);
        binaryTree.insert(42);
        binaryTree.insert(34);

        
        System.out.println("In-order traversal:");
        binaryTree.inOrderTraversal();
    }
}
