import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();
        float tot=x+y+z;
        System.out.printf("%.2f %.2f %.2f", (x/tot)*100,(y/tot)*100,(z/tot)*100);
    }
}
