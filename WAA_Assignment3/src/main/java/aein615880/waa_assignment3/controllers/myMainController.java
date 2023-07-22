package aein615880.waa_assignment3.controllers;

import aein615880.waa_assignment3.models.User;
import aein615880.waa_assignment3.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class myMainController {

    private final UserServices us;
    @GetMapping
    @ResponseBody
    private List<User> gg(){
        return us.getUsersAll();
    }

}
