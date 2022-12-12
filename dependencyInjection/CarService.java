package dependencyInjection;

public class CarService {
    private CarDAO carDAO;
    private EmailService emailService;
    private Car car;

    public CarService(CarDAO carDAO, EmailService emailService, Car car) {
        // Avoid instantiating new objects, use dependency injection like this
        this.carDAO = carDAO;
        this.emailService = emailService;
        this.car = car;
    }
}
