// use Integer.parseInt()--> 1st way
// or Integer.valueof()-->2nd
public class string_to_int{
    public static void main(String[] args) {
        String s ="250";
        // int i = Integer.parseInt(s);
        int i = Integer.valueOf(s);
        System.out.println(i);

    }
}