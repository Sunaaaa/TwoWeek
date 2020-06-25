package BAEKJOOON;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main10819 {

    static int N;
    static int[] arr;
    static int[] result;
    static boolean[] visited;
    static int flag;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[N];
        result = new int[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(N);
        System.out.println(Arrays.toString(arr));
        System.out.println("perm");
        perm(0);
        System.out.println("perm 끝");


    }    
    static void perm(int r){
        System.out.println(r==N-1);
        if (r == N) {
            System.out.println(Arrays.toString(result));            
            System.out.println("perm ing ");
            return;
        }
        System.out.println("xxxxxxxxxx");
        System.out.println(N);
        for (int i = 0; i < N; i++) {
            if (visited[i]) continue;
            result[r] = arr[i];
            visited[i] = true;
            perm(r+1);
            visited[i] = false;
        }
    }
}



