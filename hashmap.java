public class hashmap {
    public static void main(String[] args) {
        int[] arr={1,7,5,-1,1};
        int target=6;
        int size=arr.length;
        int ans=fun(arr, size, target);
        System.out.println(ans);

    }
    
    static int fun(int[] arr, int size, int target){
        int count=0;
           for(int j=1; j<size; j++){
            for(int i=0; i<j; i++){
                 if(arr[i]+arr[j]==target)
                 count++;
            }
           }
           return count;
}

}
