import java.util.Scanner;

public class Main5{
    public static void main(String[] args) {
        Main5 ps = new Main5();
        ps.j005();
    }
    public void j005(){
        int month, day;
        int day_count;
        Scanner in = new Scanner(System.in);
        month = in.nextInt();
        day = in.nextInt();
        day_count = day;
        if(month > 1){
            day_count += 31;
        }
        if(month > 2){
            day_count += 28;
        }
        if(month > 3){
            day_count += 31;
        }
        if(month > 4){
            day_count += 30;
        }
        if(month > 5){
            day_count += 31;
        }
        if(month > 6){
            day_count += 30;
        }
        if(month > 7){
            day_count += 31;
        }
        if(month > 8){
            day_count += 31;
        }
        if(month > 9){
            day_count += 30;
        }
        if(month > 10){
            day_count += 31;
        }
        if(month > 11){
            day_count += 30;
        }
        if(month > 12){
            day_count += 31;
        }
        System.out.println(day_count);
        in.close();
    }
}
