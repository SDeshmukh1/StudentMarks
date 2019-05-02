package datastorage;

public class Marks 
{
	int maths;
	int science;
	int physics;
	
	@Override
	public String toString() {
		return "Marks [maths=" + maths + ", science=" + science + ", physics=" + physics + "]";
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	
}
