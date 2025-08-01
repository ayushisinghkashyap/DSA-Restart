class InvalidNameException extends RuntimeException {
	public InvalidNameException(String message) {
		super(message);
	}
}
public class abcWed {
	public void registrationUser(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new InvalidNameException("Name cannot be empty during Reg");
		}
		System.out.println("User Registration success" + name);
	}
	public static void main(String[] args) {
		abcWed reg = new abcWed();
		try {
			reg.registrationUser(" Anand ");
		} catch (Exception e) {
			System.out.println("erroe raised");
		}
		reg.registrationUser("sdfas");
	}	
}