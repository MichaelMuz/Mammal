
public class Human extends Mammal
{
	private boolean male;
	private int age;
	private String lastName, firstname;
	
	
	public Human( )
	{
		male = false;
		age = 50;
		lastName = "kaka";
		firstname = "puka";
	}
	public Human(boolean male, int age, String lastName, String firstname) {
		super();
		this.male = male;
		this.age = age;
		this.lastName = lastName;
		this.firstname = firstname;
	}
	public boolean isMale() {
		return male;
	}
	public void setMale(boolean male) {
		this.male = male;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
//		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
//		result = prime * result + (male ? 1231 : 1237);
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Human other = (Human) obj;
//		if (age != other.age)
//			return false;
//		if (firstname == null) {
//			if (other.firstname != null)
//				return false;
//		} else if (!firstname.equals(other.firstname))
//			return false;
//		if (lastName == null) {
//			if (other.lastName != null)
//				return false;
//		} else if (!lastName.equals(other.lastName))
//			return false;
//		if (male != other.male)
//			return false;
//		return true;
//	}
	
	
	
	
	
	
}
