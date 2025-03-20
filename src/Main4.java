import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Main4 ps = new Main4();
        ps.j004();
    }
    public void j004(){
        double x1, y1;
        double x2, y2;
        double distance;
        Scanner in = new Scanner(System.in);
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("%.1f\n", distance);
        in.close();
    }
}