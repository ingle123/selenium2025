   package sb;

public class Employee {
	
	// properties/fields
	private String name;
	private String empId;
	private String address;
	private String emailAddress;
	private double da;
	private double hra;
	private double basic;

	// getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;.
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	
	
	
	// methods
	public double getSalary() {
		return basic+hra+da;
	}   
	
	// toString
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", address=" + address + ", emailAddress=" + emailAddress
				+ ", da=" + da + ", hra=" + hra + ", basic=" + basic + "]";
	}

	
	// constructor
	

	
	
	public static void main(String[] args) {
		Employee sachin = new Employee();
		sachin.setEmpId("EMP001");
		sachin.setName("Sachin Ingle");
		sachin.setAddress("Sambhajinagar");
		//sachin.setEmailAddress("sachin.ingle@gmail.com");
		sachin.setBasic(45000.12);
		sachin.setHra(12000.5);
		sachin.setDa(2500.67);
		
		System.out.println(sachin.toString());
	}

}
