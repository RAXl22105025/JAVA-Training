package OOPs;
public class CaseStudy {
    public static void main(String[] args) {
        // Instantiate Candidate
        Candidate candidate = new Candidate("Arpan Mukherjee", "9876543210", "arpan@example.com", "Java Fullstack");

       
        candidate.show();
        candidate.display();

        //  Display Job Offers
        candidate.offer("Java", 2.0);
        candidate.offer("Java", 2.0, "Kolkata");
        candidate.offer("Java", 2.0, "Kolkata", "15-10-2026");

        //Show Interview Schedule 
        candidate.schedule();
    }
}
