package cz.cvut.fit.tjv.social_network.web_client.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class UserDto {
    private String username;
    private String realName;
    private String info;
    private Set<UserDto> followers = new HashSet<>();
    private Set<UserDto> followed = new HashSet<>();
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDto() {
    }

    public UserDto(String username, String realName, Set<UserDto> follower, Set<UserDto> followed, String info) {
        this.username = username;
        this.realName = realName;
        this.info= info;
        if(follower!=null)
            this.followers = follower;
        if(followed!=null)
            this.followed = followed;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Set<UserDto> getFollowers() {
        return followers;
    }

    public void setFollowers(Set<UserDto> followers) {
        this.followers = followers;
    }

    public Set<UserDto> getFollowed() {
        return followed;
    }

    public void setFollowed(Set<UserDto> followed) {
        this.followed = followed;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                ", info='" + info + '\'' +
                ", followers=" + followers +
                ", followed=" + followed +
                '}';
    }
}
