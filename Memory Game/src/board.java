import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class board
	{
		static String boardArray [][] = new String [4][4];
		
		public static void main(String[] args) throws IOException 
			{
				constructBoard();
				fillBlankBoard();
				printBlankBoard();
			}

	

		public static void printBlankBoard()
			{
				System.out.println("   1      2      3      4 ");
				System.out.println("-----------------------------");
				System.out.println("A | " + boardArray[0][0] + " | " + boardArray[0][1] + " | " + boardArray[0][2] + " | " + boardArray[0][3] + " | ");
				System.out.println("-----------------------------");
				System.out.println("B | " + boardArray[1][0] + " | " + boardArray[1][1] + " | " + boardArray[1][2] + " | " + boardArray[1][3] + " | ");
				System.out.println("-----------------------------");
				System.out.println("C | " + boardArray[2][0] + " | " + boardArray[2][1] + " | " + boardArray[2][2] + " | " + boardArray[2][3] + " | ");
				System.out.println("-----------------------------");
				System.out.println("D | " + boardArray[3][0] + " | " + boardArray[3][1] + " | " + boardArray[3][2] + " | " + boardArray[3][3] + " | ");
				System.out.println("-----------------------------");
				
			}



		public static void constructBoard()
			{
				System.out.println("      1      2      3      4 ");
				System.out.println("  -----------------------------");
				System.out.println("A | " + boardArray[0][0] + " | " + boardArray[0][1] + " | " + boardArray[0][2] + " | " + boardArray[0][3] + " | ");
				System.out.println("  -----------------------------");
				System.out.println("B | " + boardArray[1][0] + " | " + boardArray[1][1] + " | " + boardArray[1][2] + " | " + boardArray[1][3] + " | ");
				System.out.println("  -----------------------------");
				System.out.println("C | " + boardArray[2][0] + " | " + boardArray[2][1] + " | " + boardArray[2][2] + " | " + boardArray[2][3] + " | ");
				System.out.println("  -----------------------------");
				System.out.println("D | " + boardArray[3][0] + " | " + boardArray[3][1] + " | " + boardArray[3][2] + " | " + boardArray[3][3] + " | ");
				System.out.println("  -----------------------------");
					
			}
		
		private static void fillBlankBoard()
			{
				for (int row=0; row<boardArray.length; row++)
					{
						for (int col=0; col<boardArray[0].length; col++)
							{
								boardArray[row][col] = (" XX "); 
							}
					}
				
			}
	}
