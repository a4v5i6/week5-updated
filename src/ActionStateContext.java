// Java program to demonstrate working of
// State Design Pattern

class ActionStateContext
{
	private MemoryCardActionState currentState;

	public ActionStateContext()
	{
		currentState = new WriteData();
	}

	public void setState(MemoryCardActionState state)
	{
		currentState = state;
	}

	public void action()
	{
		currentState.action(this);
	}
}