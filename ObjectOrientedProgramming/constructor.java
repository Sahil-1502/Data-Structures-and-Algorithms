public class constructor {
    public static void main (String args[]){
        Student S1 = new Student();
        // Student S2 = new Student("sahil");
        // Student S3 = new Student(9291);
        S1.name = "Sahil";
        S1.rollNo = 9291;
        S1.password = "abcdef";

        S1.marks[0] = 100;
        S1.marks[1] = 90;
        S1.marks[2] = 80;

        Student S2 = new Student(S1);
        S2.password = "abc";

        S1.marks[2] = 100;

        for(int i=0;i<3;i++){
            System.out.println(S2.marks[i]);
        }
    }
}

class Student {
    String name;
    int rollNo;
    String password;
    int marks[];

    // copy constructor 
    // Shallow copy
    // Student(Student S1){
       
    //     this.name = S1.name;
    //     this.rollNo = S1.rollNo;
    //     this.marks = S1.marks;
    // }

    //deep copy constructor
    Student(Student S1){
        marks = new int[3];
        this.name = S1.name;
        this.rollNo = S1.rollNo;
        // for(int i=0;i<3;i++){
        //     this.marks[i] = S1.marks[i];
        // }
    }

    Student(String name){
        marks = new int[3];
        this.name = name;   
    }

    Student(){
        marks = new int[3];
        System.out.println("the constructor is called");
    }

    Student(int rollNo){
        this.rollNo = rollNo;
        marks = new int[3];

    }
}