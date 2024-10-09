package com.flipfit.resource;

import com.flipfit.bean.User;
import com.flipfit.dao.FlipFitDao;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/user")
public class UserResource {

    private final FlipFitDao fdao;
    public  UserResource(FlipFitDao fdao) {
        this.fdao = fdao;
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
   public User getUser(@QueryParam("user_name") String user_name, @QueryParam("hashed_password") String hashed_password){
       return fdao.getUser(user_name, hashed_password);
   }
}
