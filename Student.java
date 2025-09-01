public class Student {
    public static void displayStudents(String[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
    public static void compareStrings(String str1, String str2) {
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
    public static void searchStudent(String[] students, String name) {
        boolean found = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Student Registered");
        } else {
            System.out.println("Student Not Found");
        }
    }
    public static void main(String[] args) {
        String students[] = {"Yash", "Pratap", "Singh", "Nobita", "Shizuka"};
        displayStudents(students);
        String s1 = "Yash";
        String s2 = "Yash";
        String s3 = new String("Yash");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        String originalName = "Yash";
        String modifiedName = originalName.concat("Singh");
        System.out.println("Original Name: " + originalName); 
        System.out.println("Modified Name: " + modifiedName); 

        compareStrings(s1, s3);
        String searchName = "Pratap";
        searchStudent(students, searchName);
        searchName = "Nobita";
        searchStudent(students, searchName);
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("StringBuffer after append: " + sb.toString());
        sb.insert(5, ",");
        System.out.println("StringBuffer after insert: " + sb.toString());
        sb.delete(5, 6);
        System.out.println("StringBuffer after delete: " + sb.toString());

        StringBuilder sbd = new StringBuilder("Hello");
        sbd.append(" Java");
        System.out.println("StringBuilder after append: " + sbd.toString());
        sbd.insert(5, ",");
        System.out.println("StringBuilder after insert: " + sbd.toString());
        sbd.delete(5, 6);
        System.out.println("StringBuilder after delete: " + sbd.toString());
        
    }

    
}