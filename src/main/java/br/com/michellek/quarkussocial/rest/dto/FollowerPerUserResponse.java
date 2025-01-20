package br.com.michellek.quarkussocial.rest.dto;

import lombok.Data;

import java.util.List;

@Data
public class FollowerPerUserResponse {
    private Integer followersCount;
    private List<FollowerResponse> content;

}
