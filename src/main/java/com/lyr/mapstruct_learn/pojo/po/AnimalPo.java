package com.lyr.mapstruct_learn.pojo.po;

public class AnimalPo {

    private float weight;
    private String sound;
    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "AnimalPo{" +
                "weight=" + weight +
                ", sound='" + sound + '\'' +
                '}';
    }
}
