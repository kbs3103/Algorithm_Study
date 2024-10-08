import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n,k;
    static int[] dist;
    static class Num{
        int x,cnt;

        public Num(int x,int cnt){
            this.x = x;
            this.cnt = cnt;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int[] coin = new int[n];
        for(int i=0;i<n;i++){
            coin[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[k+1];


        dp[0]=1;

        for(int i=0;i<n;i++){
            for(int j=1;j<=k;j++){
                if(j - coin[i] >= 0){
                    dp[j] += dp[j-coin[i]];

                }
            }

        }


        System.out.println(dp[k]);




    }


}