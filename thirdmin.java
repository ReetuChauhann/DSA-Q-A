public class thirdmin {
    public static void main(String[] args) {
        int[] arr={10,30,20,70,60};
        sortfun(arr);
       
       System.out.println("Third Min element : "+arr[2]);

    }

    static void sortfun(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j])
                swap(arr,j-1,j);
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    
}
