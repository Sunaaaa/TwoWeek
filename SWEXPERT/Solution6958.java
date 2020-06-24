package SWEXPERT;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution6958 {
    
    static int[] cnt;
    static int N,M;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= T; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());          
            M = Integer.parseInt(st.nextToken());          
            cnt = new int[N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    int val = Integer.parseInt(st.nextToken());
                    if (val == 1) {
                        cnt[i] += 1;
                    }
                }                
            }

            int max = 0;
            for (int i = 0; i < N; i++) {
                if (max < cnt[i]) {
                    max = cnt[i];
                }
            }
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (max == cnt[i]) {
                    count+=1;                    
                }
            }
            sb.append("#").append(tc).append(" ").append(count).append(" ").append(max).append("\n");

        }

        System.out.println(sb.toString());
    }
}