public class Student {
    private String name;
    private int age;
    private String faculty;
    private int course;
    private int group;
    private String phoneNumber;

    private StudentUniversity universityName;
    private StudentUniversity universityStreet;
    private StudentUniversity universityRector;
    private StudentUniversity universitySite;

    private StudentParents fatherName;
    private StudentParents motherName;
    private StudentParents fatherNumber;
    private StudentParents motherNumber;


    int sumEge (int rusScore, int mathScore, int infScore) {
        return rusScore + mathScore + infScore;
    }

    String grant (int averageScore) {
        String answer;
        if (averageScore > 80) {
            answer = "yes";
        }
        else
            answer = "no";
        return answer;
    }

    int howLongTakesWayToUniversity(int toMetroFromUV, int onMetro, int toUniversityFromMetro) {
        return toMetroFromUV + onMetro + toUniversityFromMetro;
    }

    int ageAfterGraduation() {
        return age + 4;
    }

    String englishGroup(int engScore){
        String result = "";
        if (engScore > 90) {
            result = "Advanced";
        }
        if (engScore > 80 && engScore < 90) {
            result = "Upper-Intermediate";
        }
        if (engScore < 80) {
            result = "Intermediate";
        }
        return result;
    }

    // GETTERS AND SETTERS

    void setFatherName (StudentParents newFatherName) {
        fatherName = newFatherName;
    }

    StudentParents getFatherName() {
        return fatherName;
    }

    void setMotherName (StudentParents newMotherName) {
        motherName = newMotherName;
    }

    StudentParents getMotherName() {
        return motherName;
    }

    void setFatherPhone (StudentParents newFatherPhone) {
        fatherNumber = newFatherPhone;
    }

    StudentParents getFatherPhone() {
        return fatherNumber;
    }

    void setMotherPhone (StudentParents newMotherPhone) {
        motherNumber= newMotherPhone;
    }

    StudentParents getMotherPhone() {
        return motherNumber;
    }

    void setUniversityName (StudentUniversity newUniversityName) {
        universityName = newUniversityName;
    }

    StudentUniversity getUniversityName() {
        return universityName;
    }

    void setUniversityStreet (StudentUniversity newUniversityStreet) {
        universityStreet = newUniversityStreet;
    }

    StudentUniversity getUniversityStreet() {
        return universityStreet;
    }

    void setUniversityRector (StudentUniversity newUniversityRector) {
        universityRector = newUniversityRector;
    }

    StudentUniversity getUniversityRector() {
        return universityRector;
    }

    void setUniversitySite (StudentUniversity newUniversitySite) {
        universitySite = newUniversitySite;
    }

    StudentUniversity getUniversitySite() {
        return universitySite;
    }

    void setPhoneNumber(String newNumber) {
        phoneNumber = newNumber;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    void setAge(int newAge){
        age = newAge;
    }

    int getAge(){
        return age;
    }

    void setCourse(int newCourse) {
        course = newCourse;
    }

    int getCourse(){
        return course;
    }

    void setName(String newName) {
        name = newName;
    }

    String getName() {
        return name;
    }

    void setFaculty(String newFaculty) {
        faculty = newFaculty;
    }

    String getFaculty() {
        return faculty;
    }

    void setGroup(int newGroup) {
        group = newGroup;
    }

    int getGroup() {
        return group;
    }


}
