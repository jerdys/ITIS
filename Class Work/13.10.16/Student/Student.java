public class Student {
	String university;
	String faculty;
	int course;
	String group;


	String name;
	int age;

	void setName(String newName){
		name = newName;
	}

	void setAge(int newAge){
		age = newAge;
	}

	void setUniversity(String newUniversity){
		university = newUniversity;
	}

	void setFaculty(String newFaculty){
		faculty = newFaculty;
	}

	void setCourse(int newCourse){
		course = newCourse;
	}

	void setGroup(String newGroup){
		group = newGroup;
	}


	String getName(){
		return name;
	}

	int getAge(){
		return age;
	}

	String getUniversity(){
		return university;
	}

	String getFaculty(){
		return faculty;
	}

	int getCourse(){
		return course;
	}

	String getGroup(){
		return group;
	}
}