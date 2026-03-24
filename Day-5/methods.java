
class methods {
  public int square(int n){
     return n*n;
  }
  public static void main(String[] args) {
    String s = "Hello";
    System.out.println(s);
    methods m = new methods();
    int res= m.square(4);
    System.out.println(res);
  }
}
