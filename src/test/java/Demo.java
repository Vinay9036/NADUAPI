import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Demo {
  public static void main(String[] args) {
    final String username = "vkc@akadevqa.com";
    final String password = "P@ssw0rd@2021";

    Properties props = new Properties();
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.host", "smtp.outlook.com");
    props.put("mail.smtp.port", "587");

    Session session = Session.getInstance(props,
      new javax.mail.Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
          return new PasswordAuthentication(username, password);
        }
      });

    try {
      Message message = new MimeMessage(session);
      message.setFrom(new InternetAddress("vkc@akadevqa.com"));
      message.setRecipients(Message.RecipientType.TO,
        InternetAddress.parse("EXOTestUser13@akadevqa.com"));
      message.setSubject("Testing ");
      message.setText("Sending mail from online to onprem");

      Transport.send(message);

      System.out.println("Email sent successfully");

    } catch (MessagingException e) {
      throw new RuntimeException(e);
    }
  }
}
