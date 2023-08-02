public class Nqueens {

    //print only one solution 
    static int count=0;
    public static void main(String args[]){
        int n = 4;
        char board[][] = new char[n][n];
        //initializing the board
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }

        //initial n queens
        // nQueens(board, 0);

        // count
        // System.out.println(count);


        System.out.println(nQueens(board, 0));

        printBoard(board);
    }

    // public static void nQueens(char board[][], int row){

    //     if(row == board.length){
    //         // printBoard(board);
    //         count++;
            
    //     }
    //     for(int j=0;j<board.length;j++){
    //         if(isSafe(board,row,j)==true){
    //             board[row][j]='Q';
    //             nQueens(board,row+1);
    //             board[row][j] = 'X';
    //         } 
    //     }
    // }

    public static boolean nQueens(char board[][], int row){

        if(row == board.length){
            // printBoard(board);
            return true;
            
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)==true){
                board[row][j]='Q';
                if(nQueens(board,row+1) == true){
                    return true;
                }
                board[row][j] = 'X';
            } 
        }
        return false;
    }

    public static boolean isSafe(char board[][], int row, int col){
        
        // vertical up
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //left diagonal up
        for(int i=row-1, j=col-1; i>=0 && j>=0 ; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //right diagonal up
        for(int i=row-1,j=col+1;i>=0 && j<board[0].length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }



    public static void printBoard(char board[][]){
        System.out.println("----------chess board-----------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
