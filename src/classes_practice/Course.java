package classes_practice;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Course {
    private String id;
    private String name;
    private int numberofCredits;
    private String description;
    private Course course;

    public Course(String courseId, String courseName) {
        this.id = courseId;
        this.name = courseName;
    }

    public void setNumberOfCredits(int credits) {
        this.numberofCredits = credits;
    }

    public void setDescription(String courseDescription) {
        this.description = courseDescription;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberofCredits() {
        return this.numberofCredits;
    }

    public String getDescription() {
        return this.description;
    }
}
