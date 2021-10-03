// Java program to demonstrate working of
// State Design Pattern

class WriteData implements MemoryCardActionState
{
	@Override
	public void action(ActionStateContext ctx)
	{
		System.out.println("Write data in memory card...");
	}

}
