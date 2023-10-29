public class BlackTea extends Tea {
    @Override
    public void prepareTea() {
        super.prepareTea();
        System.out.println("Black tea is brewed for 5 minutes.");
    }
}