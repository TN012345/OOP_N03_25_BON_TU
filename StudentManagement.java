public class StudentManagement {
    // ----------------- Lớp Student -----------------
    static class Student {
        private String studentID;
        private String fullName;
        private String address;

        public Student(String studentID, String fullName, String address) {
            this.studentID = studentID;
            this.fullName = fullName;
            this.address = address;
        }

        public String getStudentID() {
            return studentID;
        }

        public String getInfo() {
            return "StudentID: " + studentID +
                   ", Name: " + fullName +
                   ", Address: " + address;
        }
    }

    // ----------------- Lớp Course -----------------
    static class Course {
        private String courseID;
        private String courseName;
        private int credits;

        public Course(String courseID, String courseName, int credits) {
            this.courseID = courseID;
            this.courseName = courseName;
            this.credits = credits;
        }

        public String getCourseID() {
            return courseID;
        }

        public String getInfo() {
            return "CourseID: " + courseID +
                   ", Name: " + courseName +
                   ", Credits: " + credits;
        }
    }

    // ----------------- Lớp Enrollment -----------------
    static class Enrollment {
        private Student student;
        private Course course;

        public Enrollment(Student student, Course course) {
            this.student = student;
            this.course = course;
        }

        public String getInfo() {
            return student.getInfo() + " -> " + course.getInfo();
        }
    }

    // ----------------- Main -----------------
    public static void main(String[] args) {
        // Tạo sinh viên
        Student s1 = new Student("SV001", "Nguyen Van A", "Hanoi");
        Student s2 = new Student("SV002", "Tran Thi B", "Hai Phong");

        // Tạo môn học
        Course c1 = new Course("C001", "Lap trinh Java", 3);
        Course c2 = new Course("C002", "Co so du lieu", 4);

        // Đăng ký môn học
        Enrollment e1 = new Enrollment(s1, c1);
        Enrollment e2 = new Enrollment(s1, c2);
        Enrollment e3 = new Enrollment(s2, c2);
        Enrollment e4 = new Enrollment(s2, c1);

        // In thông tin đăng ký
        System.out.println(e1.getInfo());
        System.out.println(e2.getInfo());
        System.out.println(e3.getInfo());  
        System.out.println(e4.getInfo());
    }
}
