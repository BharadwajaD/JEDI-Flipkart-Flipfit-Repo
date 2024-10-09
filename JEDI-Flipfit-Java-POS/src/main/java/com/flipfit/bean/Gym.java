package com.flipfit.bean;

public class Gym {

    private int gymId;
    private String gymName;
    private int capacity;
    private boolean listed;
    private int userId;//FOREIGN KEY

    public int getGymId() {
        return gymId;
    }
    public void setGymId(int gymId) {
        this.gymId = gymId;
    }

    public String getGymName() {
        return gymName;
    }
    public void setGymName(String gymName) {
        this.gymName = gymName;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isListed() {
        return listed;
    }
    public void setListed(boolean listed) {
        this.listed = listed;
    }

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

}
