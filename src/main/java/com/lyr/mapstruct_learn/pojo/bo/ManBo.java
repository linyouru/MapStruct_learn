package com.lyr.mapstruct_learn.pojo.bo;

public class ManBo {

    private float weight;
    private String sound;
    private String nickname;
    private Integer id;
    private String username;
    private Integer age;
    private Integer status;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ManBo{" +
                "weight=" + weight +
                ", sound='" + sound + '\'' +
                ", nickname='" + nickname + '\'' +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", status=" + status +
                '}';
    }
}
