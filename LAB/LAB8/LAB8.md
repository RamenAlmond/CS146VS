# Lab8 Markdown
## We will be solving our last problem (probably) together! Here's the problem statement:  
You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money. 

Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.

Contraints:

* 1 <= coins.length <= 12
* 1 <= coins[i] <= 2^31 - 1
* 0 <= amount <= 10^4


```
canFinish returns int
Parameters are coins and amount
canFinish finds the lowest number of coins needed to create the amount and returns it. If it can't create the amount it returns 0. The approach uses dynamic programming

Method:
    initalize an array of integers with the size one more than the amount
    initalize each index of the array to be infinite/max_integer
    initaize the first index to 0
        for every index from 1 to amount + 1
            for every coin in coins
                if target - coin >= 0:
                    dp[target] = min(dp[target], 1 + dp[target - coin])
    return dp[target] if dp[target] does not equal to infinite/max_integer, if it does return -1


