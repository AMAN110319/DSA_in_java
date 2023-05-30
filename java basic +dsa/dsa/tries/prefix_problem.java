import java.util.*;
public class prefix_problem {
    static class Node{
        Node [] child =new Node[26];
        boolean eow = false;
        int freq;
        // making a constructor
        public Node(){
            for(int i=0;i<child.length;i++){
                child[i] = null;

            }
            freq=1;
        }
    }

    public static Node root = new Node();


    public static void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.child[idx]==null){
                curr.child[idx] = new Node();
            }
            else{
                curr.child[idx].freq++;
            }
           curr= curr.child[idx];
        }
        curr.eow=true;
    }

    static List <String> st = new ArrayList<String>();

    public static void findprefix(Node root, String ans){
        if(root == null){
            return;
        }
        if(root.freq==1){
            // System.out.println(ans);
            st.add(ans);
            return;
        }

        for(int i=0;i<26;i++){
            if(root.child[i]!=null){
                findprefix(root.child[i],ans+(char)(i+'a'));
            }
        }
    }


    public static void main(String[] args) {
        String arr[]={"zebra","dog","duck","dove"};
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }

        root.freq=-1;

        findprefix(root,"");

        for(int i=0;i<st.size();i++){
            // System.out.print(st.get(i)+" ");
        }
        System.out.println(st);
    }
}
