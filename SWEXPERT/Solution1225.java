package SWEXPERT;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Solution1225 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue queue = new LinkedList<Integer>();
        StringBuilder sb = new StringBuilder();
        
        for (int t = 1; t <= 10; t++) {
            
            int tc = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            queue.clear();
            for(int i = 0; i < 8; i++){
                queue.add(Integer.parseInt(st.nextToken()));
            }

            int k = 1;
            L:while (true) {
                if (k == 6) {
                    k = 1;
                }
                int num = (int)queue.poll()-k;
                if (num <= 0) {
                    queue.add(0);
                    break L;
                } else {
                    queue.add(num);
                }
                k += 1;
            }

            sb.append("#").append(tc).append(" ");
            for (int i = 0; i < 8; i++) {
                sb.append(queue.poll()).append(" ");
            }
            sb.append("\n");

        }
        System.out.println(sb.toString());

    }
    
}
