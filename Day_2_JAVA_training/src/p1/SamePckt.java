package p1;

class Tests
{  
    public int x = 25;
    private int y = 30;
    protected int z = 60;
    int d = 45;

    public void show_x() {
        System.out.println("X: " + x);
    }
    private void show_y() {
        System.out.println("Y: " + y);
    }
    protected void show_z() {
        System.out.println("Z: " + z);
    }
    void show_d() {
        System.out.println("D: " + d);
    }
}

public class SamePckt {

    public static void main(String[] args) {
        // Fixed: Create an object of the 'Tests' class instead of 'SamePckt'
        Tests sm = new Tests();
        
        sm.show_x(); // Works: public is accessible anywhere
        sm.show_z(); // Works: protected is accessible within the same package
        sm.show_d(); // Works: default (package-private) is accessible within the same package
        
        // Note: sm.show_y(); would fail because it is private to the Tests class.
    }
}
