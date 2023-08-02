import java.util.*;

public class ArrayAsArgument {

    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i] +1;
        }
    }

    public static void print(int marks[]){
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = {95,96,95};
        update(marks);
        print(marks);
    }
}