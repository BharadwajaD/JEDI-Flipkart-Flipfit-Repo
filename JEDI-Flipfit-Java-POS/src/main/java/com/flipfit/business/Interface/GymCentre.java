package com.flipfit.business.Interface;

import com.flipfit.bean.Gym;

public interface GymCentre {
    public Gym updateGymCentre(int gymId, String gymName, int capacity, boolean listed, int userId);
}
