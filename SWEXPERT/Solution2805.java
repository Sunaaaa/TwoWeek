package SWEXPERT;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution2805 {
    static int arr[][];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            
            int N = Integer.parseInt(br.readLine());            
            System.out.println("N : "+N);

            arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                String s = br.readLine();
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(s.charAt(j)+"");
                }
            }

            // 위 + 중간
            for (int i = 0; i <= N/2; i++) {
                
            }
            
            // 아래
            for (int i = N/2+1; i < N; i++) {
                System.out.println(Arrays.toString(arr[i]));
            }
            
        }


        System.out.println(sb.toString());

    }    
}