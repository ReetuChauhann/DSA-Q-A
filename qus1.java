public class qus1 {
    public static void main(String[] args) {
        //int[] arr={1,3,6,2};
        int[] arr={1,2,3,4};
        int ans=fun(arr);
        System.out.println(ans);

    }
    
    public static int fun(int[] arr) {       
         
        // Finding index of max of the array
        int maxIndex = 0;
        for (int i = 0; i < arr.length; ++i)
            if (arr[i] > arr[maxIndex])
                maxIndex = i;
         
        // Returns -1 if the max element is not
        // twice of the i-th element.       
        for (int i = 0; i < arr.length; ++i)            
            if (maxIndex != i && arr[maxIndex] < 2 * arr[i])
                return -1;
         
        return maxIndex;
    }

    
}
