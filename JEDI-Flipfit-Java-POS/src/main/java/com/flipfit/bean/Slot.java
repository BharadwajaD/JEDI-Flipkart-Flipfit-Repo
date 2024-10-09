package com.flipfit.bean;

public class Slot {

    private int slot_id;
    private String slot_timing;
    private int seats_available; // Add this line
    private int gym_id; // Foreign key

    // Getters and Setters
    public int getSlotId() {
        return slot_id;
    }

    public void setSlotId(int slot_id) {
        this.slot_id = slot_id;
    }

    public String getSlotTiming() {
        return slot_timing;
    }

    public void setSlotTiming(String slot_timing) {
        this.slot_timing = slot_timing;
    }

    public int getSeatsAvailable() {
        return seats_available;
    }

    public void setSeatsAvailable(int seats_available) {
        this.seats_available = seats_available;
    }

    public int getGymId() {
        return gym_id;
    }

    public void setGymId(int gym_id) {
        this.gym_id = gym_id;
    }
}

