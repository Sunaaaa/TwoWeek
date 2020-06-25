package SWEXPERT;

import java.util.Scanner;

public class Solution1209 {
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int t = sc.nextInt();
            arr = new int[100][100];

            int max = 0;
            // 입력
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            // 행
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                sum = 0;
                for (int j = 0; j < 100; j++) {
                    sum += arr[i][j];                     
                }
                if (max < sum) {
                    max = sum;                    
                }
            }

            // 열
            for (int i = 0; i < 100; i++) {
                sum = 0;
                for (int j = 0; j < 100; j++) {
                    sum += arr[j][i];                     
                }
                if (max < sum) {
                    max = sum;                    
                }
            }

            // 좌상-> 우하 대각상
            sum = 0;
            for (int i = 0; i < 100; i++) {
                sum += arr[i][i];
            }
            if (max < sum) {
                max = sum;                    
            }

            // 좌하-> 우상 대각상
            sum = 0;
            for (int i = 0, j = 99; i < 100; i++, j--) {
                sum += arr[i][j];
            }
            if (max < sum) {
                max = sum;                    
            }

            sb.append("#").append(t).append(" ").append(max).append("\n");

        }
        System.out.println(sb.toString());

    }
}