import java.util.ArrayList;
public class maximum{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(max<list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println("the max is " + max);

    }
}