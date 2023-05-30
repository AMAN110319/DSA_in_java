 import java.util.*;
public class bst_basic{
    // structure
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    
    //insertion of nodes
    public static Node insert(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            //left subtree me addition
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }



    //searching in bst
    public static Boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        else if(root.data>key){
            //search in left subtree
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }

    }



    //deletion
    public static Node delete(Node root, int val){
        if(root.data>val){
            root.left= delete(root.left ,val);
    }
    else if(root.data<val){
        root.right= delete(root.right ,val);
    }
    else{//root.data==values
        
        
        //case1--> 0 child
        if(root.left==null && root.right==null){
           return null;
        }


        //case2 ---> single child


        if(root.left==null){
            return root.right;
        }
        else if(root.right==null){
            return root.left;
        }

        //case 3--> 2 child
        Node IS = InorderSuccessor(root.right);
        root.data= IS.data;
        root.right=delete(root.right,IS.data);
    }
    return root;
    }

    public static Node InorderSuccessor(Node root){
        while(root.left !=null){
            root = root.left;
        }
        return root;
    }


    public static void inorder(Node root){
        if(root==null){

            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


//print  in range
public static void printInrange(Node root, int X, int Y){
    if(root==null){
        return;
    }
    if(root.data>=X && root.data<=Y){
        printInrange(root.left,X,Y);
        System.out.print(root.data+" ");
        printInrange(root.right,X,Y);
    }

    // print the left 
    else if(root.data>=Y){
        printInrange(root.left,X,Y);
    }
    else{
        printInrange(root.right,X,Y);
    }
}




public static void printpath(ArrayList <Integer> path){
    for(int i=0;i<path.size();i++){
        System.out.print(path.get(i)+"->");
    }
    System.out.println("null");
}

//root to leave path 
public static void printRoot2leaf(Node root, ArrayList <Integer> path){
    if(root == null){
        return;
    }
    
    // adding the root data in the arraylist


    path.add(root.data);
    
    //leaf 
    if(root.left == null && root.right == null){
        printpath(path);
    }
    //non leaf
    else{
        printRoot2leaf(root.left,path);
        printRoot2leaf(root.right,path);
    }

    path.remove(path.size()-1);
}

public static boolean isValidBST(Node root, Node min,Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data<=min.data){
            return false;
        }
        else if(max !=null && root.data>=max.data){
            return false;
        }
        return isValidBST(root.left,min,root) && isValidBST(root.right,root, max);

}
    public static void main(String[] args) {
        int []values ={8,5,3,6,10,11,14};
        // int []values ={5,1,3,4,2,7};
        Node root =null;
        for(int i=0;i<values.length;i++){
            root = insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        // boolean x=search(root, 9);
        // if(x){
        //     System.out.println("found");
        // }
        // else{
        //     System.out.println("not found");
        // }
        // delete(root,7);
        // inorder(root);
        printInrange(root,3,12);

        System.out.println();
        printRoot2leaf(root,new ArrayList<Integer>());
        
        if(isValidBST(root,null,null)){
            System.out.println("valid");
        }
        else{
            System.out.println("not valid");
        }
    }
}