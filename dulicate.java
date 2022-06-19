import java.util.*;
public class dulicate {
    public static void main(String[] args) {
        int[] arr={3,5,6,7,8,5,3};
        Set<Integer> st=new HashSet<>();
        for(int i=0; i<arr.length; i++){
            st.add(arr[i]);
        }
        Iterator i=st.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }

    
    
}
