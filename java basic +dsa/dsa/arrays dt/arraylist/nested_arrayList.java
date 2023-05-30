import java.util.*;
public class nested_arrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(6);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(8);
        mainList.add(list1);
        mainList.add(list2);
        // for printing the elements of the list..


        // for (int i = 0; i < mainList.size(); i++){
        //     System.out.println(mainList.get(i));
        // }



        // for calculating the inner loops for---> nested loop
        for (int i = 0; i < mainList.size();i++){

            ArrayList<Integer> innerList = mainList.get(i); // acting as the condition for inner loop

            for (int j = 0; j <innerList.size(); j++){
                System.out.print(innerList.get(j)+" ");
            }
            System.out.println();
        }

    }
}
