package ir.cnakhn;

public class Coin {
    private String coinOption = "";
    public String[] coinValue = {"Heads", "Tails"};

    Coin() {
        int randomNumber = (Math.random() < 0.5) ? 0 : 1;
        coinOption = coinValue[randomNumber];
    }

    public String getCoinOption() {
        return coinOption;
    }
}
