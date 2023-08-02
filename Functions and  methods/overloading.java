public class overloading {

    public static int sum(int a ,int b){
        return a+b;
    }

    public static int sum(int a ,int b ,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
        System.out.println( sum(5,6,8));
    }
    
}
