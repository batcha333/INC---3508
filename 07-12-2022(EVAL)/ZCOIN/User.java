import java.util.ArrayList;
class User
{	
	private String userName;
	private String userMail;
	private int userNumber;
	private int userId;
	private String password;
	private int rcDeposit;
	boolean access = false;
	private int zId;
	final String domain = "@zexchange.com";
	private double zWallet;
	ArrayList<String> history = new ArrayList<>();
	
	public User(){}
	
	public User(String userName,String userMail,int userNumber,int userId,String password,int rcDeposit) 
	{
		this.userName = userName; 
		this.userMail = userMail+domain; 
		this.userNumber = userNumber;
		this.userId = userId;
		this.password = password;
		this.rcDeposit = rcDeposit;
	}
	
	public void setZId(int zId)
	{
		this.zId = zId;
	}
	public int getZId()
	{
		return zId;
	}

	public void setZWallet(double zWallet)
	{
		this.zWallet = zWallet;
	}
	public double getZWallet()
	{
		return zWallet;
	}
	
	public String getUserName()
	{
		return userName;
	}
	public String getUserMail()
	{
		return userMail;
	}
	public int getUserNumber()
	{
		return userNumber;
	}
	public int getUserId()
	{
		return userId;
	}
	public String getPassword()
	{
		return password;
	}
	public int getRcDeposit()
	{
		return rcDeposit;
	}
}