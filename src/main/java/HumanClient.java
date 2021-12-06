import java.util.ArrayList;
import java.util.List;

public class HumanClient implements BarObserver {
    private StringRecipe recipe;
    private StringDrink drink;
    private Bar bar;
    private List<StringDrink> drinks = new ArrayList<>();
    private List<StringRecipe> recipes = new ArrayList<>();
    private OrderingStrategy strategy;

    public HumanClient(OrderingStrategy strategy){
        this.strategy = strategy;
    }


    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        this.drink = drink;
        String ogDrink = drink.getText();
        this.recipe = recipe;
        this.bar = bar;
        strategy.wants(drink,recipe,bar);
        if(ogDrink == drink.getText()){
            drinks.add(drink);
            recipes.add(recipe);
        }

    }


    @Override
    public void happyHourStarted(Bar bar) {
        if(drinks.size() != 0)
            for(int i = 0; i < drinks.size(); i++){
                wants(drinks.get(i),recipes.get(i), (StringBar) bar);
        }

    }

    @Override
    public void happyHourEnded(Bar bar) {

        System.out.println("ENDED");
    }
}
