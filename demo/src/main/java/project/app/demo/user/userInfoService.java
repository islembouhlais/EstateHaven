package project.app.demo.user;

import org.springframework.stereotype.Service;

@Service
public class userInfoService {

    private userRepository user_Repository;

    public userInfoService(userRepository user_Repository) {
        this.user_Repository = user_Repository;
    }

    public int Add_user(userEntity user){
      return user_Repository.insertUser(user);
   }
}
