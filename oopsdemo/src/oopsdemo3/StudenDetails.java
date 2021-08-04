package oopsdemo3;

// multiple Interface implementation - multiple inheritance

public class StudenDetails implements CollegeData,HostelData {
	
	College c1=new College("Mary",500,"Delhi University","MCA");
	
	Hostel h1=new Hostel("Ram","Block A");

	@Override
	public void hostelDetail() {
		System.out.println("********** Hostel Details *********");
		System.out.println("Hostel Name :"+h1.getName());
		System.out.println("Location    :"+h1.getLocation());
		
	}

	@Override
	public void studentRecord() {
		System.out.println("Students Selected based on Percentage & Financila Situation");
	
	}

	@Override
	public void collegeDetail() {
		System.out.println("********** Colege Details *********");
		System.out.println("College Name : "+c1.getName());
		System.out.println("College Id   : "+c1.getId());
	//	System.out.println("Course       : "+c1.getCourse());
		System.out.println("University   : "+c1.getUniversty());
		
	}

	@Override
	public void studentData() {
		System.out.println("Students can Join courses : MCA, MTech, BCA,BTech");
		
	}
	
	public static void main(String[] args) {
		
		StudenDetails s1=new StudenDetails();
		
		s1.collegeDetail();
		s1.studentData();
		s1.hostelDetail();
		s1.studentRecord();
	}

}
