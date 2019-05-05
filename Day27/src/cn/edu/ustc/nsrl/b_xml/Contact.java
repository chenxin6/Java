package cn.edu.ustc.nsrl.b_xml;

// 实体类，JavaBean，用于保存从XML解析得到的数据

public class Contact {
	private int id;
	private String name;
	private char gender;
	private String tel;
	private int age;
	private String qq;
	private String email;
	
	public Contact() {}
	public Contact(int id, String name, char gender, String tel, int age, String qq, String email) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.tel = tel;
		this.age = age;
		this.qq = qq;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", gender=" + gender + ", tel=" + tel + ", age=" + age + ", qq="
				+ qq + ", email=" + email + "]";
	}
}
