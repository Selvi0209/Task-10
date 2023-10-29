public class Main {
    public static void main(String[] args) {
        Tea tea = new Tea();

        tea.prepareTea();
        tea.addMilk();
        tea.addSugar();

        String ingredients = tea.getIngredients();

        System.out.println("Ingredients: " + ingredients);
    }
}