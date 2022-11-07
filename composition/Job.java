package composition;

public class Job {
    private int salary;
    private String description;

    public Job(int salary, String description) {
        this.salary = salary;
        this.description = description;
    }

    public int getSalary() {
        return salary;
    }

    public String getDescription() {
        return description;
    }
}
