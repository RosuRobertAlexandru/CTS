package assignment;

public class Account1 {
	public double	loan_value,rate;	
	public int	daysActive,account_Type;
	public static final int	STANDARD=0,BUDGET=1,PREMIUM=2,SUPER_PREMIUM=3;
	
	public double getloan() {
		return loan_value;
	}
	
	public double getRate() {
		return this.rate;
	}
	
	public double getMonthlyRate() {
		return loan_value*rate;
	}
	
	
	public void setValue(double value)  {
		if(value<0)
			throw new NoValueException();
		else
		{
			loan_value = value;
		}
	}
	public Account1(double value, double rate, int account_Type) {
		if(value<0)
			throw new NoValueException();
		else
		{
			loan_value = value;
		}
		this.rate = rate;
		this.account_Type = account_Type;
	}
	
		
	public void LoanInfo() {
	System.out.println("Loan: "+this.loan_value+"; rate: "+this.rate+"; days active:"+daysActive+"; Type: "+account_Type+";");
	}
	
	
	public static double calculate(Account1[] 	accounts)
	{
	double totalFee=0.0;
	Account1	account;
	int temp = 365;
	for	(int	i=0;i<accounts.length;i++)	{
	account=accounts[i];
	if(account.account_Type==Account1.PREMIUM||account.account_Type==Account1.SUPER_PREMIUM)	
	totalFee+=.0125	*	(	//	1.25%	broker's	fee
			account.loan_value*Math.pow(account.rate,(account.daysActive/365)) - account.loan_value);	//	interest-principal
	}
	return	totalFee;
	}


	
}
