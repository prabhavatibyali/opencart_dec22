package Grouping;

import org.testng.annotations.Test;

public class Grouping {

	/*
	loginByEmail  - sanity & regression
	loginByfacebook - sanity
	loginBytwitter  - sanity

	signupbyemail - sanity & regression
	signupbyfacebook  - regression
	signupbytwitter  - regression

	paymentinrupees - sanity & regression
	paymentindollar - sanity  
	paymentReturnbyBank  - regression
	*/
	
	@Test(priority=1,groups={"sanity","regression"})
	void loginByEmail()
	{
		System.out.println("this is loginByEmail");
	}
	
	@Test(priority=2,groups={"sanity"})
	void loginByfacebook()
	{
		System.out.println("this is loginByfacebook");
	}
	
		
	@Test(priority=3,groups={"sanity"})
	void loginBytwitter()
	{
		System.out.println("this is loginBytwitter");
	}
	
	@Test(priority=4,groups={"sanity","regression"})
	void signupbyemail()
	{
		System.out.println("this is signupbyemail");
	}
	
	@Test(priority=5,groups={"regression"})
	void signupbyfacebook()
	{
		System.out.println("this is signupbyfacebook");
	}
	
	@Test(priority=6,groups={"regression"})
	void signupbytwitter()
	{
		System.out.println("this is signupbytwitter");
	}
	
	@Test(priority=7,groups={"sanity","regression"})
	void paymentinrupees()
	{
		System.out.println("this is paymentinrupees");
	}
	
	@Test(priority=8,groups={"sanity"})
	void paymentindollar()
	{
		System.out.println("this is paymentindollar");
	}
	@Test(priority=9,groups={"regression"})
	void paymentReturnbyBank()
	{
		System.out.println("this is paymentReturnbyBank");
	}
	
}
