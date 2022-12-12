package dependencyInjection;

public class Main {

    /*
        This approach is just a demonstration of dependency injection.
        In a real project, use annotations (@Bean, @Component, etc) to manage components lifecycle,
        those annotations guarantee that there is only 1 instance of the
        object in memory, using Singleton pattern.
     */

    public static void main(String[] args) {
        // dependencies
        CarDAO carDAO = new CarDAO();
        EmailService emailService = new EmailService();
        Car car = new Car();

        // inject
        CarService carService = new CarService(carDAO, emailService, car);
    }
}
