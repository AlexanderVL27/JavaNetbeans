import java.util.Scanner;

public class Main {
    public static void main(String args[]){
Scanner in = new Scanner(System.in);
while(in.hasNectINT()){
int n=in.nextInt();
System.out.printf("%.0f %6f\n",Math.pow(n,2),Math.sqrt(n));
    }
}
