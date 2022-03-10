package com.jxufe.community.bbs.provider;

import com.jxufe.community.bbs.controller.dto.AccessTokenDTO;
import org.springframework.stereotype.Component;

@Component
public class GithubProvider {
    public String getAccessToken(AccessTokenDTO accessTokenDTO){
        return "index";
    }

}
