import java.util.Scanner;
class Employee
{   int eno;
    String ename,edes,ecname;
	double ebasic;
	void read()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Employee number");
		 eno=Integer.parseInt(s.nextLine());
		System.out.println("Enter Employee name");
		ename=s.nextLine();
		System.out.println("Enter Employee designation");
		edes=s.nextLine();
		System.out.println("Enter company name");
		 ecname=s.nextLine();
		do
		{
			System.out.println("enter employee basic salary");
			ebasic=Double.parseDouble(s.nextLine());
		}while(ebasic<0);
		
	}
	void validate()
	{
		double da=(0.25*ebasic);
		double ta=(0.15*ebasic);
		double hra=(0.1*ebasic);
		double ma=(0.05*ebasic);
		double cca=(0.02*ebasic);
		double Lic=(0.05*ebasic);
		double gpf=(0.02*ebasic);
		double tot=(ebasic+da+ta+hra+ma+cca)-(Lic+gpf);
		System.out.println("************************************************************************************");
		System.out.println("\t\temployee details");
		System.out.println("************************************************************************************");
		System.out.println("Employee number-->"+eno+"\t\temployee name-->"+ename);
		System.out.println("employee designation-->"+edes+"\temployee company name-->"+ecname);
		System.out.println("\t\temployee basic salary"+ebasic);
		System.out.println("************************************************************************************");
		System.out.println("da\t\t"+da);
		System.out.println("ta\t\t"+ta);
		System.out.println("hra\t\t"+hra);
		System.out.println("ma\t\t"+ma);
		System.out.println("cca \t\t "+cca);
		System.out.println("Lic\t\t "+Lic);
		System.out.println("gpf\t\t"+gpf);
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("\t\temployee ssalary                                               "+tot);
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------------------");
	}
}
public class EmployeeSal
{
	public static void main(String args[])
	{
      Employee obj=new Employee();
	      obj.read();
		  obj.validate();
		  
   }
}


