//trees as linked list
import java.util.*;
public class tree{
    // created node 
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
    //creating a tree from nodes
    static class BinaryTree{
        static int index=-1; //for traversal we need

        public static Node buildTree(int []nodes){
            index++;//i=0
            if(nodes[index]== -1){
                return null;
            }
            //creating new tree
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);//left subtree
            newNode.right = buildTree(nodes); // right subtree
            
            return newNode;
        }
    }
    //time complexity is O(n)
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
// bfs --> queue and iteration 
    public static void levelorder(Node root){
        if(root==null){
            System.out.println("tree is empty");
        }
        Queue<Node> q = new LinkedList<Node>();
         q.add(root);
         q.add(null);
         while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();//new line
                if(q.isEmpty()){
                    break;
                } 
                else{
                    q.add(null);
                }
            }
            else{
              System.out.print(currNode.data+" ");  
              if(currNode.left !=null){
                q.add(currNode.left);
              }
              if(currNode.right !=null){
                q.add(currNode.right);
              }
            }

         }
    }



    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree b=new BinaryTree();
        Node root = b.buildTree(nodes);
        // preorder(root);
        // postorder(root);
        levelorder(root);
    }
}