import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class AverageGrades {
        public static void main (String[]args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Student> students = new ArrayList<>();
            int n = Integer.parseInt(reader.readLine());
            for (int i = 0; i < n; i++) {
                String[] parameters = reader.readLine().split(" ");
                Student student = new Student();
                student.name = parameters[0];
                student.grades = new ArrayList<>();
                for (int j = 1; j < parameters.length; j++) {
                    student.grades.add(Double.parseDouble(parameters[j]));

                }
                students.add(student);
            }

            ArrayList<Student> filrerdStudents = new ArrayList<>();
            for (Student student : students) {
                if (student.AverageGrade() >= 5.00) {
                    filrerdStudents.add(student);
                }
            }

            filrerdStudents.sort((student1, student2) -> {
                int result = student1.name.compareTo(student2.name);
                if (result == 0) {
                    result = Double.compare(student2.AverageGrade(), student1.AverageGrade());
                }
                return result;
            });

            for (Student sortedStudent : filrerdStudents) {
                System.out.println(sortedStudent.name + " -> " + String.format("%.2f", sortedStudent.AverageGrade()));
            }
        }
    }

    class Student {
        public String name;
        public List<Double> grades;

        public double AverageGrade() {
            double avarage = 0;
            int count = grades.size();
            for (double grade : grades
                    ) {
                avarage += grade;
            }
            return avarage / count;
        }
    }