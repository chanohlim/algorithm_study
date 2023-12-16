import java.util.Scanner;

public class stringReplace {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String word = sc.nextLine();

        String new_txt = txt.replace(word, "");

        int cnt = (txt.length() - new_txt.length())/word.length();

        System.out.println(cnt);

    }
}
