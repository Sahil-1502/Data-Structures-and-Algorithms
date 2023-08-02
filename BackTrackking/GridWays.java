public class GridWays{
    public static void main(String args[]){
        int n=4 ,  m=5;
        System.out.println(gridWays(0, 0, n, m)); 
    }

    static int w1=0;
    static int w2=0;

    public static int gridWays(int i, int j,int n, int m){
        if(i==n-1 && j==m-1){                     // reached goal
            return 1;
        } else if(i == n || j==m){                // boundry cross kar di
            return 0;
        }
        int w1 = gridWays(i+1,j,n,m);
        int w2 = gridWays(i,j+1,n,m);
        return w1+w2;
    }
}
