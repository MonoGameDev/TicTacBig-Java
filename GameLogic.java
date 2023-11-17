public class GameLogic {
    Symbol[] symbolArray;
    public Symbol getSymbol(int x, int y){
        for (Symbol symbol : symbolArray) {
            if (symbol.x == x && symbol.y == y) {
                return symbol;
            }
        }
        return null;
    }
}
