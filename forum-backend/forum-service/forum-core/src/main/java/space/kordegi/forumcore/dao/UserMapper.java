package space.kordegi.forumcore.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import space.kordegi.forumcore.entity.User;

import java.util.List;

@Mapper
public interface UserMapper {
  @Select("SELECT *\n" +
    "\tFROM public.users;")
  User getUser();
}
