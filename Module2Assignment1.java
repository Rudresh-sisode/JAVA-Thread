import java.util.Scanner;
public class Module2Assignment1
{
	public static void display(int[] a,String[] b,int[] c)
	{
		System.out.println("In Display Method");
		System.out.println("ID\tName\tSalary");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]+"\t"+b[i]+"\t"+c[i]);
		}
	}
	
	//function overloading
	
	public static void display(int[] a,String[] b)
	{
		System.out.println("In Display Method");
		System.out.println("ID\tName");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]+"\t"+b[i]);
		}
	}
	
	public static void display(String a,int[] id,String[] name,int[] salary)
	{
		int v=0;
		for(int i=0;i<5;i++)
		{
			if(a.equals(name[i]))
			{
				v=i;
				for(int j=v;;)
				{
					System.out.println("Id\tName\tsalary");
					System.out.println(id[j]+"\t"+name[j]+"\t"+salary[j]);
					v=1;
					break;
				}
			}
			
		}
		if(v==0){
			System.out.println("sorry no result found");
		}
		
		
	}
	
	public static void main(String... arvs)
	{
		int[] id=new int[5];
		String[] name=new String[5];
		int[] salary=new int[5];
		Scanner input=new Scanner(System.in);
		System.out.println("please enter the 5 Employee ID");
		for(int i=0;i<5;i++)
		{
			id[i]=input.nextInt();
		}
		System.out.println("Id has been entered..thanks!!!");
		
		System.out.println("please enter the 5 Employee Name");
		for(int i=0;i<5;i++)
		{
			name[i]=input.next();
		}
		
		System.out.println("Name has been entered..thanks!!!");
		
		System.out.println("please enter the 5 Employee Salary based on work");
		for(int i=0;i<5;i++)
		{
			salary[i]=input.nextInt();
		}
		
		System.out.println("Name has been entered..thanks!!!");
		
		System.out.println("Do you want to print the data (print YES(yes) or NO(no)");
		String ans=input.next();
		if(ans.equals("YES") || ans.equals("yes")){
		display(id,name,salary);	
		System.out.println("\n");
		display(id,name);
		}
		else
		{
			System.out.println("sorry Program terminated!!");
		}
		
		System.out.println("would you like to search any employee details (enter name)");
		String name2=input.next();
		display(name2,id,name,salary);
		
	}
}