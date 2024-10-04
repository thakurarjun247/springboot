package ai.jobhunter.messaging;

import ai.jobhunter.messaging.entity.EmailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class EmailSender implements MessageSender<EmailMessage> {

    private final JavaMailSender javaMailSender;

    public EmailSender(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendMessage(EmailMessage emailMessage) {
        // ... (implementation using JavaMailSender)
    }
}