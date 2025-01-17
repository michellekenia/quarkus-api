package br.com.michellek.quarkussocial.rest.domain.repository;

import br.com.michellek.quarkussocial.rest.domain.model.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User>{




}
