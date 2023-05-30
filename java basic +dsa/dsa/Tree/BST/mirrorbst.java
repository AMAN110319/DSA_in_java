import java.util.*;
public class mirrorbst {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node mirrorbst(Node root){
        // base case
        if(root == null){
            return null;
        }
        Node left_subtree=mirrorbst(root.left);
        Node right_subtree=mirrorbst(root.right);
        // changing the pointer to create the mirror effect

        root.left = right_subtree;
        root.right = left_subtree;
        return root;
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right= new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        root = mirrorbst(root);

        preorder(root);


    }
}
