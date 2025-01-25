package project.app.demo.user;


import org.springframework.stereotype.Service;

@Service
public class userSelectingService {

    private final userRepository user_Repository;

    public userSelectingService(userRepository user_Repository) {
        this.user_Repository = user_Repository;
    }

    public userEntity find_user(userEntity user){

        return null;
    }
}
