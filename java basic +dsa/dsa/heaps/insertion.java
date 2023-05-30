// insertion in O(log(n));
import java.util.*;
public class insertion{
    static class Heap{
        ArrayList<Integer> list = new ArrayList<Integer>();
        public void add(int data){
            list.add(data);
            int x = list.size()-1;
            int par = (x-1)/2;
            while(list.get(x)<list.get(par)){
                // swap
                int temp = list.get(x);
                // child se parent ka swap
                list.set(x, list.get(par));
                // par me child ka swap
                list.set(par, temp);

                x=par;
                par=(x-1)/2;
            }
        }

        public void peek(){
            System.out.println(list.get(0));
        }


        
        private void heapify(int i){
            int left = 2*i+1;
            int right =2*i+2;
            int minIdx =i;

            if(left<list.size()&& list.get(minIdx)>list.get(left)){
                minIdx = left;
            }
            if(right<list.size()&& list.get(minIdx)>list.get(right)){
                minIdx = right;
            }
            if(minIdx != i){
                // swap the values between
                int temp = list.get(i);
                list.set(i,list.get(minIdx));
                list.set(minIdx,temp);

                heapify(minIdx);
            }
        }
        public int remove(){
            int data = list.get(0);
            // swap
            int temp = list.get(0);
            list.set(0,list.get(list.size()-1));
            list.set(list.get(list.size()-1),temp);


            list.remove(list.size()-1);

            heapify(0);
            return data;

        }
        public boolean isEmpty(){
            return list.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap pq =new Heap();
        pq.add(5);
        pq.add(4);
        pq.add(1);
        pq.add(3);
        while(!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}