package ir.cnakhn;

public class Player {
    private String name = "";
    private String coinOption = "";
    public String[] coinValue = {"Heads", "Tails"};

    Player(String newName) {
        name = newName;
    }

    public void setCoinOption(String opponentFlip) {
        this.coinOption = (opponentFlip == "Heads")?"Tails":"Heads";
    }

    public String getRandCoinOption() {
        int randomNumber = (Math.random() < 0.5) ? 0 : 1;
        coinOption = coinValue[randomNumber];
        return coinValue[randomNumber];
    }

    public void didPlayerWin(String winningFlip) {
        if (coinOption == winningFlip) {
            System.out.println(name + " won with a flip of " + coinOption);
        } else {
            System.out.println(name + " lost with a flip of " + coinOption);
        }
    }
}
