public class powerOf2 {
    public static void main(String args[]){
        // powerOf2(3);
        setBits(10);
    }

    public static void powerOf2(int n){
        if((n&(n-1))==0){
            System.out.println("the number "+ n + " is a power of 2");
        } else {
            System.out.println("the number is not a power of two");
        }
    }
    public static void setBits(int n){
        int count = 0 ;
        for(;n>0;){
            if((n & 1) == 1){
                count ++;
            } 
            n= n>>1;

        }
        System.out.println(count);
    }
}
