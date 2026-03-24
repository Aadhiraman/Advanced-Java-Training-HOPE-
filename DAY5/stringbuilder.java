

public class stringbuilder {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("hello");
    System.out.println(sb.toString());
    sb.append("world");
    System.out.println(sb);
    StringBuffer s = new StringBuffer("hello");
    System.out.println(s.toString());
    s.append("world");
    System.out.println(s);
  }
}
