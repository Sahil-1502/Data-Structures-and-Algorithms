import java.util.*;
public class getIthBit {
    public static void main (String args[]){
        // Scanner sc = new Scanner(System.in);
        // int n =15;
        // int i = sc.nextInt();
        System.out.println(updateIthBit(10, 1,0)); 

    }

    public static void GetIthBit (int n , int i ){
        int bitMask  = (n<<i);
        if((n & bitMask)==0){
            System.out.println("I'th bit is 0");
        }
        else {
            System.out.println("I'th bit is one");
        }

    }


// same code for set ith bit
// bit mask = 1<<i
// then do or for setting the bit to 1

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }

    public static int updateIthBit(int n, int i,int newNumber){
        //other approach 
        int t = clearIthBit(n, i);

        int  bitMask = newNumber<<i;

            return t|bitMask;









        // if(newNumber==0){
        //     return clearIthBit(newNumber, i);
        // } else if(newNumber == 1){
        //     return setIthBit(newNumber, i);
        // } 
    }

    
    
}