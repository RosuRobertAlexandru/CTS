package assignment;

public class Calculator {

	public int	daysActive,account_Type;
	
	public  double calculate(Account1[] 	accounts)
	{
		Account1 account = new Account1(1000,12,1);
		Account1 account1 = new Account1(2000,22,3);
	double totalFee=0.0;
	int temp = 365;
	for	(int	i=0;i<accounts.length;i++)	{
	account=accounts[i];
	if(account.account_Type==Account1.PREMIUM||account.account_Type==Account1.SUPER_PREMIUM)	
	totalFee+=.0125	*	(account.loan_value*Math.pow(account.rate,(account.daysActive/temp)) - account.loan_value);	//	interest-principal
	}
	return	totalFee;
	}
	
	

	
}
