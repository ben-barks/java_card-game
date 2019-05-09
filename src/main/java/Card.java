

public class Card {

    private SuitType suit;
    private RankType rank;

    public Card(SuitType suit, RankType rank){
        this.rank = rank;
        this.suit = suit;
    }

    public int getValueFromEnum(){
        return this.rank.getValue();
    }
}
