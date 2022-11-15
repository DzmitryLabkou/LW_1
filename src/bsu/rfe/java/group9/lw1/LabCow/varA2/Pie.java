package bsu.rfe.java.group9.lw1.LabCow.varA2;

public class Pie extends Food {

	private String filling = null;
	
	public String getFilling() {
		return filling;
	}

	public void setFilling(String filling) {
		this.filling = filling;
	}

	public Pie(String filling) {
		super("Pie");
		this.filling = filling;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ " with '" + filling.toUpperCase() + "' filling";
	}

	@Override
	public void consume() {
		System.out.println(this + " is eaten;");
	}

	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj)) {
			if(!(obj instanceof Pie))return false;
			return filling.equals(((Pie)obj).filling);
		} else
			  return false;
	}
}
