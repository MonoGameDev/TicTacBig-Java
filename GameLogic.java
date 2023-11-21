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
}
