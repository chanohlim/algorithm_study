import java.util.Scanner;

public class salt {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String current = sc.next();
        String future = sc.next();


        // String[] time = String.split(":"); -> {"20","00","00"}
        int[] current_t = {Integer.parseInt(current.substring(0,2)),Integer.parseInt(current.substring(3,5)),Integer.parseInt(current.substring(6))};
        int[] future_t = {Integer.parseInt(future.substring(0,2)),Integer.parseInt(future.substring(3,5)),Integer.parseInt(future.substring(6))};

        if(current_t[0] >= future_t[0])
            future_t[0] += 24;

        int current_s = current_t[0]*3600 + current_t[1]*60 + current_t[2];
        int future_s = future_t[0]*3600 + future_t[1]*60 + future_t[2];

        int diff = future_s - current_s;

        int hr = diff/3600;
        int min = (diff%3600)/60;
        int sec = diff%60;

        System.out.println(String.format("%02d:%02d:%02d",hr,min,sec));
    }
}
