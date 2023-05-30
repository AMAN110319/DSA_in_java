import java.util.*;
public class count_nodes {
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
                    // for leaf node 
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
           
                public  static int countNodes(Node root){
                    if(root == null){
                        return 0;
                    }
                    int leftnodes = countNodes(root.left);
                    int rightnodes = countNodes(root.right);
                    return leftnodes + rightnodes+1;
                }
        
                public  static int sumofNodes(Node root){
                    if(root == null){
                        return 0;
                    }
                    int leftnodes = sumofNodes(root.left);
                    int rightnodes = sumofNodes(root.right);
                    return leftnodes + rightnodes+root.data;
                }
        
        
        
            public static void main(String[] args) {
                int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
                BinaryTree b=new BinaryTree();
                Node root = b.buildTree(nodes);
                // preorder(root);
                // postorder(root);
                // levelorder(root);
                System.out.println(countNodes(root));
                System.out.println(sumofNodes(root));
    
            }
        } 

