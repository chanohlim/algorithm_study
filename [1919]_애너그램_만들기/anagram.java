import java.util.Scanner;

public class anagram {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] countA = new int[26];
        int[] countB = new int[26];

        String a = sc.next();
        String b = sc.next();

        int cnt = 0;

        for(int i = 0; i < a.length();i++)
            countA[a.charAt(i) - 'a']++;

        for(int i = 0; i < b.length();i++)
            countB[b.charAt(i) - 'a']++;

        for(int i = 0; i < 26; i++){
            if(countB[i] != countA[i])
                cnt += Math.abs(countA[i] - countB[i]);
        }

        System.out.println(cnt);
    }
}