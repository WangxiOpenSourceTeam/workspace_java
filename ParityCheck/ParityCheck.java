import java.util.Scanner;

public class ParityCheck {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    System.out.println("请输入一个数");

    long number = scan.nextLong();
    String check = (number % 2 == 0)? "这个数字是偶数" : "这个数字是奇数";
    System.out.println(check);
  }
}
