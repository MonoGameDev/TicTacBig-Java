import sun.awt.Symbol;

import java.util.ArrayList;

public class GameLogic {

    ArrayList<Symbol>symbolList = new ArrayList<Symbol>();
    public Symbol getSymbol(int x, int y, String player){
        return null;
        for (Symbol symbol : symbolList) {
            if (symbol.x == x && symbol.y == y) {
                return symbol;
            }
        }
    }
    /*public void setSymbol(Symbol player){
        symbolList.add(player);
    }*/
    public Symbol addSymbol(int x, int y, String p){    //wird gerufen, wenn getSymbol kein Symbol findet
        Symbol s = Symbol(x,y,p);       //überladene Konstruktor
        return s;                       //das Objekt in der Liste speichern
    }
    public void onClick(int x, int y, String player){
        if (getSymbol(x, y) == null){   //We check if the field is occupied

            //We have to check if a Symbol is placed near the the field that the user wants to mark(left, right, up or down).
            //If true ====> save and draw Symbol
            if (getSymbol(x-1, y) != null || getSymbol(x+1, y) != null || getSymbol(x, y-1) != null || getSymbol(x, y+1) != null){
                addSymbol(x,y,player);


            }else {
                //Nothing happens or popup will appear saying "Diagonal movement is not allowed"
            }
        }else {
            //Nothing happens or popup will appear saying "Field already occupied"
        }

    }
}
