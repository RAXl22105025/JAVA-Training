package OOPs;
class Job extends Company {
    public String tech;
    public double exp;
    public String enddt;
    public String city;

    // Overloaded offer method 1
    public void offer(String tech, double exp) {
        this.tech = tech;
        this.exp = exp;
        System.out.println("\nJOB OFFER1");
        System.out.println("Technology: " + this.tech + " | Required Experience: " + this.exp + " years");
    }

    // Overloaded offer method 2
    public void offer(String tech, double exp, String city) {
        this.tech = tech;
        this.exp = exp;
        this.city = city;
        System.out.println("\nJOB OFFER2");
        System.out.println("Technology: " + this.tech + " | Required Experience: " + this.exp + " years | City: " + this.city);
    }

    // Overloaded offer method 3
    public void offer(String tech, double exp, String city, String enddt) {
        this.tech = tech;
        this.exp = exp;
        this.city = city;
        this.enddt = enddt;
        System.out.println("\nJOB OFFER3");
        System.out.println("Technology: " + this.tech + " | Required Experience: " + this.exp + " years | City: " + this.city + " | End Date: " + this.enddt);
    }
}
