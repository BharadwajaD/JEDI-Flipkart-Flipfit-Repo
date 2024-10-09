package com.flipfit;

import com.flipfit.dao.FlipFitDao;
import com.flipfit.resource.UserResource;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Environment;
import io.dropwizard.jdbi3.JdbiFactory;
import org.jdbi.v3.core.Jdbi;

public class FlipFitServer extends Application<FlipFitServerConfiguration> {

    @Override
    public void run(FlipFitServerConfiguration flipFitServerConfiguration, Environment environment) throws Exception {

        final JdbiFactory factory = new JdbiFactory();
        final Jdbi jdbi = factory.build(environment, flipFitServerConfiguration.getDatabase(), "mysql");
        final FlipFitDao fdao = jdbi.onDemand(FlipFitDao.class);

        environment.jersey().register(new UserResource(fdao));
    }
}
