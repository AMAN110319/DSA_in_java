import java.util.*;
public class bst_to_balanced_bst {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static Node createBst(ArrayList<Integer> list,int si, int ei){
        if(si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        Node root = new Node(list.get(mid));
        root.left = createBst(list, si, mid-1);
        root.right = createBst(list, mid+1, ei);
        return root;
    }
    // created an arraylist to add up the data
    static ArrayList<Integer> list = new ArrayList<>();
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        // System.out.print(root.data+" ");
        list.add(root.data);
        inorder(root.right);
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node balancebst(Node root){
        // inorder 
        inorder(root);

        // convert in balanced bst_to_balanced_bst
        root = createBst(list,0,list.size()-1);
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left= new Node(5);
        root.left.left .left= new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);


        root = balancebst(root);
        preorder(root);
    }
}
