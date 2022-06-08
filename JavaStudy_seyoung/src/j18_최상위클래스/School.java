package j18_최상위클래스;

import java.util.Objects;

public class School {
	private String schoolName;
	private int schoolYear;
	private String studentName;

	public School() {
		
	}

	public School(String schoolName, int schoolYear, String studentName) {
		super();
		this.schoolName = schoolName;
		this.schoolYear = schoolYear;
		this.studentName = studentName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(int schoolYear) {
		this.schoolYear = schoolYear;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(schoolName, schoolYear, studentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return Objects.equals(schoolName, other.schoolName) && schoolYear == other.schoolYear
				&& Objects.equals(studentName, other.studentName);
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", schoolYear=" + schoolYear + ", studentName=" + studentName + "]";
	}

	
}