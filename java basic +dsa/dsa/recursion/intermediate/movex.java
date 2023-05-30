// time complexity is o(n)
public class movex {
    public static void moveallx(String str , int idx,int count ,String newString){
        
        if(str.length()==idx){
            for(int i=0;i<count;i++){
                newString +='x';
            }
            System.out.println(newString);
            return;
        }
        char currentChar=str.charAt(idx);
        if(currentChar=='x'){
            count++;
            moveallx(str,idx+1,count,newString);        
        }
        else{
            moveallx(str,idx+1,count,newString+currentChar);
        }
    }
    public static void main(String[] args) {
        moveallx("axbxbbbx",0,0,"");
    }
    
}
