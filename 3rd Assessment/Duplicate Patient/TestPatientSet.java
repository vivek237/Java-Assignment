import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

class Patient{
	private int patientId;
	private String name;
	private int age;

	
	public Patient(int patientId,String name,int age) {
		this.patientId=patientId;
		this.name=name;
		this.age=age;
	}
	
	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class TestPatientSet {

	public static void main(String args[]) {

		Set<Patient> patientset=new LinkedHashSet<Patient>();
		patientset.add(new Patient(1, "ram", 22));
		patientset.add(new Patient(2, "sham", 20));
		patientset.add(new Patient(2, "rahul", 20));		

		System.out.println("Size of set is : "+patientset.size());

		for(Patient patient:patientset) {
			System.out.println("Id : "+patient.getPatientId()+" Patient Name : "+patient.getName()+" Patient age : "+patient.getAge());
		}

	}
}
