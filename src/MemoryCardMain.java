// Java program to demonstrate working of
// State Design Pattern

class MemoryCardMain
{
	public static void main(String[] args)
	{
		ActionStateContext stateContext = new ActionStateContext();
		stateContext.action();
		stateContext.action();
		stateContext.setState(new ReadData());
		stateContext.action();
		stateContext.action();
		stateContext.setState(new RemoveData());
		stateContext.action();		
		stateContext.action();	
		stateContext.setState(new UpdateData());
		stateContext.action();
	}
}
