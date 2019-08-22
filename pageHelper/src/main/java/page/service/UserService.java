package page.service;


import page.model.User;

import java.util.List;

public interface UserService {
    List<User> pages();

    List<User> fr(List<Integer> ids);
}


