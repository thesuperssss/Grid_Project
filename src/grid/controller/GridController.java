package grid.controller;

import grid.model.MarshmallowCreature;
import grid.view.GridView;

public class GridController
{

	private int[][] myFamilyAges;
	private String[][] friendName;
	private GridView consoleView;
	private MarshmallowCreature[][] marshMan;
	private MarshmallowCreature type;

	public GridController()
	{
		myFamilyAges = new int[3][3];
		friendName = new String[2][2];
		consoleView = new GridView();
		marshMan = new MarshmallowCreature[2][2];
		type = new MarshmallowCreature();
	}

	public void start()
	{
		fillAges();
		fillName();
		fillMarshMen();

		consoleView.printIntInformation(myFamilyAges);
		consoleView.printStringInformation(friendName);
		consoleView.printMarshInformation(marshMan);
	}

	private void fillName()
	{
		friendName[0][0] = "Grayson";
		friendName[0][1] = "Branden";
		friendName[1][0] = "Hyrum";
		friendName[1][1] = "Nathan";

	}

	private void fillAges()
	{
		for (int row = 0; row < myFamilyAges.length; row++)
		{
			for (int col = 0; col < myFamilyAges[0].length; col++)
			{
				myFamilyAges[row][col] = (int) (Math.random() * 50 + 1);
			}
		}
	}

	private void fillMarshMen()
	{
		int yesNo;
		Boolean noYes;
		for (int row = 0; row < marshMan.length; row++)
		{
			for (int col = 0; col < marshMan[0].length; col++)
			{
				yesNo = (int) (Math.random() * 10 + 1);
				if (yesNo > 5)
					noYes = true;

				else
					noYes = false;
				marshMan[row][col] = new MarshmallowCreature(friendName[row][col], noYes, (int) (Math.random() * 10 + 1), (int) (Math.random() * 30 + 1), (int) (Math.random() * 10 + 1));
			}
		}
	}
}
