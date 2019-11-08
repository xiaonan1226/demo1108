package com.example.demo.dao;

import com.example.demo.entity.Users;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface UsersMapper {

    //查询所有用户
    @Select("select * from t_users")
     List<Users> selectall();

    //用户新增
    @Insert("insert  into t_users (usersname,userssex,usersage) values (#{usersname},#{userssex},#{usersage})")
     int addnew(Users users);

    //删除用户
    @Delete(" delete from t_users where usersid = #{usersid}")
     int delete(int id);

    //修改用户
    @Update("update t_users set usersname = #{usersname},userssex = #{userssex},usersage =#{usersage} where usersid = #{usersid}")
     int  update(Users users);

    //显示单个用户
    @Select("select * from t_users where usersid = #{usersid}")
     Users selectone(Users users);

    //通过姓名查看用户名不能重名
    @Select("select * from t_users where usersname = #{usersname}")
     Users selectByName(Users users);

    //swagger的模糊查询
    @Select("<script>"
            +"select * from t_users where 1=1\n" +
            "        <if test=\"usersname != null and usersname != ''\">\n" +
            "            and usersname like '%${usersname}%'\n" +
            "        </if>\n" +
            "        <if test=\"userssex != null and userssex != ''\">\n" +
            "            and userssex like '%${userssex}%'\n" +
            "        </if>"
            +"</script>")
     List<Users> swaggerSelect(Users  users);
}
