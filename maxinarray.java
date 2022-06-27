public class maxinarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int ans=maxfun(arr);
        System.out.println(ans);
        int ans2=minfun(arr);
        System.out.println(ans2);
    }
    
    static int maxfun(int[] arr){
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max)
            max=arr[i];
        }
        return max;
    }

    static int minfun(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min)
            min=arr[i];
        }
        return min;
    }
}
