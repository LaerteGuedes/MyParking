package br.com.myparking.core.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by laerteguedes on 19/09/17.
 */
@Embeddable
public class ParkingConfig implements Serializable{

    @Column(name = "daily_charge")
    private boolean dailyCharge;

    @Column(name = "hours_to_daily")
    private int hoursToDaily;

    public boolean isDailyCharge() {
        return dailyCharge;
    }

    public void setDailyCharge(boolean dailyCharge) {
        this.dailyCharge = dailyCharge;
    }

    public int getHoursToDaily() {
        return hoursToDaily;
    }

    public void setHoursToDaily(int hoursToDaily) {
        this.hoursToDaily = hoursToDaily;
    }
}
