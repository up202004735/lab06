import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{
    private List<StringDrink> drinks = new ArrayList<>();
    private List<StringRecipe> recipes = new ArrayList<>();
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        if(bar.isHappyHour())
            bar.order(drink,recipe);
        else{
            drinks.add(drink);
            recipes.add(recipe);
        }


    }
    public void happyHourStarted(StringBar bar){
        if(drinks.size() != 0)
            for(int i = 0; i < drinks.size(); i++){
                wants(drinks.get(i),recipes.get(i), (StringBar) bar);
            }
    }
    public void happyHourEnded(StringBar bar){
        int happyHour = 0;
    }
}
