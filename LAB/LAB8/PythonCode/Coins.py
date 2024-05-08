from typing import List

class Coins:
    def coinChange(self, coins: List[int], amount: int) -> int:
        dp = [float('inf')] * (amount + 1)
        dp[0] = 0 
        for target in range(1, amount + 1):
            for coin in coins:
                if target - coin >= 0:
                    dp[target] = min(dp[target], 1 + dp[target - coin])
        return dp[amount] if dp[amount] != -1 else float('inf')

test = Coins()
coins = [1,2,5]
amount = 11
ans = test.coinChange(coins, amount)
print(ans)            
                
            
        