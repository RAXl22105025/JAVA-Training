package OOPs;
class Candidate extends Job implements Interview {
    public String candnm;
    public String phno;
    public String email;
    public String tech;

    // Constructor
    public Candidate(String candnm, String phno, String email, String tech) {
        this.candnm = candnm;
        this.phno = phno;
        this.email = email;
        this.tech = tech;
    }

    // Display Candidate Details
    public void show() {
        System.out.println("CANDIDATE DETAILS");
        System.out.println("Name: " + this.candnm);
        System.out.println("Phone: " + this.phno);
        System.out.println("Email: " + this.email);
        System.out.println("Skill/Tech: " + this.tech);
    }

    // Implemented from Interview interface
    @Override
    public void schedule() {
        System.out.println("\nDATE OF INTERVIEW");
        System.out.println("Scheduled on: 28th September 2026 at 10:30 AM");
    }
}

