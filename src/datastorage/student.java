package datastorage;

public class student 
{
	String Name;
	int roll_no;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	@Override
	public String toString() {
		return "student [Name=" + Name + ", roll_no=" + roll_no + "]";
	}
	
}
