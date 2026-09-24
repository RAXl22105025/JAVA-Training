package OOPs;
class Outer {
    int x = 25;

    // Inner class nested inside Outer
    class Inner {
        public int y = 60;

        public void add() {
            int sum = x + y; // Inner class directly accesses Outer class member 'x'
            System.out.println("Outer x: " + x);
            System.out.println("Inner y: " + y);
            System.out.println("Sum: " + sum);
        }
    }
}
public class OuterInnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Outer outerObj = new Outer();
        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.add();
	}

}
