import java.util.*;
class Employee
{
	String ename,ecode;
	int age;
	void accept_details()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name ");
			ename=sc.nextLine();
			System.out.println("Enter employee code");
			ecode=sc.nextLine();
			System.out.println("Enter age");
			age=sc.nextInt();
		}
		void show_details()
		{
			System.out.println("Employee Name"+ename);
			System.out.println("Employee code"+ecode);
			System.out.println("Employee age"+age);
		}
}

class manager extends Employee
{
	int salary;
	void accept_sal()
	{
		accept_details();//method of employee class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary");
		salary=sc.nextInt();
	}
	void show_salary()
	{
		show_details();//method of employee class
		System.out.println("Salary is "+salary);
	}
}

class worker extends Employee
{
	int wages;
	void accept_wages()
	{
		accept_details();//method of employee class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter wages");
		wages=sc.nextInt();
	}
	void show_wages()
	{
		show_details();//method of employee class
		System.out.println("Wage is "+wages);
	}
}
		
		class  emp_worker
		{
			public static void main(String args[])
				{
					manager m=new manager();
					//m.acccept_details();
					m.accept_sal();
					//m.show_details();
					m.show_salary();
					worker w=new worker();
					//w.acccept_details();
					w.accept_wages();
					//w.show_details();
					w.show_wages();
				}
		}
			
