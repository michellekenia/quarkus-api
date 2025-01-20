package br.com.michellek.quarkussocial.rest.dto;

import br.com.michellek.quarkussocial.rest.domain.model.Follower;
import lombok.Data;

@Data
public class FollowerResponse {
    private Long id;
    private String name;

    public FollowerResponse() {
    }

    //constrói um objeto
    public FollowerResponse(Follower follower) {
        this (follower.getId(), follower.getFollower().getName());
    }


    public FollowerResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
