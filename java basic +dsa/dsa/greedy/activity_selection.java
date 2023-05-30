import java.util.*;
public class activity_selection {

    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        // end time basis sorted
        int end[] = {2,4,6,7,9,9};
        // but if not sorted need to create a 2D array
        int Activity[][]= new int[start.length][3];
        for (int i = 0; i < start.length;i++){
             Activity[i][0]= i;
             Activity[i][1]= start[i];
             Activity[i][2]= end[i];
        }

        // sorting logic using comparators
        Arrays.sort(Activity, Comparator.comparingDouble(o -> o[2]));



        int maxAct =0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        // adding time
        maxAct = 1;
        ans.add(Activity[0][0]);
        int lastEnd =Activity[0][2];
        for(int i=0;i<end.length;i++){
            if( Activity[i][1]>=lastEnd){
                //select activity_selection
                maxAct++;
                 ans.add(Activity[i][0]);
                 lastEnd = Activity[i][2];
            }
        }

        System.out.println("max activities are:"+maxAct);
        for(int i=0;i<maxAct;i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
