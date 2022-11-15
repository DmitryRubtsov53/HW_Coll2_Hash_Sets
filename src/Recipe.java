import java.util.*;

public class Recipe {

    private String recipeName;
    private ArrayList<Product> products;
    public static double sumCostProd;

    public Recipe(String recipeName, ArrayList<Product> products) {
        //super(prodName, cost, amount, sold);
        this.recipeName = recipeName;
        this.products = products;
        sumCostProd =sumCostProd;
//        for (int i = 0; i < products.size(); i++) {
//            sumCostProd += products.get(i).getCost();
//        }
    }

 // getters -----------------------------------------------------------------------------
    public ArrayList<Product> getProducts() {
        return products;
    }
    public String getRecipeName() {
        return recipeName;
    }
    public static double getSumCostProd() {
        return sumCostProd;
    }

//--------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Рецепт " + recipeName + ", состав: " + products +
                ", Сумма стоимости продуктов = " + sumCostProd + " руб.";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(products, recipe.products)
                && Objects.equals(recipeName, recipe.recipeName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(products, recipeName);
    }
}
