public class SmsService implements MessageService {


	public void send(String email, String message) {
		System.out.println(
			"%s is sent with %s from SmsService.".formatted(email, message));
	}

}