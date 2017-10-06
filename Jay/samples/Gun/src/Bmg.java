
public class Bmg extends AddBullets {

	public Bmg(Gun newgun) {
		// TODO Auto-generated constructor stub
		super(newgun);
		
		 System.out.println("Adding Bmg into the gun");

	}

	 public String getDescription(){
		 return tempgun.getDescription() + ", BMG";

	 }
	 
	 public double getCost(){
		 return tempgun.getCost() + .50;

	 }
}
