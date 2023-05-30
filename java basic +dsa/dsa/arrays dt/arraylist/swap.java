import java.util.*;
public class swap {
    public static void swap(ArrayList<Integer> list, int a , int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list.get(1)+" "+list.get(3));
        swap(list,list.get(1),list.get(3));
    }
}
