public class Avito {
    private char open;
    private char close;

    public Avito(char open, char close) {
        this.open = open;
        this.close = close;
    }

    public char getOpen() {
        return open;
    }

    public void setOpen(char open) {
        this.open = open;
    }

    public char getClose() {
        return close;
    }

    public void setClose(char close) {
        this.close = close;
    }

    public boolean checkValue(String input) {
        int numOpen = 0;
        int numClose = 0;
        for (char symbol : input.toCharArray()) {
            if (symbol == open) {
                numOpen++;
            } else {
                numClose++;
            }
            if ((numOpen - numClose) < 0 || symbol != open && symbol != close){
                return false;
            }
        }
        return (numOpen - numClose) == 0;
    }
}
