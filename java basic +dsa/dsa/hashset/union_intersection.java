// union and intersection of sets of 2 set
import java.util.*;

public class union_intersection {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        HashSet<Integer> sets = new HashSet<>();
        // adding elements of set1
        for(int i=0; i<arr1.length; i++){
            sets.add(arr1[i]);
        }
        // adding elements of set2
        for(int i=0; i<arr2.length; i++){
            sets.add(arr2[i]);
        }

        // union
        System.out.println("the elements are: ");
        for(Integer i : sets){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(sets.size());
// intersections
        sets.clear();

        for(int i=0; i<arr1.length; i++){
            sets.add(arr1[i]);
        }


        int count = 0;
        for(int i=0; i<arr2.length; i++){
            if(sets.contains(arr2[i])){
                count++;
                sets.remove(arr2[i]);
            }
        }

        
        System.out.println(count);

    }
}
