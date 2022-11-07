package composition;

public class Main {
    public static void main(String[] args) {
        Job job = new Job(5000, "Backend developer");
        Person person = new Person(24, job);

        System.out.println("Age: " + person.getAge());
        System.out.println("Job: " + person.getJob());
    }
}
