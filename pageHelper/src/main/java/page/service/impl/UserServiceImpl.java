package page.service.impl;
import page.model.User;
import page.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import page.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> pages() {
        return userMapper.page();
    }

    @Override
    public List<User> fr(List<Integer> ids) {
        return userMapper.fr(ids);
    }
}
