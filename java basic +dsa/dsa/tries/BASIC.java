import java.util.*;

// basically tries are combination of nodes of arrays

public class BASIC{
static class Node{
    Node child[]= new Node[26];
    Boolean EOW=false;
    // no need of value as we track index by the data
    Node(){
        for(int i=0;i<26;i++){
            child[i]=null;
        }
    }

}
public static Node root = new Node();// root always empty

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



public static void main(String[] args) {
   String []words = {"the","a","any","their","there","thee"}; 
   for(int i=0;i<words.length;i++){
    // insert function
    insertTrie(words[i]);

   }

System.out.println(search("thee"));
System.out.println(search("thir"));

}
}