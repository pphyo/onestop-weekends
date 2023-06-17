public class EmailService implements MessageService {

	@Override
	public void send(String email, String message) {
		System.out.println(
			"%s is sent with %s from EmailService.".formatted(email, message));
	}

}