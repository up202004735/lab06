public class StringCaseChanger implements StringTransformer{
    public void execute(StringDrink drink){
        String aux = "";
        for(int i = 0; i < drink.getText().length(); i++){
            char letter = drink.getText().charAt(i);
            if(Character.isLowerCase(letter))
                aux = aux + Character.toUpperCase(letter);
            else
                aux = aux + Character.toLowerCase(letter);
        }
        drink.setText(aux);
    }
}
