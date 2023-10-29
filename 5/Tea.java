public class Tea {
    private String ingredients = "hot water, tea leaves";

    public void prepareTea() {
        System.out.println("Preparing tea...");
        System.out.println("Adding " + ingredients + " to the tea.");
    }

    public void addMilk() {
        ingredients += ", milk";
        System.out.println("Adding milk to the tea.");
    }

    public void addSugar() {
        ingredients += ", sugar";
        System.out.println("Adding sugar to the tea.");
    }

    public String getIngredients() {
        return ingredients;
    }
}