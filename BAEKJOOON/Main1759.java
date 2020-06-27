package BAEKJOOON;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main1759 {

    static int L,C;
    static char[] arr;
    static char[] result;
    static StringBuilder sb = new StringBuilder();
    static ArrayList<String> list ;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = new char[C];
        result = new char[L];        
        list = new ArrayList<>();

        String[] tmp = br.readLine().split(" ");

        // 4 6
        // a t c i s w

        for (int i = 0; i < C; i++) {
            arr[i] = tmp[i].charAt(0);
        }
        perm(0);

        Collections.sort(list);
        
        for (String string : list) {
            System.out.println(string);
        }
        
    }
    
    static int v;
    static void perm(int idx){
        if (idx == L) {
            checkCode();
            return;
        }
        for (int i = 0; i < C; i++) {
            if ((v & (1 << i)) == 0) {  // 아직 방문 안함
                result[idx] = arr[i];
                v |= (1<<i);
                perm(idx+1);
                v &= ~(1<<i);                
            }
        }
    }

    private static void checkCode() {
        int cnt = 0;
        for (int i = 0; i < L-1; i++) {
            if (result[i] < result[i+1]) return;
        }
        for (int i = 0; i < L; i++) {
            if (result[i] == 'a' || result[i] == 'e' || result[i] == 'i' || result[i] == 'o' || result[i] == 'u') {
                cnt += 1;                
            }
        }

        // 모음이 최소 한개 && 암호 길이 - 모음수 = 자음의 수 ==> 이것이 최소 두개
        if (cnt >= 1 && (L-cnt)>=2) {
            // Arrays.sort(result);
            String s = "";
            // for (int i = L-1; i >= 0; i--) {
            //     sb.append(result[i]);
            // }            
            // sb.append("\n");
            for (int i = L-1; i >= 0; i--) {
                s += result[i];
            }            
            list.add(s);
        }
    }
}