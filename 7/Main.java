public class Main {
    public static void main(String[] args) {
		
        Tea[] objteas = new Tea[3];
        objteas[0] = new BlackTea();
        objteas[1] = new GreenTea();
        objteas[2] = new HerbalTea();

        for (Tea objtea : objteas) {
            System.out.println("Preparing Tea:");
            objtea.prepareTea();
            System.out.println("");
        }
    }
}
