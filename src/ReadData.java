// Java program to demonstrate working of
// State Design Pattern

class ReadData implements MemoryCardActionState
{
	@Override
	public void action(ActionStateContext ctx)
	{
		System.out.println("Read data form memory card...");
	}

}