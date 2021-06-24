package classes_practice;

public class Section {
    private String semester;
    private String place;
    private String daysAndTimes;
    private Course course;

    public Section(Course theCourse, String theSemester, String thePlace, String theDaysAndTimes) {
        course = theCourse;
        semester = theSemester;
        place = thePlace;
        daysAndTimes = theDaysAndTimes;
    }

    public Course getCourse() { return course; }
    public String getPlace(){ return place; }
    public String getSemester() { return semester; }
    public String getDaysAndTimes() { return daysAndTimes; }
}
