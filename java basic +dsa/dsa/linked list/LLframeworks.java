import java.util.LinkedList;
public class LLframeworks {
    public static void main(String[] args) {
        LinkedList <String> LL = new LinkedList<String>();//for using linked list collection frameworks

        LL.addFirst("a");
        LL.addFirst("is");
        LL.addFirst("This");
        LL.addLast("list");
        System.out.println(LL);

        //insertion in between
        LL.add(3,"Linked");
        System.out.println(LL);
        for(int i = 0; i < LL.size(); i++){
            System.out.print(LL.get(i)+"->");
        }
        System.out.println("NULL");
        
        
        // remove
        LL.removeFirst();
        LL.remove(2);
        for(int i = 0; i < LL.size(); i++){
            System.out.print(LL.get(i)+"->");
        }
        System.out.println("NULL");
        
    }
}
