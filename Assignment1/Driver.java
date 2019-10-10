import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;




public class Driver {
public static void main(String [] args){
char [] [] board = new char [5] [5];
initializeBoard (board );
Scanner console = new Scanner(System.in);
Random rand = new Random();
ArrayList<Location> locationofShip = new ArrayList<>();

int row1 = rand.nextInt(5);
int row2 = rand.nextInt(5);
int row3 = rand.nextInt(5);

int col1 = rand.nextInt(5);
int col2= rand.nextInt(5);
int col3= rand.nextInt(5);

Location placement1 = new Location(row1,col1);
Location placement2 = new Location(row2,col2);
Location placement3 = new Location(row3,col3);
locationofShip.add(placement1);
locationofShip.add(placement2);
locationofShip.add(placement3);


int numShip= 3;
int turns = 4;
for (int i= 0 ; i < turns; turns--){
System.out.println("You have " +turns + " turn left" );
System.out.println("You have " +numShip + "  ship left to destroy" );
System.out.println();
System.out.println("Guess the row (0-4)");
int inputRow = console.nextInt();
System.out.println("Guess the col (0-4)");
int inputCol = console.nextInt();
Location userGuess = new Location(inputRow, inputCol);
if(inputRow>4 || inputCol>4 ) {
System.out.println();
System.out.println("That not even in the ocean.");
updateBoard(board);
}
else if (board[inputRow][inputCol] == 'X' || board[inputRow][inputCol] == '*') {
System.out.println("You already guessed that location");
updateBoard(board);

}
else if (userGuess.equals(placement1)){
System.out.println();
locationofShip.remove(placement1);
board[inputRow][inputCol] = '*';
System.out.println("You sunk a battleship!");
updateBoard(board);
numShip--;
}
else if (userGuess.equals(placement2)){
System.out.println();
locationofShip.remove(placement2);
board[inputRow][inputCol] = '*';
System.out.println("You sunk a battleship!");
updateBoard(board);
numShip--;
}
else if (userGuess.equals(placement3)){
System.out.println();
locationofShip.remove(placement3);
board[inputRow][inputCol] = '*';
System.out.println("You sunk a battleship!");
updateBoard(board);
numShip--;
}

else {
System.out.println();
board[inputRow][inputCol] = 'X';
System.out.println("You missed my battleship!");
updateBoard(board);

}

}
System.out.println("Game Over");
}

public static void initializeBoard (char [] [] board )
{ 
for (int row= 0; row < board.length; row++) {
for (int col= 0; col < board[row].length; col++) {
board [row] [col] = 'O';
System.out.print(board[row] [col]+ "   ");
}
System.out.println();
}
}

public static void updateBoard(char[][] board) {
        for(int row = 0; row< board.length; row++) { 
            for(int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }


    }




}