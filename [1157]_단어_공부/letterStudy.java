import java.util.Scanner;

public class letterStudy {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        input = input.toUpperCase();
        
        char maxAlpha = 'a';

        int[] countAlph = new int[26];

        for(int i=0;i < input.length();i++)
            countAlph[input.charAt(i)-'A']++;

        int maxl = countAlph[0];

        for (int i = 0; i<26;i++){ // 알파벳개수 배열에서 최댓값을 구하는 프로세스
            if (countAlph[i] > maxl) {
                maxl = countAlph[i];
                maxAlpha = (char)('A'+i);
            }
            else if(countAlph[i] == maxl)
                maxAlpha = '?';

        }
        System.out.println(maxAlpha);
    }
}
