package space.kordegi.forumcore.entity;

import java.util.Date;
import java.time.LocalTime;

public class User {
  private Integer id;
  private String name;
  private String email;
  private String location;
  private String bio;
  private String website;
  private String avatar;
  private Integer state;
  private String password;
  private Date createdAt;
  private Date updatedAt;
  private Date currentSignInAt;
  private Date lastSignInAt;
  private Integer topicsCount;
  private Integer commentsCount;
  private String type;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Date getCurrentSignInAt() {
    return currentSignInAt;
  }

  public void setCurrentSignInAt(Date currentSignInAt) {
    this.currentSignInAt = currentSignInAt;
  }

  public Date getLastSignInAt() {
    return lastSignInAt;
  }

  public void setLastSignInAt(Date lastSignInAt) {
    this.lastSignInAt = lastSignInAt;
  }

  public Integer getTopicsCount() {
    return topicsCount;
  }

  public void setTopicsCount(Integer topicsCount) {
    this.topicsCount = topicsCount;
  }

  public Integer getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(Integer commentsCount) {
    this.commentsCount = commentsCount;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public User(Integer id, String name, String email, String location, String bio, String website, String avatar, Integer state, String password, Date createdAt, Date updatedAt, Date currentSignInAt, Date lastSignInAt, Integer topicsCount, Integer commentsCount, String type) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.location = location;
    this.bio = bio;
    this.website = website;
    this.avatar = avatar;
    this.state = state;
    this.password = password;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.currentSignInAt = currentSignInAt;
    this.lastSignInAt = lastSignInAt;
    this.topicsCount = topicsCount;
    this.commentsCount = commentsCount;
    this.type = type;
  }
}
