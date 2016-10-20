public class MyApp {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Renat");
		s.setAge(18);

		s.setUniversity("KFU");
		s.setFaculty("ITIS");
		s.setCourse(1);
		s.setGroup("11-604");

		System.out.println(s.getName() + " is studying at " + s.getUniversity());
		System.out.println(s.getName() + " is " + s.getAge() + " years old");
		System.out.println("Nowadays he's on the " + s.getCourse() + " course and studying in the " + s.getGroup() + " group");
	}

}
