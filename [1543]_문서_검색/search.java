import java.util.Scanner;

public class search {
    public static boolean search(String a, String b, int index){ // a=txt

        for(int i=0;i<b.length();i++){

            if (index >= a.length())
                return false;

            if (a.charAt(index) == b.charAt(i))
                index++;
            else
                return false;
        }
        return true;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String src = sc.nextLine();

        int i = 0;
        int cnt = 0;

        while(i < txt.length()){
            if (txt.charAt(i) == src.charAt(0)){
                if (search(txt,src,i)){
                    cnt++;
                    i += src.length();
                }
                else
                    i++;
            }
            else
                i++;
        }

        System.out.println(cnt);

    }
}
