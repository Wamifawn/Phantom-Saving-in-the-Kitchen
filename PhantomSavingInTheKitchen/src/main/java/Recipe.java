import java.util.ArrayList;

public class Recipe {
    private ArrayList<Ingredient> allIngredients = new ArrayList<>();
    private double recipeCost;

    public Recipe(ArrayList<Ingredient> allIngredients){
        this.allIngredients = allIngredients;
    }

    public double calcRecipeCost(ArrayList<Ingredient> allIngredients){
        int i;
        double cost = 0.0;

        for (i = 0; i < allIngredients.size(); ++i){
            cost += allIngredients.get(i).cost;
        }

        this.recipeCost = cost;
        return this.recipeCost;
    }
}
