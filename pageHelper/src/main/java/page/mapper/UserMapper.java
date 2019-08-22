package page.mapper;

import org.apache.ibatis.annotations.Mapper;
import page.model.User;

import java.util.List;

//@Mapper
public interface UserMapper {
   List<User> page();

   List<User> fr(List<Integer> ids);
}
