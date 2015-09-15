import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.io.File;
import java.io.IOException;

public class bringInArray
	{
		static ArrayList<String> animals = new ArrayList <String>();
		static String dataArray [][] = new String [4][4];
		
		public static void main(String[] args) throws IOException
			{
				randomizeAnimalList();
				fillDataArray();
			}

		public static void fillDataArray()
			{
				int counter = 0;
				for (int row=0; row<4; row++)
					{
						for (int col=0; col<4; col++)
							{
								dataArray[row][col] = animals.get(counter);
								counter++;
								
							}
					}
				
			}

		public static void randomizeAnimalList() throws IOException
			{
				animals.add("Dogs");
				animals.add("Cats");
				animals.add("Frog");
				animals.add("Bees");
				animals.add("Fish");
				animals.add("Toad");
				animals.add("Bugs");
				animals.add("Crab");
				animals.add("Toad");
				animals.add("Fish");
				animals.add("Frog");
				animals.add("Dogs");
				animals.add("Bugs");
				animals.add("Cats");
				animals.add("Crab");
				animals.add("Bees");
				Collections.shuffle(animals);
			}
	}
