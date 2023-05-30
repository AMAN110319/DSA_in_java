public class counting 
{

    public static void printCount(String input, String word){

        String[] words=input.split(" ");  //Split the word from String
      int wrc=1;    //Variable for getting Repeated word count
      
      for(int i=0;i<words.length;i++) //Outer loop for Comparison       
      {
         for(int j=i+1;j<words.length;j++) //Inner loop for Comparison
         {
            
         if(words[i].equals(words[j]))  //Checking for both strings are equal
            {
               wrc=wrc+1;    //if equal increment the count
               words[j]="0"; //Replace repeated words by zero
            }
         }
         if(words[i].equals(word))
         System.out.println(wrc); //Printing the word along with count
         wrc=1;
        }  
        }
         
    
   public static void main(String[] args)
   {
      String input="Welcome to Java Session Session Session Session";  //Input String 
      String word = "to";
      printCount(input, word);
   }

}