
public class Porte
{
	private boolean open;
	public Porte(boolean open) 
	{
		this.open = open;
	}
	public boolean isOpen() 
	{
		return open;
	}
	public void setOpen(boolean open) 
	{
		this.open = open;
	}
	public String toString() 
	{
		return "Porte [open=" + open + "]";
	}
	
}
