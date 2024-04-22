package classroom_teacher;

public class classroom {
	
	private int roomid;
	private String name;
	public classroom(int roomid,String name)
	{
		this.roomid=roomid;
		this.name=name;
	}
	
	public void setroomid(int roomid)
	{
		this.roomid=roomid;
	}
	public int getroomid()
	{
		return roomid;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	public String getname()
	{
		return name;
	}

	@Override
	public String toString()
	{
		return "  Roomid : "+this.roomid+" name : "+this.name;
	}
}
