import java.util.Scanner;

public class InputCode {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入:");
    String line = scanner.nextLine();
    System.out.println("你输入的是" + line);
  }
}
