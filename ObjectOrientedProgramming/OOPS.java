public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen();  // created a pen object called p1
        p1.setColor("blue");
        // System.out.println(p1.color);
        System.out.println(p1.getColor());
         
        p1.setTip(5);

        // System.out.println(p1.tip);
        System.out.println(p1.getTip());

        // p1.color = "yellow";
        p1.setColor("yellow");

        // System.out.println(p1.color);
        System.out.println(p1.getColor());

    }
}

class Pen {
    // properties and fuctions 
    private String color;

    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        color = newColor; 
    }

    void setTip(int newTip){
        tip = newTip;
    }
}