package com.flipfit.business;

import com.flipfit.bean.Slot;

public class SlotBusiness implements SlotInterface {

    @Override
    public boolean bookSlot(Slot slot) {
        if (slot.getSeatsAvailable() > 0) {
            // Decrement available seats
            slot.setSeatsAvailable(slot.getSeatsAvailable() - 1);
            System.out.println("Slot booked successfully for Slot ID: " + slot.getSlotId());
            return true;
        } else {
            System.out.println("No seats available for Slot ID: " + slot.getSlotId());
            return false;
        }
    }
}
