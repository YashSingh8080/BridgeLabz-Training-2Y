
import java.util.Scanner;

public class StudentResultManagement{
  public static class InvalidMarksException extends Exception {
        public InvalidMarksException(String message) {
            super(message);
        }
    }

    public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
  public static void main(String[] args) {
  try {
  Scanner sc = new Scanner(System.in);
  String name= sc.nextLine();
  int age = sc.nextInt();
  int marks[] = new int[3];
  for(int i=0;i<3;i++){
    marks[i]=sc.nextInt();
  }
  if (name.isEmpty()) name = null;
  System.out.println(name.length());

  if (age<18){
    throw new InvalidAgeException("Age must be 18 or above! Current age: " + age);
  }
  System.out.println("Age is valid: " + age);

  for (int i = 0; i < marks.length; i++) {
     if (marks[i] < 0 || marks[i] > 100) {
       throw new InvalidMarksException("Invalid marks in Subject " + (i + 1) + ": " + marks[i] + " (Must be 0-100)");
       }
   }
   System.out.println("All marks are valid!");
   
  } catch (Exception e) {
  }

  }
   
}