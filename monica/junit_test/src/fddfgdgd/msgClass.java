package fddfgdgd;

public class msgClass {
	
	
	private String msg;
	
	public msgClass(String msg)
	{
		this.msg=msg;
	}
	
	public String printmsg()
	{
	System.out.println(msg);
	return msg;	
	}

	public String salutationmsg()
	{
		msg="monica"+msg;
		System.out.println(msg);
		return msg;
	}
	
	
}
