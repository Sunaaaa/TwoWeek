package SWEXPERT;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution2805 {
    static int arr[][];
    static boolean visited[][];
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            
            int N = Integer.parseInt(br.readLine());            
            arr = new int[N][N];
            visited = new boolean[N][N];

            for (int i = 0; i < N; i++) {
                String s = br.readLine();
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(s.charAt(j)+"");
                }
            }

            int k = N/2;
            Queue queue = new LinkedList<Node>();
            queue.offer(new Node(k, k));
            visited[k][k] = true;

            int sum = arr[k][k];
            while (k-- > 0) {
                int size = queue.size();
                while (size-- > 0) {
                    
                    Node n = (Node)queue.poll();
                    int r = n.r;
                    int c = n.c;
                    
                    for (int p = 0; p < 4; p++) {
                        int nr = r+dr[p];
                        int nc = c+dc[p];                                        
                        if (nr < 0 || nc < 0 || nr >= N || nc >= N) continue;
                        if (visited[nr][nc]) continue;
                        queue.offer(new Node(nr, nc));
                        visited[nr][nc] = true;
                        sum += arr[nr][nc];
                    }
                }
            }

            sb.append("#").append(tc).append(" ").append(sum).append("\n");
            
        }

        System.out.println(sb.toString());

    }    

    static int[] dr = {-1,0,1,0};
    static int[] dc = {0,1,0,-1};
    static class Node{
        int r;
        int c;

        public Node(int r, int c){
            this.r = r;
            this.c = c;
        }

        @Override
        public String toString() {
           return "("+r+" ,  "+c+")";
        }

    }
}