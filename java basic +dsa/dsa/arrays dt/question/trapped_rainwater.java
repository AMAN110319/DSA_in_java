import java.util.*;
public class trapped_rainwater{
    public static int trapped_vol(int height[],int width){
        //calculate left max boundry
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
          leftmax[i]=Math.max(leftmax[i-1],height[i]);//(puranamaxheight,currentheight)

        }
        //calculate right max boundry
        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];//for last element
        for(int i=height.length-2; i>=0; i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
        int trappedwater =0;
        // loop
        for(int i=0;i<height.length;i++){
            //waterlevel = min(leftmax boundry, rightmax boundry)
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            
            trappedwater += (waterlevel-height[i])*width;
        }

       return trappedwater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int vol=trapped_vol(height,2);
        System.out.println("the volume of trapped water is :"+vol);

    }
}