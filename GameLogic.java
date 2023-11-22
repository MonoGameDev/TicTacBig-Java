import java.util.ArrayList;

public class GameLogic {

    ArrayList<Symbol>symbolList = new ArrayList<Symbol>();
    public Symbol getSymbol(int x, int y){
        for (Symbol symbol : symbolList) {
            if (symbol.x == x && symbol.y == y) {
                return symbol;
            }
        }
        return null;
    }
    public void setSymbol(Symbol player){
        symbolList.add(player);
    }
    public void onClick(int x, int y){
        if (getSymbol(x, y) == null){   //We check if the field is occupied

            //We have to check if a Symbol is placed near the the field that the user wants to mark(left, right, up or down).
            //If true ====> save and draw Symbol
            /*if (getSymbol(x-gridSize, y) != null || getSymbol(x+gridSize, y) != null || getSymbol(x, y-gridSize) != null || getSymbol(x, y+gridSize) != null){
                setSymbol(getSymbol(x, y));
                drawSymbol(x, y)
             */
            }else {
                //Nothing happens or popup will appear saying "Diagonal movement is not allowed"
            }
        }else {
            //Nothing happens or popup will appear saying "Field already occupied"
        }

    }
}
