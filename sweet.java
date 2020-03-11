package epam.newyeargift;


	public class sweet extends Sweets {
		
		@Override
		void setWeight(double weight) {
		
		this.weight = weight;
		}
		double calcWeight (int numOfSweets) {
		return numOfSweets *weight;
		}

}

