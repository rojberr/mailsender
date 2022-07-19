package dev.drzymala.mailsender.sender.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@RequiredArgsConstructor
public class MyUser {

    private String email;
}
