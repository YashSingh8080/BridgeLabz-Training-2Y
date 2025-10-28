public class Wrapper{
  // static Integer I = null;
  public static void main(String[]args){
    // int i=I;
    // System.out.println(i);
    int num =10;
    double price =99.99;
    Integer objNum = Integer.valueOf(num);
    Double objPrice = Double.valueOf(price);
    Integer autoObj = num;
    int newNum = objNum.intValue();
    double newPrice = objPrice;
    System.out.println("Primitive int:"+ num);
    System.out.println("Boxed Integer:"+ objNum);
    System.out.println("Unboxed int:"+ newNum);
    System.out.println("Boxed Double:"+ objPrice);
    System.out.println("Autoboxed Integer:"+ autoObj);

  }
}