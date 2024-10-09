package com.flipfit.business;

import com.flipfit.bean.Gym;
import com.flipfit.business.Interface.GymCentre;

public class gymBuissness implements GymCentre {
    @Override
    public Gym updateGymCentre(int gymId, String gymName, int capacity, boolean listed, int userId) {
        Gym gymCentre = new Gym();
        gymCentre.setGymName(gymName);
        gymCentre.setGymId(gymId);
        gymCentre.setCapacity(capacity);
        gymCentre.setListed(listed);
        gymCentre.setUserId(userId);
    }
}
