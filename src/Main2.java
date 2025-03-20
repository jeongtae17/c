import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Main2 ps = new Main2();
//        ps.j001();
        ps.j002();
    }
//    public void j001() {
//        int height,weight;
//        double bmi;
//        Scanner in = new Scanner(System.in);
//        height=in.nextInt();
//        weight=in.nextInt();
//        bmi= weight / (height * 0.01 * height * 0.01);
//        bmi = Math.round(bmi * 10.0) / 10.0;
//        System.out.println(bmi);
//        in.close();
//    }
    public void j002(){
        //섭씨온도를 화씨온도로 변환해주기!!
        double c_degree, f_degree;

        Scanner in = new Scanner(System.in);
        c_degree = in.nextDouble();
        f_degree = c_degree * 1.8 + 32;

        f_degree = Math.round(f_degree * 10.0) / 10.0;
        System.out.println(f_degree);
        in.close();
    }
}
//커밋 다시하기