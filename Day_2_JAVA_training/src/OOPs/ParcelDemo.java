package OOPs;
class Parcel {

  class Destination {
     public void desti(String loc) {
         System.out.println("Destination Location: " + loc);
     }
 }

  class Contents {
     public void weight(double w) {
         System.out.println("Parcel Weight: " + w + " kg");
     }
 }
}

public class ParcelDemo {
 public static void main(String[] args) {
          Parcel parcel = new Parcel();

     Parcel.Destination dest = parcel.new Destination();
     Parcel.Contents content = parcel.new Contents();
     dest.desti("New York");
     content.weight(4.75);
 }
}
