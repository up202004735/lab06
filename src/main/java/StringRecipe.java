import java.util.List;

public class StringRecipe {

    private List<StringTransformer> transformers;

    public StringRecipe(List<StringTransformer> transformers){
        this.transformers = transformers;
    }

    public void mix(StringDrink drink){
        for(int i = 0; i < transformers.size(); i++){
            StringTransformer transformer = transformers.get(i);
            transformer.execute(drink);
        }
    }
}
