import java.util.Arrays;
public class StudentSort {
public static void main(String[] args) {
String[] students = {
            "Rahul",
            "Ananya",
            "Thaj",
            "Zoya",
            "Arjun"
};
Arrays.sort(students);
System.out.println("Students sorted alphabetically:");
for (String name : students) {
System.out.println(name);
}
}
}