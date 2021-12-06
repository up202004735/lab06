public class ImpatientStrategy implements OrderingStrategy{
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        bar.order(drink,recipe);
    }
    public void happyHourStarted(StringBar bar){
        int happyHour = 1;
    }
    public void happyHourEnded(StringBar bar){
        int happyHour = 0;
    }
}
