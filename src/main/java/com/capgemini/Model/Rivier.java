package com.capgemini.Model;

import javax.persistence.Entity;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Created by Skucukde on 9-5-2017.
 */
@Entity
public class Rivier extends Trip {

    public Rivier() {
    }

    public Rivier(int tripID, LocalDateTime startTime, LocalDateTime endTime) {
        super(tripID, startTime, endTime);
    }

    @Override
    public Duration getDuur() {
        Duration d = super.getDuur().minusMinutes(30);
        if (d.isNegative()) {
            return Duration.ZERO;
        } else {
            return d;
        }

    }


}