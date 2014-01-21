package grid.model;

public class MarshmallowCreature
{
	private int legs;
	private int arms;
	private int eyes;
	private boolean hasButton;
	private String name;

	public void setLegs(int legs)
	{
		this.legs = legs;
	}

	public void setArms(int arms)
	{
		this.arms = arms;
	}

	public void setEyes(int eyes)
	{
		this.eyes = eyes;
	}

	public void setHasButton(boolean hasButton)
	{
		this.hasButton = hasButton;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getLegs()
	{
		return legs;
	}

	public int getArms()
	{
		return arms;
	}

	public int getEyes()
	{
		return eyes;
	}

	public boolean getHasButton()
	{
		return hasButton;
	}

	public String getName()
	{
		return name;
	}

	/**
	 * default constructor for MarshmallowCreature - Do not use.
	 */

	public MarshmallowCreature()
	{
		name = "nameless";
		arms = -10;
		eyes = -10;
		hasButton = false;
		legs = -10;
	}

	/**
	 * Creates a MArshmallowCreature with the specified parameters
	 * 
	 * @param name
	 *            the name of the creature
	 * @param hasButton
	 *            whether the creature has a button
	 * @param eyes
	 *            how many eyes the creature is constructed with
	 * @param arms
	 *            the number of arms of the creature
	 * @param legs
	 *            the number of legs on the creature
	 */
	public MarshmallowCreature(String name, boolean hasButton, int eyes,
			int arms, int legs)
	{
		this.name = name;
		this.arms = arms;
		this.eyes = eyes;
		this.hasButton = hasButton;
		this.legs = legs;
	}
}
//