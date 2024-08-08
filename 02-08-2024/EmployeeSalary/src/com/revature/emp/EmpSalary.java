package com.revature.emp;

public class EmpSalary {
	public static void main(String [] args)
	{
		SalariedEmployee se=new SalariedEmployee();
		se.setEmpId(101);
		se.setEmpName("Rocky");
		se.setDaysPresent(20);
	     System.out.println(se);
	     System.out.println(se.calculateSalary(se.getDaysPresent()));
	     System.out.println(se.getBenifits());
	ContractualEmployee ce=new ContractualEmployee(202,"Rock",120);
	System.out.println(ce);
	System.out.println(ce.calculateSalary(ce.getDaysPresent()));
	}

}
