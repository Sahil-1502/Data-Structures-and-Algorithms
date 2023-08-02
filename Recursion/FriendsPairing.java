public class FriendsPairing {
    public static void main(String args[]){
        System.out.println(Pairing(4)); 
    }
    public static int Pairing(int n){
        if(n == 1 || n ==2){
            return n;
        }
        return Pairing(n-1)+(n-1)*Pairing(n-2);
    }
}
