import java.util.*;
public class pascal_triangle {
    public List<List<Integer>> generate(int numRows){
        if(numRows == 0) return new ArrayList();
        List<List<Integer>> result = new ArrayList();
        for(int i=1;i<=numRows;i++){
            for(int j=0;j<=numRows;j++){
                if(j==0 || j==i-1){
                    row.add(1);
                }
                else{
                    // adding the two above elements 
                   result.get(i-2).get(j)+result.get(i-2).get(j-1);
                }
            }
            result.add(row);
        }
        return result;
    }
}
