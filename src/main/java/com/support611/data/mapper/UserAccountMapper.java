/* ===========================================================================
 * Copyright (c) 2018 Comcast Corp. All rights reserved.
 * ===========================================================================
 *
 * Author: Stanislav Menshykov
 * Created: 01/19/2018  2:44 PM
 */
package com.support611.data.mapper;

import com.support611.Constants;
import com.support611.data.model.UserAccount;
import com.support611.data.model.X1Account;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserAccountMapper {

    @Select("select * from " + Constants.X1_ACCOUNT_TABLE_NAME)
    List<UserAccount> findAll();

    @Select("SELECT * FROM " + Constants.X1_ACCOUNT_TABLE_NAME + " WHERE id = #{id}")
    @Results(value = {
            @Result(property = "id", column = "pk_id"),
            @Result(property = "name", column = "name"),
            @Result(property = "x1Accounts", javaType = List.class, column = "id",
                    many = @Many(select="getX1Accounts")),
            @Result(property = "vipStatus", column = "vip_status"),
            @Result(property = "supportDeskId", column = "support_desk_id")
    })
    UserAccount findById(long id);

    @Select("SELECT * from " + Constants.X1_ACCOUNT_TABLE_NAME + " WHERE id = #{id}")
    List<X1Account> getX1Accounts(Integer id);

    @Delete("DELETE FROM " + Constants.X1_ACCOUNT_TABLE_NAME + " WHERE id = #{id}")
    int deleteById(long id);

    @Insert("INSERT INTO " + Constants.X1_ACCOUNT_TABLE_NAME + "(id, name, x1Accounts, vipStatus, supportDeskId)" +
            " VALUES (#{id}, #{name}, #{x1Accounts}, #{vipStatus}, #{supportDeskId})")
    int insert(UserAccount student);

//    @Update("Update " + Constants.X1_ACCOUNT_TABLE_NAME + " set" +
//            "name=#{name}, x1Accounts=#{x1Accounts} where id=#{id}")
//    public int update(Student student);
}
