public class Static {
    public static void main(String args[]){

        Students S1 = new Students();
        S1.roll = 9291;
        S1.name = "Sahil";
        S1.schoolName = "Bishops";

        Students S2 = new Students();
        System.out.println(S2.schoolName);
    }
}

class Students {

    String name;
    int roll;

    static String schoolName;
    
    void getName(){
        System.out.println(this.name);
    }

    void setName(String name){
        this.name = name;
    }


}
