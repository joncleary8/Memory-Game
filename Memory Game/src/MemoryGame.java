import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class MemoryGame
	{

		public static void main(String[] args) throws IOException
			{
				introduction.intro();
				board.fillBlankBoard();
				bringInArray.randomizeAnimalList();
				bringInArray.fillDataArray();
				board.printBlankBoard();
				
			}
	}
