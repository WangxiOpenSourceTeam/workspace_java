import java.util.Scanner;

public class Encryption {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    System.out.println("请输入一个英文字符串或解密字符串");
    String password = scan.nextLine(); // 获取用户输入
    char[] array = password.toCharArray(); // 获取字符数组
    for(int i=0; i<array.length; i++) {
      array[i] = (char)(array[i]^2000);  // ⚠️注意，这个不是幂运算，是异或运算
    }
    System.out.println("加密或解密结果如下:");
    System.out.println(new String(array)); // 输出密钥
  }
}
