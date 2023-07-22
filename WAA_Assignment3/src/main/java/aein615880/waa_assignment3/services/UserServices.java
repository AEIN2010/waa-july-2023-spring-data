package aein615880.waa_assignment3.services;

import aein615880.waa_assignment3.models.User;
import aein615880.waa_assignment3.repos.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServices {

    private final UserRepo ur;
    public List<User> getUsersAll(){
        return ur.findAll();
    }
}
