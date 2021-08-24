final class parent
{
	public void show()
	{
		System.out.println("Parent class.");
		System.out.println("this will not allow to creat child class ");
	}
}
public class Final_class {

	public static void main(String[] args) {
		
		parent obj = new parent();
		obj.show();
	}

}
