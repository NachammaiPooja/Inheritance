class Account{
	private String cname;
	private int pan;
	private int accno;
	private String branch;
	private float balance;
	private float min_bal;


	public Account(String cname,int accno,String branch,float balance){
		this.cname = cname;
		this.accno = accno;
		this.branch = branch;
		this.balance = balance;
		this.pan = -1;
		this.min_bal = 5000;
	}

	public Account(String cname,int pan,int accno,String branch,float balance){
		this.cname = cname;
		this.pan = pan;
		this.accno = accno;
		this.branch = branch;
		this.balance = balance;
		this.min_bal = 5000;
	}

	public String getCName(){
		return cname;
	}

	public int getPan(){
		return pan;
	}

	public int getAccNo(){
		return accno;
	}

	public String getBranch(){
		return branch;
	}

	public float getBalance(){
		return balance;
	}

	public void setPan(int pan){
		this.pan = pan;
	}

	public void setBalance(float balance){
		this.balance = balance;
	}

	public void deposit(int accno,float amount) throws PANRequiredException{
		if(this.accno == accno)
			if(amount > 50000 && pan == -1)
				throw new PANRequiredException(amount);
			else this.amount += amount;
	}

	public void withdraw(int accno,float amount) throws MinBalRequiredException,NotEnoughMoneyException
	{
		if(this.accno == accno)
			if(amount > balance)
				throw new NotEnoughMoneyException(balance);
			else if(balance - amount < min_bal)
				throw new MinBalRequiredException(balance);
			else
				this.amount -= amount;
	}
	
	public String toString(){
		return "Name       : " + cname + "\n" +
			   "Pan Number : " + pan + "\n" +
			   "Acc Number : " + accno + "\n" +
			   "Branch     : " + branch + "\n" +
			   "Balance    : " + balance + "\n";
	} 
}

class AccountNotFoundException extends Exception{
	private int accno;
	
	AccountNotFoundException(int accno){
		this.accno = accno;
	}
	
	public String toString(){
		return "Account number " + accno + " is invalid!";
	}
}

class NotEnoughMoneyException extends Exception{
	private float balance;
	
	NotEnoughMoneyException(float balance){
		this.balance = balance;
	}
	
	public String toString(){
		return "NotEnoughMoneyException: balance( " + balance + ") insufficient";
	}
}

class PANRequiredException extends Exception{
	private float amount;
	
	PANRequiredException(float amount){
		this.amount = amount;
	}
	
	public toString(){
		return "PANRequiredException: Amount ( " + amount + " ) greater than 50000";
	}
}

class MinBalRequiredException extends Exception{
	private float balance;
	
	MinBalRequiredException(float amount){
		this.amount = amount;
	}
	
	public String toString(){
		return "Mininum Balance Required!";
	}
}
	
	

class TestException{
	static Account search(Account[] acc,int accno){
		int index = -1;
		for(int i = 0 ; i < acc.length ; i++)
			if(acc[i].getAccNo() == accno){
				found = i;
				break;
			}
		if(index == -1)
			throw new AccountNotFoundException(accno);
		return acc[index];
	}
	
	public static void main(String[] args){
		
}
