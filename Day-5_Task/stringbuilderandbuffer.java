public class stringbuilderandbuffer {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Good Morning");
    sb.append("!");
    System.out.println(sb);
    sb.insert(5,"Good ");
    System.out.println(sb);
    sb.replace(0,4," Bad");
    System.out.println(sb);
    sb.delete(0,4);
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
  
    StringBuffer s = new StringBuffer("Good Morning");
    s.append("@");
    System.out.println(s);
    s.insert(5,"Night");
    System.out.println(s);
    s.replace(0,4," Great");
    System.out.println(s);
    s.delete(0,4);
    System.out.println(s);
    s.reverse();
    System.out.println(s);
  }
}
