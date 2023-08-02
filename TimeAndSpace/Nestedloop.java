public class Nestedloop {
    public static void main(String args[]){
        int k = 5;
        for(int i=0;i<50;i=i+k){
            for(int j=0;j<=k;j++){
                System.out.println("hi");
            }
        }
    }
}
