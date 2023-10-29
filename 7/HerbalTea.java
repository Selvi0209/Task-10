public class HerbalTea extends Tea {
    @Override
    public void prepareTea() {
        super.prepareTea();
        System.out.println("Herbal tea is brewed for 7 minutes.");
    }
}