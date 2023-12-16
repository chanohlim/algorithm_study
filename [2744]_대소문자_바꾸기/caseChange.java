import java.util.Scanner;

public class caseChange {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char[] strc = str.toCharArray(); // String을 char 배열로 옮기기
    char[] convert = new char[strc.length]; // 정답 배열 만들고 초기화
    for(int i=0; i<str.length();i++){
        if((int)strc[i] <= 'Z' && (int)strc[i] >= 'A'){ // ASCII코드로 대문자인지 판단       
            convert[i] = (char)((int)strc[i]+('a'-'A')); // 대문자 -> 소문자   
        }
        else {
            convert[i] = (char)((int)strc[i]-('a'-'A')); // 소문자 -> 대문자
        }
    }
    System.out.println(convert);
    }
}
