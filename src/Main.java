import java.util.*;

public class Main {


    public static void main(String[] args) {

        System.out.println("Домашнее задание: Введение в коллекции. Hash и множества______________________________ ");
        System.out.println();

// Списки для Задачи № 1 Продукты :
        Product apple = new Product("Яблоки", 57.25, 1, false);
        Product vodka = new Product("Водка", 299.99, 0.5, false);
        Product tea1 = new Product("Чай", 99.99, 0.1, false);

        ArrayList<Product> basket = new ArrayList<>();
        basket.add(new Product("Сало", 450, 1, false));
        basket.add(new Product("Хлеб", 50.5, 0.5, false));
        basket.add(new Product("Масло", 120, 0.2, false));
        basket.add(new Product("Колбаса", 399.99, 1, false));
        basket.add(new Product("Чай", 99.99, 0.1, false));
        basket.add(new Product("Сыр", 525.5, 1, false));

// Списки для Задачи № 2 Рецепты :
        ArrayList<Product> basket1 = new ArrayList<>();
        basket1.add(new Product("Сельдь", 250, 1, false));
        basket1.add(new Product("Лук", 25, 1, false));
        basket1.add(new Product("Майонез", 75, 0.4, false));

        ArrayList<Product> basket2 = new ArrayList<>();
        basket2.add(new Product("Пиво", 154.52, 1, false));
        basket2.add(new Product("Вобла", 253.7, 1, false));
// Множество рецептов :
        ArrayList<Recipe> recipes = new ArrayList<>();
//        recipes.add(new Recipe("Лабуда",basket));
        recipes.add(new Recipe("Закуска",basket1));
        recipes.add(new Recipe("Баня",basket2));

        Recipe opohmel = new Recipe("Опохмел", basket2);
        Recipe bania = new Recipe("Баня",basket2);

// Вызов методов --------------------------------------------------------------------

        printProduct(basket);
        System.out.println();
        addProduct(basket, apple);
        printProduct(basket);
        addProduct(basket, vodka);
        printProduct(basket);

//        addProduct(basket, tea1);  // Добавление с целью проверки срабатывания исключения на одинаковые объекты.
//        printProduct(basket);

        System.out.println();
        removeProduct(basket);
        printProduct(basket);

//        addRecipe(recipes,opohmel);  // этот рецепт добавлен.
        addRecipe(recipes,bania);      // этот рецепт отвергнут.
        System.out.println(recipes.toString());

    } // main ------------------------------------------------------------------------------------------

    public static void addRecipe(ArrayList<Recipe> recipes, Recipe recipe) {

        for (int j = 0; j < recipes.size(); j++) {
            System.out.println("j = " + j + " " + recipe.getRecipeName().equals(recipes.get(j).getRecipeName()));
            if (recipe.getRecipeName().equals(recipes.get(j).getRecipeName())) {
                throw new RuntimeException("Этот рецепт уже есть!");
            } else if (j == recipes.size() - 1) {
                recipes.add(recipe);
                break;
            }
        }
    }

    public static void removeProduct (ArrayList<Product> basket) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название товара на русском(с большой буквы), который уже куплен.");
        String p = scanner.nextLine();
        Iterator<Product> iter = basket.iterator();
        while(iter.hasNext()) {
            Product next = iter.next();
            if (p.equals(next.getProdName())) {
                next.setSold(true);
                System.out.println("Следующий товар куплен и будет удалён из корзины: " + "\n" + next);
                iter.remove();
                scanner.close();
            }
        }
    }

    public static void addProduct(ArrayList<Product> basket, Product product) {

        for (int j = 0; j < basket.size(); j++) {
            System.out.println("j = " + j + " " + product.equals(basket.get(j)));
            if (product.equals(basket.get(j))) {
               throw new RuntimeException("Этот товар уже есть в корзине!");
              } else if (j == basket.size() - 1) {
                basket.add(product);
                break;
                }
        }
    }

    public static void printProduct (ArrayList<Product> basket) {
        System.out.println("В корзине " + basket.size() + " продуктов:" );
        for (Product el : basket) {
            System.out.print(el + "\n");
        }
    }

} // class