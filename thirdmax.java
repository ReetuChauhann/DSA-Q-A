public class thirdmax {
    public static void main(String[] args) {
        int[] arr={20,10,30,60,70};
        sortfun(arr);
        int ans=findthirdmax(arr);
        System.out.println(ans);
    }
   
    static void sortfun(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j])
                  swap(arr, j-1,j);
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static int findthirdmax(int[] arr){
        int max=arr[0];
        for(int i=0; i<arr.length-2; i++){
            if(arr[i]>max)
            max=arr[i];
        }
       return max;        
    }
}
