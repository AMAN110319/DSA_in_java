import java.util.*;
public class sorted_to_bst {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static Node createBst(int arr[],int si, int ei){
        if(si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        Node root = new Node(arr[mid]);
        root.left = createBst(arr, si, mid-1);
        root.right = createBst(arr, mid+1, ei);
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int arr[] ={3,5,6,8,10,11,12};
        int start =0;
        int end = arr.length-1;

       Node root = createBst(arr, start, end);
        inorder(root);
    }
}
