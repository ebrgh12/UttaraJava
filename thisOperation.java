package thisOperator;

public class thisOperation {
private int i;

public void SetData(int ii)
{
	i=ii; // One way to set data
	this.i=ii; // Another way to set data
	
}
public void showData()
{
	System.out.print(i); // one way to display data
	System.out.print(this.i); // Another way to display data
}

}
