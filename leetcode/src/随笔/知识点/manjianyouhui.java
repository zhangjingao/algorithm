package 随笔.知识点;

/**
 * @author zjg
 * @ClassName manjianyouhui
 * @Description TODO
 * @Date 2019/8/22 14:38
 **/
public class manjianyouhui {

/*

 #include <iostream>
 #include <algorithm>
 #include <climits>
 using namespace std;
 const int N = 10010;
 int arr[N];
 int dp[N][N];

 // dp[i][j] 表示前i件商品满j元的最小金额
 // dp[i][j] = min(dp[i-1][j],dp[i-1][j-num[i]]+num[i]) if j>num[i]
 //   if j<=num[i] dp[i][j] = min(num[i],dp[i-1][j])
 int main()
 {
 int n,m;
 cin>>n>>m;
 for(int i=1;i<=n;i++)
 cin>>arr[i];
 for(int i=0;i<=m;i++)
 dp[0][i] = N;         // 用MAX_INT会越界
 for(int i=1;i<=n;i++){
 for(int j=0;j<=m;j++){
 if(j<=arr[i]){
 dp[i][j] = min(arr[i],dp[i-1][j]);
 }
 else dp[i][j] = min(dp[i-1][j],dp[i-1][j-arr[i]]+arr[i]);
 }
 }
 cout<<dp[n][m]<<endl;

 }

 */

}
