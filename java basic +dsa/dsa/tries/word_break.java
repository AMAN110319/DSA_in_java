import java.util.*;
public class word_break {


    static class Node{
        Node child[]= new Node[26];
        Boolean EOW=false;
        // no need of value as we track index by the data
        public Node(){
            for(int i=0;i<26;i++){
                child[i]=null;
            }
        }
    
    }

    public static Node root = new Node();

    public static void insertTrie(String word){
        Node curr = root;
     
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';// index at which we found
    
            if(curr.child[idx]==null){
                curr.child[idx]=new Node();
    
            }
            curr = curr.child[idx];
        }
        curr.EOW = true;
    
    }


    public static boolean search(String key){


        Node curr = root;// this is the root 
    
        for(int i=0;i<key.length();i++){
            int idx = key.charAt(i)-'a';// index at which we found
    
            if(curr.child[idx]==null){
                return false;
            }
            // moving forward
            curr = curr.child[idx];
        }
        // checking 
        return curr.EOW == true;
    }

    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<key.length();i++){

             if(search(key.substring(0,i)) && 
             wordBreak(key.substring(i))){
             return true; // beginning index
        }


    }
    return false;
    }


    public static void main(String[] args) {
        String arr[]={"i","like","sam","samsung","mobile","ice"};
        for(int i=0;i<arr.length;i++){
            insertTrie(arr[i]); 
        }

        String key ="ilikesamsung";
        System.out.println(wordBreak(key)); 
    }
    
}
