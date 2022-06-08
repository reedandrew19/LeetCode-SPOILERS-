package CoinChange322;

import java.util.Arrays;

public class CoinChange322 {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] leastNumCoins = new int[amount + 1];
        Arrays.fill(leastNumCoins, max);
        leastNumCoins[0] = 0;
        for(int i = 1; i <= amount; i++){
            for(int j = 0; j < coins.length; j++){
                if(coins[j] <= i){
                    leastNumCoins[i] = Math.min(leastNumCoins[i], leastNumCoins[i - coins[j]] + 1);
                }
            }
        }
        return leastNumCoins[amount] <= amount ? leastNumCoins[amount] : -1;
    }
}
