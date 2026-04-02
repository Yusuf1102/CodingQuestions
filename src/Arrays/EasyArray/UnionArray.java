package Arrays.EasyArray;


import java.util.Set;
import java.util.TreeSet;

public class UnionArray {

    public static void union_array(int arr1[],int arr2[],int n,int m){
        Set<Integer> set = new TreeSet<>();
        for(int i = 0 ; i<n;i++){
            set.add(arr1[i]);
        } for(int j = 0 ; j<m;j++){
            set.add(arr2[j]);
        }
        for(int nums : set){
            System.out.print(nums+ " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = new int[]{1, 1, 2, 3, 4, 5};
        int arr2[] = new int[]{2, 3, 4, 4, 5, 6};
        int n = arr1.length;
        int m = arr2.length;
        union_array(arr1,arr2,n,m);

    }
}
