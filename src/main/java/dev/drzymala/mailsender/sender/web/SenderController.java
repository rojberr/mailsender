package dev.drzymala.mailsender.sender.web;

import dev.drzymala.mailsender.sender.application.port.SenderUseCase;
import dev.drzymala.mailsender.sender.domain.MyUser;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@Controller
@AllArgsConstructor
public class SenderController {

    private final SenderUseCase sender;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.OK)
    public String doRegister(@ModelAttribute("myuser") MyUser myuser) {

        sender.register(myuser.getEmail());
        return "register_success";
    }
}