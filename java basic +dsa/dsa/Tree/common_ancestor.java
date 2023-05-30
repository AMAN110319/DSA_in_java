// conatins all code after the ancestor wala


import java.util.*;
public class common_ancestor {
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean getPath(Node root,int n,ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        if(getPath(root.left,n,path) || getPath(root.right,n,path)){
            return true;
        }
        path.remove(path.size()-1);
        return false;
        
    }
    public static Node lca(Node root, int n1,int n2){
        ArrayList<Node> p1 = new ArrayList<Node>();
        ArrayList<Node> p2 = new ArrayList<Node>();
        getPath(root, n1, p1);
        getPath(root, n2, p2);

        //  both arraylist traversal to check
        int i=0;
        for(i=0;i<p1.size() && i<p2.size();i++){
            if(p1.get(i) != p2.get(i)){
                break;
            }
        }
        Node lca = p1.get(i-1);
        return lca;
    }

    public static Node lca2(Node root, int n1, int n2){
        if(root ==null || root.data== n1 || root.data== n2){
            return root;
        }
       Node left= lca2(root.left, n1, n2);
       Node right= lca2(root.right, n1, n2);
    //    finding in the subtree
       if(right == null){
        return left;
       }
       if(left == null){
        return right;
       }
       return root;
    }



    public static int lcaDist(Node root, int n){
        if(root== null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);
        if(leftDist ==-1 && rightDist==-1){
            return -1;
        } 
        else if(leftDist==-1){
            return rightDist+1;
        }
        else{
            return leftDist+1;
        }
    }


    public static int mindist(Node root,int n1, int n2){
        Node lca = lca2(root, n1,n2);
        int dist1= lcaDist(root, n1);
        int dist2= lcaDist(root, n2);

        return dist1 + dist2;
    }


    public static int kanscestor(Node root, int n , int k){
        // base case
        if(root == null){
            return -1;
        }

        // recursive  case
        if(root.data == n){
            return 0;
        }
        int leftDist =kanscestor(root.left,n,k);
        int rightDist =kanscestor(root.right,n,k);
        if(leftDist==-1 && rightDist==-1){
            return -1;
        }
        int max = Math.max(leftDist, rightDist);
        if(max +1 ==k){
            System.out.println(root.data);
        }
        return max+1;
    }


    // creating or transforming to a sum tree
    public static int transform(Node root){
        if(root == null){
            return 0;
        }
        int leftchild = transform(root.left);
        int rightchild = transform(root.right);

        int data = root.data;
        int newleft = root.left == null ? 0: root.left.data;
        int newright = root.right == null ? 0: root.right.data;
        root.data = newleft+ leftchild + rightchild+newright;
        return data;
    }
    public static void preorder(Node root){
        // base case
        if(root == null){
            return;
        }
        // recursive  case
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        // System.out.println(lca2(root, 4, 5 ).data);

        // System.out.println(mindist(root, 4, 5 ));
        System.out.println(kanscestor(root, 4, 1));

        transform(root);
        preorder(root);
    }
}
