package oops;
class Cake
{
	public Cake()
	{
		System.out.println("HAPPY BIRTHDAY");
	}
	public Cake(String msg, String shape) {
        System.out.println("Message: " + msg + ", Shape: " + shape);
    }
	public Cake(String shape, double price) {
        System.out.println("Shape: " + shape + ", Price: $" + price);
    }
}
public class ConstructOverloadingDemo {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
	        Cake defaultCake = new Cake();
	        Cake bdayCake = new Cake("Happy Birthday", "Round");
	        Cake pricedCake = new Cake("Round", 25.50);
	    }

}

