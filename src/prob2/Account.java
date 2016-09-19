package prob2;

public class Account {
	public Account(String accountNo){
		this.accountNo = accountNo;
		System.out.println(accountNo + "계좌가 생성되었습니다");
	}
	
	private String accountNo;
	private int balance;
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void save(int get){
		balance = balance + get;
		System.out.println(accountNo + "계좌에" + get + "만원이 입금되었습니다");
	}
	
	public void deposit(int out){
		balance = balance - out;
		System.out.println(accountNo + "계좌에서" + out + "만원이 출금되었습니다");
	}
	
}
