import java.util.ArrayList;
public class max__water{
    public static int storeWaters(ArrayList<Integer> height){
        int maxarea = 0;
        for(int i = 0; i < height.size(); i++){
            for(int j = i+1; j < height.size(); j++){
                int width = j-i;
                int ht = Math.min(height.get(i), height.get(j));
                int currarea = width*ht;
                maxarea =Math.max(maxarea, currarea);
            }
        }
        return maxarea;
    }
    public static void main(String[] args) {
        ArrayList<Integer>height = new ArrayList<Integer>();
       height.add(1);
       height.add(8);
       height.add(6);
       height.add(2);
       height.add(5);
       height.add(4);
       height.add(8);
       height.add(3);
       height.add(7);
        System.out.println("the maximum area stored in an container is :"+storeWaters(height));
    }
}