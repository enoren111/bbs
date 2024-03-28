package space.kordegi.forumcore.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import space.kordegi.forumcore.entity.User;

@Mapper
public interface LoginMapper {
    @Select("SELECT password FROM public.users where name = #{username};")
    String findPasswordByUserName(@Param("username") String username);

    @Select("SELECT COUNT(*) > 0 FROM users WHERE name = #{username}")
    boolean existsByUsername(@Param("username") String username);
}
