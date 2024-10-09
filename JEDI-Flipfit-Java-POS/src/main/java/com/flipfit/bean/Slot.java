package com.flipfit.bean;

public class Slot {

    private int slotId;
    private String slotTiming;
    private int seatsAvailable; // Add this line
    private int gymId; // Foreign key

    // Getters and Setters
    public int getSlotId() {
        return slotId;
    }
    public void setSlotId(int slot_id) {
        this.slotId = slot_id;
    }

    public String getSlotTiming() {
        return slotTiming;
    }
    public void setSlotTiming(String slot_timing) {
        this.slotTiming = slot_timing;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }
    public void setSeatsAvailable(int seats_available) {
        this.seatsAvailable = seats_available;
    }

    public int getGymId() {
        return gymId;
    }
    public void setGymId(int gym_id) {
        this.gymId = gym_id;
    }
}

