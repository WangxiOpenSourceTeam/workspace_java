import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectOutputStream {
  public static void main(String args[]) {
    try {
      PrintStream out  =  System.out; // 保存原输出流
      PrintStream ps = new PrintStream("./log.txt"); // 创建文件输出流
      System.setOut(ps); // 设置使用新的输出流

      int age =  18;
      System.out.println("年龄变量定义成功, 初始值为" + age);

      String sex = "女";
      System.out.println("性别变量定义成功, 初始值为" + sex);

      // 整合两个变量
      String info = "性别:"+sex+",年龄:"+age+"岁";
      System.out.println(info);

      // 恢复原有输出流
      System.setOut(out);
      System.out.println("程序执行完毕, 请查看日志文件");
    } catch(FileNotFoundException e) {
      e.printStackTrace();
    }

  }
}
