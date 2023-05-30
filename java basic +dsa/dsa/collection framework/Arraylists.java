import java.util.ArrayList;// for using arraylist 
import java.util.Collections;
public class Arraylists{
public static void main(String[] args) {
    // basic syntax is-->arraylist <dt> name = new ArrayList<dt>()
    ArrayList<Integer> list = new ArrayList<Integer>();
    // ArrayList<String> list2 = new ArrayList<String>();


    // add element;
    list.add(50);
    list.add(13);
    list.add(2);


// prints the list of the given numbers 
    System.out.println(list);
    
    // get elements
    int element =list.get(1);
    System.out.println(element);
    
    
    //add element in between elements
    list.add(2,245);
    System.out.println(list);
    
    //set elements --> updation
    list.set(1,23);
    System.out.println(list);
    //delete element
    list.remove(3);
    System.out.println(list);

    System.out.println(list.size());
//loops
    for(int i=0; i<list.size(); i++){
        System.out.println(list.get(i));
    }

    //sorting of the arrays
    Collections.sort(list);

    System.out.println(list);
}
}