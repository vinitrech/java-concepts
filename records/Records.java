package records;

// Records are a certain special type of class that generates private final fields for the components listed in the constructor,
// also generates public getter methods for the components (they are defined as field() instead or getField()),
// they don't generate a no-args constructor, only the public constructor with the fields declared.
// Also, they generate toString, equals and hashCode methods.
// Records are immutable, so they don't generate setters.

public class Records {
    public static void main(String[] args) {
        Employee employee = new Employee("Vinicius", 25);
        employee.getName();

        EmployeeRecord employeeRecord = new EmployeeRecord("Vinicius", 25);
        employeeRecord.name();
    }
}
