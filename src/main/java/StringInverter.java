

public class StringInverter implements StringTransformer {
    @Override
    public void execute(StringDrink drink){
        String auxString = "";
        for(int i = 0; i < drink.getText().length(); i++){
            char letter = drink.getText().charAt(i);
            auxString = letter + auxString;
        }
        drink.setText(auxString);
    }
}
