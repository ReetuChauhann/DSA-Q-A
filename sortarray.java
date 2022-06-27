import java.util.Arrays;

import org.jcp.xml.dsig.internal.SignerOutputStream;

public class sortarray {
    public static void main(String[] args) {
        int[] arr={1,0,2,1,0,1,0};
        int count0=0;
        int count1=0;
        int count2=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count0++;
            }else if(arr[i]==1){
                count1++;
            }else{
                count2++;
            }
        }

         int k=0;
         for(int c0=0; c0<count0; c0++) arr[k++]=0;
           
           
        
         for(int c1=0; c1<count1; c1++)  arr[k++]=1;
            
            
         

         for(int c2=0; c2<count2; c2++) arr[k++]=2;
            
            
         

         System.out.println(Arrays.toString(arr));

        
    }
    
}
