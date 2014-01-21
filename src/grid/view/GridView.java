package grid.view;

import grid.model.MarshmallowCreature;

public class GridView
{
	public void printIntInformation(int[][] currentArray)
	{
		System.out.println("forEach int printing");
		for (int[] currentRow : currentArray)
		{
			for (int currentNumber : currentRow)
			{
				System.out.print(currentNumber + "\t");
			}
			System.out.println();
		}
		System.out.println("for int printing");
		for (int row = 0; row < currentArray.length; row++)
		{
			for (int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col] + "\t");
			}
			System.out.println();
		}
	}

	public void printStringInformation(String[][] currentArray)
	{
		System.out.println("forEach string printing");
		for (String[] currentRow : currentArray)
		{
			for (String currentString : currentRow)
			{
				System.out.print(currentString + "\t");
			}
			System.out.println();
		}
		System.out.println("for string printing");
		for (int row = 0; row < currentArray.length; row++)
		{
			for (int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col] + "\t");
			}
			System.out.println();
		}
	}

	public void printMarshInformation(MarshmallowCreature[][] currentArray)
	{
		System.out.println("forEach Marsh printing");
		for (MarshmallowCreature[] currentRow : currentArray)
		{
			for (MarshmallowCreature currentMarsh : currentRow)
			{
				System.out.print(currentMarsh.getName() + "\t");
			}
			System.out.println();
		}
		System.out.println("for printing");
		for (int row = 0; row < currentArray.length; row++)
		{
			for (int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ": " + " Name " + currentArray[row][col].getName() + "; buttons " + currentArray[row][col].getHasButton() + "; eyes " + currentArray[row][col].getEyes() + "; Arms " + currentArray[row][col].getArms() + "; Legs " + currentArray[row][col].getLegs()
						+ "\t");
			}
			System.out.println();
		}
	}
}
