package cs544.exercise6_1;

public class EmailSender implements IEmailSender {
	String outgoingMailServer = "smtp.acme.com";

	public String getOutgoingMailServer() {
		return outgoingMailServer;
	}

	public String sendEmail (String email, String message){
		System.out.println("EmailSender: sending '"+message+"' to "+email );
		return message;
	}
	
}