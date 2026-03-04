package sb;

public class settergetterrrr {

	private String name;
	private String id;
	private String adress;
	private String emailid;
	private double da ;
	private double hra ;
	private double basic;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}




	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
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

	@Override
	public String toString() {
		return "settergetterrrr [name=" + name + ", id=" + id + ", adress=" + adress + ", emailid=" + emailid + ", da="
				+ da + ", hra=" + hra + ", basic=" + basic + "]";
	}


	public static void main(String[] args) {
		settergetterrrr  obj = new settergetterrrr ();
		obj.setName("Sachin");
		obj.setId("123");
		obj.setAdress("Pune");
		obj.setAdress("sbin@.com");
		obj.setDa(10000.2);
		obj.setHra(4566.15);
		obj.setBasic(458966.556);
		System.out.println(obj.toString());
		
	}

}
