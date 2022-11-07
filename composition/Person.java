package composition;

public class Person {
    private int age;
    private Job job; // any changes on the job class won't affect the rest of the code.

    public Person(int age, Job job) {
        this.age = age;
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job.getDescription();
    }
}
