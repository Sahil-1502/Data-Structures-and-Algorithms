import java.util.*;

public class arrayCC {

    public static void update(int marks[] , int nonChangeable){
        nonChangeable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = {10,20,30,40,50,60,70,80,90};
        int nonChangeable =5;
        update( marks, nonChangeable);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println(nonChangeable);

    }
}