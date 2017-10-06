
abstract class AddBullets implements Gun {

	protected Gun tempgun;
	
	public AddBullets(Gun newgun)
	{
		tempgun = newgun;
	}
	
	 public String getDescription() {
		
		  return tempgun.getDescription();
		  }
		
		     public double getCost() {
		
		         return tempgun.getCost();
		 }

}
