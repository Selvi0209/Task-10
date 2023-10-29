public class Main {
    public static void main(String[] args) {
        BlackTea blackTea   = new BlackTea();
        GreenTea greenTea   = new GreenTea();
        HerbalTea herbalTea = new HerbalTea();

        System.out.println("Preparing Black Tea:");
        blackTea.prepareTea();

        System.out.println("\nPreparing Green Tea:");
        greenTea.prepareTea();

        System.out.println("\nPreparing Herbal Tea:");
        herbalTea.prepareTea();
    }
}
