package classroom_teacher;

public class Teacher {

	private int Teacherid;
	private String Tname;
	private Designation des;
	private classroom clr;
	
	public Teacher(int Teacherid, String Tname, Designation des,classroom clr)
	{
		this.Teacherid=Teacherid;
		this.Tname=Tname;
		this.des=des;
		this.clr=clr;
	}
	
	@Override
	public String toString()
	{
		return "TeacherID : "+this.Teacherid
				+" Teacher name : "+this.Tname
				+" Designation : "+this.des
				+clr.toString();
		
	}
}
