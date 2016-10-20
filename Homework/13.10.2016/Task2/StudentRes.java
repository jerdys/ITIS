public class StudentRes {

    public static void main(String[] args) {

        Student s = new Student();
        StudentUniversity su = new StudentUniversity();
        StudentParents sp = new StudentParents();

        s.setName("Rinat");
        s.setAge(18);
        s.setFaculty("ITIS");
        s.setCourse(1);
        s.setGroup(604);
        s.setPhoneNumber("79536777391");

        su.universityName = "KFU";
        s.setUniversityName(su);
        su.universityStreet = "Kremlevskaya";
        s.setUniversityStreet(su);
        su.universityRector = "Gafurov";
        s.setUniversityRector(su);
        su.universitySite = "www.kpfu.ru";
        s.setUniversitySite(su);


        sp.fatherName = "Zinnyr";
        s.setFatherName(sp);
        sp.motherName = "Lubov'";
        s.setMotherName(sp);
        sp.fatherPhone = "79123344752";
        s.setFatherPhone(sp);
        sp.motherPhone = "79536733832";
        s.setMotherPhone(sp);


        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Faculty: " + s.getFaculty());
        System.out.println("Course: " + s.getCourse());
        System.out.println("Group: " + s.getGroup());
        System.out.println("Phone Number: " + s.getPhoneNumber());
        System.out.println();
        System.out.println("University: " + s.getUniversityName().universityName);
        System.out.println("University's street: " + s.getUniversityStreet().universityStreet);
        System.out.println("University's rector: " + s.getUniversityRector().universityRector);
        System.out.println("University's site: " + s.getUniversitySite().universitySite);
        System.out.println();
        System.out.println("Father name: " + s.getFatherName().fatherName);
        System.out.println("Father phone: " + s.getFatherPhone().fatherPhone);
        System.out.println("Mother name: " + s.getMotherName().motherName);
        System.out.println("Mother phone: " + s.getMotherPhone().motherPhone);
        System.out.println();
        System.out.println("Summary EGE: " + s.sumEge(91,82,72));
        System.out.println("Grant: " + s.grant(91));
        System.out.println("Way to University: " + s.howLongTakesWayToUniversity(20,5,5));
        System.out.println("Ages after graduation: " + s.ageAfterGraduation());
        System.out.println("English Group: " + s.englishGroup(91));

    }

}
