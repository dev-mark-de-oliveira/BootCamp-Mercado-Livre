import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      String s = "";
      Scanner in = new Scanner(System.in);
      s = in.next();

      System.out.println(s.matches("[0-3]{1}"));
    }
}