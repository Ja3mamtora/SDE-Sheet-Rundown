public class MinNumberOfCoins {
    public int minCoins(int coins[], int m, int v) 
	{ 
	    // Your code goes here
	    int dp[][] = new int [coins.length+1][v+1];
	    
	    for(int i = 0 ; i <= m ; i++) {
	        for(int j = 0 ; j < v+1 ; j++) {
	            if(i == 0) {
	                dp[i][j] = Integer.MAX_VALUE;
	            }
	            else if(j == 0){
	                dp[i][j] = 0;
	            }
	        }
	    }
	    
	    for(int i = 1 ; i < m+1 ; i++) {
	        for(int j = 1 ; j < v+1 ; j++) {
	            if(coins[i-1] <= j) {
	                dp[i][j] = Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
	            }
	            else{
	                dp[i][j] = dp[i-1][j];
	            }
	        }
	    }
	    if(dp[m][v] == Integer.MAX_VALUE)return -1;
	    return dp[m][v];
	} 
}
