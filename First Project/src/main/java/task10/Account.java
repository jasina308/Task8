package task10;

import java.util.Scanner;

public class Account {
	int initial_balance,withdraw_amount,deposit_amount,new_balance;
	public Account()//default constructor 
	{
		initial_balance=0;
		withdraw_amount=0;
		deposit_amount=0;
		
	}
	public Account(int initial_balance,int withdraw_amount,int deposit_amount)// constructor with parameters 
	{
		this.initial_balance=initial_balance;
		this.withdraw_amount=withdraw_amount;
		this.deposit_amount=deposit_amount;
	}
	
	public void setinitial_balance(int initial_balance)// get and set method for initial balance variable 
	{
		this.initial_balance=initial_balance;
	}
	public int getinitial_balance()
	{
		return initial_balance;
	}

    public void setWithdraw_amount(int withdraw_amount)// get and set method for withdraw balance variable 
    { 
	this.withdraw_amount=withdraw_amount;
    }
    public int getWithdraw_amount() 
    {
	return withdraw_amount;
    }

    public void setDeposit_amount(int deposit_amount)// get and set method for deposit amount variable
    {
	this.deposit_amount=deposit_amount;
    }
    public int getDeposit_amount()
    {
	return deposit_amount;
    }
    //Withdrawal method to perform withdrawal operation
	public int withdrawal()
	{
		new_balance=initial_balance-withdraw_amount;
		return new_balance;
	}
	// Deposit method performs deposit operation
	public int deposit()
	{
		new_balance=initial_balance+deposit_amount;
		return new_balance;
	}
   public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	   //object created for the constructors
		Account acc=new Account();
		Account acc1=new Account(2000,0,0);//initial balance set to 2000
		Scanner sc = new Scanner(System.in);
		System.out.println("select withdraw/deposit:");
		int select=sc.nextInt();
		// switch case used to perform withdrawal or deposit operation depending on the user choice  
		switch (select)
		{
		case 1:
			System.out.println("Enter withdraw amt");
			int withdraw_amount=sc.nextInt();
			acc1.setWithdraw_amount(withdraw_amount);
			acc1.getWithdraw_amount();
			System.out.println("Balance After withdraw: "+acc1.withdrawal());
			break;
		case 2:
			System.out.println("Enter deposit amt");
			int deposit_amount=sc.nextInt();
			acc1.setDeposit_amount(deposit_amount);
			acc1.getDeposit_amount();
			System.out.println("Balance after depsoit: "+acc1.deposit());
			
		}
		
		sc.close();
	}

}
