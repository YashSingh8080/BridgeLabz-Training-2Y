package firstproject;

public class StudentResultManagementSystem {
	// Custom Exception for Invalid Age
	class InvalidAgeException extends Exception {
	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}

	// Custom Exception for Invalid Marks
	class InvalidMarksException extends Exception {
	    public InvalidMarksException(String message) {
	        super(message);
	    }
	}
	public class StudentResultManagementSystem {
	    public static void main(String[] args) {
	        String name = null;
	        int age = 17;
	        int[] marks = {50, -20, 98}; 

	        try {
	            if(name == null){
	                throw new NullPointerException("name cannot be empty");
	            }
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	        try {
	            if (age < 18) {
	                throw new InvalidAgeException("Age must be at least 18.");
	            }
	        } catch (InvalidAgeException e) {
	            System.out.println(e.getMessage());
	        }
	        try {
	            for (int mark : marks) {
	                if (mark < 0 || mark > 100) {
	                    throw new InvalidMarksException("Marks must be between 0 and 100.");
	                }
	            }
	        } catch (InvalidMarksException e) {
	            System.out.println(e.getMessage());
	        }
	        // calculate averatge marks
	        int avgMarks = 0;
	        for (int i : marks) {
	            avgMarks += i;
	        }
	        avgMarks /= 3;
	        try {
	            System.out.println(avgMarks/0);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	        try {
	            System.out.println(marks[3]);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	        finally{
	            System.out.println("Result processing completed");
	        }
	    }    
	}

}
