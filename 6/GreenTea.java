public class GreenTea extends Tea {
    @Override
    public void prepareTea() {
        super.prepareTea();
        System.out.println("Green tea is brewed for 3 minutes.");
    }
}
