package com.tech.social.lnk.models;

import androidx.annotation.NonNull;

/**
 * Created by tech on 22/2/18.
 */

public class UserId {

    public String userId;

    public <T extends UserId> T withId(@NonNull final String id){
        this.userId=id;
        return (T)this;
    }

}
