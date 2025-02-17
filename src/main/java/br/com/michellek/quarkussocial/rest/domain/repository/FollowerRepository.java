package br.com.michellek.quarkussocial.rest.domain.repository;

import br.com.michellek.quarkussocial.rest.domain.model.Follower;
import br.com.michellek.quarkussocial.rest.domain.model.User;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Parameters;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class FollowerRepository implements PanacheRepository<Follower> {

    public boolean follows(User follower, User user){


       var params = Parameters.with("follower", follower).and("user", user).map();
        PanacheQuery<Follower> query = find("follower =:follower and user =:user", params);
        Optional<Follower> result = query.firstResultOptional();

        return result.isPresent();

    }

    public List<Follower> findByUser(Long userId){
        PanacheQuery<Follower> query = find("userId", userId);
        return query.list();
    }
}
