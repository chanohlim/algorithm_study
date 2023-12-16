import java.util.Scanner;

public class indexOf {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String word = sc.nextLine();

        int cnt = 0;
        int startI = 0; // indexOf 메소드를 시작하는 인덱스

        while(true){

            int findIndex = txt.indexOf(word,startI); // word가 txt 안에 있으면 인덱스 반환
            

            if(findIndex<0) // word가 txt안에 없으면 -1 반환
                break; // 무한루프 빠져나옴

            cnt++; // word가 txt 안에 있으면 cnt++
            startI = findIndex + word.length(); // 다시 indexOf를 시작한 인덱스를 지정

        }

        System.out.println(cnt);

    }
}
