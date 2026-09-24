package OOPs;
//Interface
interface Speak {
 void talks();
}



public class InterfaceDemo {
 public static void main(String[] args) {
     // Dynamic method dispatch / Upcasting to Speak interface
     Speak s;

     s = new Lecturer();
     s.talks();

     s = new Priest();
     s.talks();
 }
}

