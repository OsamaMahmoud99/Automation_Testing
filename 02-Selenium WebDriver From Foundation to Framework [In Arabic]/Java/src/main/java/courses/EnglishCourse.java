package courses;

public class EnglishCourse {

    int studentsEnrolled;
    int weeksDuration;
    int daysPerWeek;


    public static void main(String[] args) {
       EnglishCourse Eng101 = new EnglishCourse();
       int totalDays;

       Eng101.studentsEnrolled = 10;
       Eng101.weeksDuration = 4;
       Eng101.daysPerWeek = 3;

       totalDays = Eng101.weeksDuration * Eng101.daysPerWeek;

       System.out.println("Total days of the course: " + totalDays);
       
    }
}
