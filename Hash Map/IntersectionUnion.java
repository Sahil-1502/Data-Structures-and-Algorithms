import java.util.*;
public class IntersectionUnion {

    public static void union(int arr1[], int arr2[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i =0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        System.out.println(hs.size());      //set ko pura print kar dena
    }

    public static void intersection(int arr1[], int arr2[]){
        HashSet<Integer> hs1 = new HashSet<>();
        int count =0;
        for(int i=0;i<arr1.length;i++){
            hs1.add(arr1[i]);
        }
        for(int i =0;i<arr2.length;i++){
            if(hs1.contains(arr2[i])){
                count++;
                hs1.remove(arr2[i]);  //remove karte saath saath print bhi kar dena
            }
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        intersection(arr1, arr2);
        union(arr1, arr2);
    }
}
