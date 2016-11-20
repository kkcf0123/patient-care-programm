package 환자관리;

// 환자 관리를 위한 클래스.
public class EmployeeVO { 
	private int no;
	private String name; // 이름
	private String birth; // 생년월일
	private String phone; // 전화번호
	private String email; // 이메일
	private String sex; // 성별
	private String status;
	
	public EmployeeVO(int no,String name,String birth,String phone,String email,String sex) {
		this.no = no;
		this.name = name;
		this.birth = birth;
		this.email = email;
		this.sex = sex;
		this.email = email;
		
	}
	public EmployeeVO(int no,String name,String birth,String phone,String email,String sex,String status) {
		this.no = no;
		this.name = name;
		this.birth = birth;
		this.phone = phone;
		this.email = email;
		this.sex = sex;
		this.status = status;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	public int getNo() {
		return no;
	}
	public  EmployeeVO() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String brith) {
		this.birth = birth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getStatus() {
		return status = status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
}
