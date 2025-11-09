abstract class EcoCart {
	public abstract void Product();
		int id;
		String name;
		double price;
		double discountedPrice;
		abstract void getDiscountedPrice();
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public void setDiscountedPrice(double discountedPrice) {
			this.discountedPrice = discountedPrice;
		}

		void displayProductInfo() {
			System.out.print(id);
			System.out.print(name);
			System.out.print(price);
			System.out.print(id);
		}
		
	
		}
abstract class OrganicProduct extends EcoCart{
	double discount=0.1*price;
}

abstract class RecycledProduct extends EcoCart{
	double discount=0.05*price;
}

