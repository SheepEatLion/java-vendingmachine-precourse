package vendingmachine;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Coin {
    COIN_500(500, 0),
    COIN_100(100, 0),
    COIN_50(50, 0),
    COIN_10(10, 0);

    private final int amount;
    private int count;

    public static List<Integer> getCoinList(){
        return Arrays.stream(Coin.values())
                .map(Coin::getAmount)
                .collect(Collectors.toList());
    }

    Coin(final int amount, int count) {
        this.amount = amount;
        this.count = count;
    }

    public void addCount(){
        this.count++;
    }

    public int getAmount(){
        return this.amount;
    }

    public int getCount(){
        return this.count;
    }

}
