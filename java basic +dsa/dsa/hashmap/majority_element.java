// q1 on finding elements which are elements to be calculated 
import java.util.*;
public class majority_element {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int arr[]={1,3,2,5,1,3,1,5,1};
        int num=0;
        for (int i=0; i<arr.length; i++){
            num =arr[i];
            if(map.containsKey(arr[i])){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }

        // set to create
        Set<Integer> key = map.keySet();
        for(Integer str : key){
            if(map.get(str)>arr.length/3){
            System.out.println(str +" :"+map.get(str));
            }
        }


        
    }
}
