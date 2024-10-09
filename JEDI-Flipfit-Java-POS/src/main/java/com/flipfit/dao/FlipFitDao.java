package com.flipfit.dao;

import com.flipfit.bean.Gym;
import com.flipfit.bean.Slot;
import com.flipfit.bean.User;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.UseRowMapper;

import java.util.List;


public interface FlipFitDao {

    //---- Users ----
    void insertUser(User user);
    @UseRowMapper(UserMapper.class)
    @SqlQuery("select userId, userName, role from users where userName = :user_name and hashedPassword = :hashed_password")
    User getUser(@Bind("user_name") String user_name, @Bind("hashed_password") String hashed_password);

    //---- Gyms -----
    void insertGym(Gym gym);
    List<Gym>  getAllGyms();

    //---- Slots ----
    void insertGymSlot(Gym gym, Slot slot);
    List<Slot> getGymSlots(Gym gym);
}
