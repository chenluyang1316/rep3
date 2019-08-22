package page.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import page.model.SearchCondition;
import page.model.User;
import page.service.UserService;
import page.util.ResultUtil;
import page.util.vo.JSONResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/page")
    public JSONResponse page(){
        //紧跟在这个方法后的第一个MyBatis 查询方法会被进行分页。
        PageHelper.startPage(1,2);
        List<User> list=userService.pages();
        PageInfo<User> pageInfo=new PageInfo<User>(list);

        return ResultUtil.success(pageInfo);
    }

    @GetMapping("/fr")
    public JSONResponse fr(){
        SearchCondition searchCondition=new SearchCondition();
        List<Integer> ids = searchCondition.getIds();
        //List<Integer> ids=new ArrayList();
       // ids.add(0);  //保证集合不为空
        ids.add(1);
        ids.add(2);
        ids.add(3);
        PageHelper.startPage(1,2);
        List<User> users= userService.fr(ids);
        PageInfo<User> pageInfo=new PageInfo<>(users);
        return ResultUtil.success(pageInfo);
    }
}
