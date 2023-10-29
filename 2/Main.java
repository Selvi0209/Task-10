public class Main {
    public static void main(String[] args) {
		Employee objEmployee = new Employee(1, "Sathvik", 50000.00);
        objEmployee.displayInfo();

        System.out.println("\nRaising salary by 10%...");
        objEmployee.raiseSalary(10);
        objEmployee.displayInfo();
    }
}
