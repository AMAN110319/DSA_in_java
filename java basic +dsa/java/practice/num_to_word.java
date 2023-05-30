import java.util.*;
class num_to_word
{
    public static void main(String args[])
    {
        Scanner in =new Scanner (System.in);
        //Input
        System.out.print("Enter a number:\t");
        int n=in.nextInt();

        if (n==0)
        {
            System.out.print("Zero");
        }
        else
        {
            /*
            int c=0;
            for(int i=n;i>0;i/=10)
            {
                c++;
            }
            System.out.print(c);
            */

            String wrd=String.valueOf(n);
            int l=wrd.length(); //for length of number ie. no of digits in the number

            //Declaration of variables
            String z="",zz="";
            int i=0,c=0,nn=0,nnn=0,zzc=0;

            //Start the loop
            for (i=l-1;i>=0;i--)
            {
                char cc=wrd.charAt(i);
                c=Integer.valueOf(String.valueOf(cc));//current digit

            
                //Arrays
                String uw[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixten","Seventeen","Eighteen","Ninteen"};
                String tw[]={"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
                //Arrays//

                //for combating double digit numbers like 13,14,15...  Start
                if(i>0)
                {
                    zz=wrd.substring(i-1,i+1);  //substring extracts string from string(.substring (inclusive,exclusive))
                    zzc=Integer.valueOf(zz);    //contains last two digits eg. 1234 and c=3, so zzc =23
                }
                else
                {
                    zzc=22;
                }
                //for combating double digit numbers like 13,14,15...  End


                /*nnn is the number of DIGITS CONVERTED AND it is for when hundred/thousand/lakh etc. SHOULD BE INSERTED.
                * nn also controls the number of digits conveted but it needs to resets on hundred/thousand/lakh etc...   HERE USED FOR CHECKING UNIT PLACE
                * Z contains the NUMBER_WORD*/
                if (nnn==2) 
                {
                    if(c!=0){ //Just to eliminate 0 problem, in case.
                        z="hundred "+z;
                    }
                    nn=0;
                }
                if (nnn==3)
                {
                    if(c!=0){
                        z="thousand "+z;
                    }
                    nn=0;
                }
                if (nnn==5)
                {
                    if(c!=0){
                        z="lakh "+z;
                    }
                    nn=0;
                }
                if (nnn==7)
                {
                    if(c!=0){
                        z="crore "+z;
                    }
                    nn=0;
                }
                if (nnn==9)
                {
                    if(c!=0){
                        z="arab "+z;
                    }
                    nn=0;
                }
                if (nnn==11)
                {
                    if(c!=0){
                        z="kharab "+z;
                    }
                    nn=0;
                }


                //Main
                if(zzc<20 && nnn!=1 && nnn==0)  //up till 19
                {
                    z=uw[zzc]+" "+z;
                    nn++;nnn++;i--;  //since two digits crossed(one extra digit).
                }
                else if(zzc<20 && nnn!=1 && nnn%2!=0)
                {
                    z=uw[zzc]+" "+z;
                    nn++;nnn++;i--;  //since two digits crossed(one extra digit).
                }
                else if(nn%2==0)       //One,two,three... etc Unit place words
                {
                    z=uw[c]+" "+z;
                }
                else   //ten,twenty,thirty... etc Tens place words
                {   
                    z=tw[c]+" "+z;
                }
                nn++;nnn++;     //++ -One more digit converted to word
            }
            //Print
            System.out.println("\nNumber in Words: \n"); //for printing purposes
            System.out.println(z);

        }
        in.close();
    }
}

