package com.revature.emp;

public class SalariedEmployee extends Employee implements Benifits {
	

		public double calculateSalary(int present)
		{
			return 2000*present;
		}

		@Override
		public String getBenifits() {
			return "Medical,Food coupons,transport";
		}

}

