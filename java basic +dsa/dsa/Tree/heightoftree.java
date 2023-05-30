
// this code contains two codes diameter of a tree and subtree or not 


import java.util.*;
public class heightoftree{
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int heightoftree(Node root){
        if(root == null){
            return 0;
        }
        int lh = heightoftree(root.left);
        int rh = heightoftree(root.right);

        int height = Math.max(lh, rh)+1;
        return height;
    }



// approach 1
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        // agar left subtree me bada wala mile
        int ldiam = diameter(root.left);
        // agar right subtree wala bada ho
        int rdiam = diameter(root.right);
        int lh = heightoftree(root.left);
        int rh = heightoftree(root.right);
        // if passing from the root
        int self = lh+rh+1;
        return Math.max(Math.max(ldiam,rdiam),self);
    }


    // // approach 2 
    // static class Info{
    //     int height;
    //     int diam;
    //     public Info(int diam, int height){
    //         this.diam=diam;
    //         this.height=height;
    //     }
    // }

    // public static Info diameter2(Node root){
    //     Info leftInfo=diameter2(root.left);
    //     Info rightInfo= diameter2(root.right);
    //     int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.height+rightInfo.height+1);
    //     int ht = Math.max(leftInfo.height,rightInfo.height)+1;
    //     return new Info(diam,ht);
    // }


    // we choose whether the given tree is a subtree of a given point or not
    public static boolean isSubtree(Node root, Node subroot) {
        
        if(subroot == null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root.data == subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
        //             left or right
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }


// is Identical to check whether

public static boolean isIdentical(Node root, Node subroot){
    if(root == null && subroot == null){
        return true;
    }
    if(root == null || subroot == null || root.data != subroot.data){
        return false;
    }
    if(root.data == subroot.data){
        return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
    }
    return false;
}


    public static void main(String[] args) {


        // created the tree



        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
// subtree

            Node subRoot = new Node(2);
            subRoot.left = new Node(4);
            subRoot.right = new Node(5);

        System.out.println(heightoftree(root));
        System.out.println(diameter(root));

        System.out.println(isSubtree(root,subRoot));

    }
}