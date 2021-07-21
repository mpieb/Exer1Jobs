package com.jobs.domain;

public class Employee extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		
                if(salaryPerMonth<0) {
			System.err.println("El sou mensual és menor de cero!");
			throw new Exception();
		}
		if(paymentRate==null) {
			System.err.println("El percentatge és nul!");
			throw new Exception();
		}
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}

	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
	}

}

    



