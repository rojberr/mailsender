package dev.drzymala.mailsender.sender.application;


import dev.drzymala.mailsender.sender.application.port.SenderUseCase;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SenderService implements SenderUseCase {


    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void register(String email) {
        sendSimpleMessage(email);
    }

    public void sendSimpleMessage(String to) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("noreply@speedysalesman.com");
        message.setTo(to);
        message.setSubject("Welcome to Speedysalesman mailing list!");
        message.setText(
                "Welcome to our mailing list! ciasto xxx"
        );
        javaMailSender.send(message);
    }
}
