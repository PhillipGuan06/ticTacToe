import java.util.Scanner;

public class ticTacToe{
    public static void main(String[] args) {

        char[][] board = {{' ', '|', ' ', '|', ' '},
                        {'-','+','-','+','-'},
                        {' ', '|',' ','|',' '},
                        {'-','+','-','+','-'},
                        {' ', '|',' ','|',' '}};
        printGameBoard(board);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your placement (1-9)");
        int pos = scan.nextInt();
        printGameBoard(placement(board, pos, 'X'));
        //System.out.println(pos);
    }

    //Method to print the gameboard;
    public static void printGameBoard(char[][] board){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++) {
                    System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    //Method to place a X or O
    public static char[][] placement(char[][] board, int place, char letter) {
        if (place > 9 || place < 0) {
            System.out.println("Please pick number between 1 and 9");
        }
        if (place == 1 && board[0][0] == ' '){
            board[0][0] = letter;
        }
        if (place == 2 && board[0][2] == ' '){
            board[0][2] = letter;
        }
        if (place == 3 && board[0][4] == ' '){
            board[0][4] = letter;
        }
        if (place == 4 && board[2][0] == ' '){
            board[2][0] = letter;
        }
        if (place == 5 && board[2][2] == ' '){
            board[2][2] = letter;
        }
        if (place == 6 && board[2][4] == ' '){
            board[2][4] = letter;
        }
        if (place == 7 && board[4][0] == ' '){
            board[4][0] = letter;
        }
        if (place == 8 && board[4][2] == ' '){
            board[4][2] = letter;
        }
        if (place == 9 && board[4][4] == ' '){
            board[4][4] = letter;
        }

        return board;
    }
}