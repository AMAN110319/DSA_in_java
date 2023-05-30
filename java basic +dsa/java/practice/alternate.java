import java.util.Scanner;
public class alternate
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n= sc.nextInt(),i,j;
		int temp = 2;
		for(i=2;i<n-1;i++){
		    for( j=2;j<=i;j++){
		        if(i%j==0){
		            break;
		        }
		        temp++;
		        }
		        
		        if(temp%2==0){
                //the number is divisible by itself only
                // so if the condition that i ==j means prime no 
		        if(i==j){
		            System.out.println(j);
		        }
		        
		        }
		       
		    }
		}
    }
