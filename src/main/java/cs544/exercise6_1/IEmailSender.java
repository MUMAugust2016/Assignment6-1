package cs544.exercise6_1;

public interface IEmailSender {
	public String sendEmail(String email, String message);
	public String getOutgoingMailServer();
}