public class StringReplacer implements StringTransformer {

    private char oldChar;
    private char newChar;

    public StringReplacer(char oldChar, char newChar){
        this.oldChar = oldChar;
        this.newChar = newChar;
    }

    @Override
    public void execute(StringDrink drink) {
        String aux = "";
        for(int i = 0; i < drink.getText().length(); i++){
            char letter = drink.getText().charAt(i);
            if(letter == oldChar)
                aux = aux + newChar;
            else
                aux = aux + letter;
        }
        drink.setText(aux);
    }
}
