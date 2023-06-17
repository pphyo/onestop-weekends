public class EmployeeService {

	private MessageService service;

	public EmployeeService(MessageService service) {
		// service = new EmailService();
		this.service = service;
	}

	public static void main(String[] args) {
		EmployeeService empSer = new EmployeeService(new SmsService());
		Employee emp = new Employee();
		emp.setName("Tun Tun");
		emp.setEmail("tuntun@gmail.com");
		empSer.create(emp);
	}

	public void create(Employee emp) {
		// insert emp to database

		service.send(emp.getEmail(), "Successfully");
	}

}

class Employee {
	private String name;
	private String email;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
}