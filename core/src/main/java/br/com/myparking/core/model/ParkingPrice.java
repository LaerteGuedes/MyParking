package br.com.myparking.core.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDateTime;

/**
 * Created by laerteguedes on 19/09/17.
 */
@Entity
@Table(name = "parking_price")
public class ParkingPrice implements Serializable, Model{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "day_of_week")
    @Enumerated(EnumType.ORDINAL)
    private DayOfWeek dayOfWeek;

    @Column(name = "start_hour")
    private LocalDateTime startHour;

    @Column(name = "ending_hour")
    private LocalDateTime endingHour;

    @Column(name = "price_pulse")
    private BigDecimal pricePulse;

    @Column(name = "price_hour")
    private BigDecimal priceHour;

    @Column(name = "time_pulse")
    private Integer timePulse;

    @Column(name = "time_hour")
    private Integer timeHour;

    @Column(name = "tolerance")
    private Integer tolerance;

    @ManyToOne
    @JoinColumn(name = "parking_id")
    private Parking parking;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public LocalDateTime getStartHour() {
        return startHour;
    }

    public void setStartHour(LocalDateTime startHour) {
        this.startHour = startHour;
    }

    public LocalDateTime getEndingHour() {
        return endingHour;
    }

    public void setEndingHour(LocalDateTime endingHour) {
        this.endingHour = endingHour;
    }

    public BigDecimal getPricePulse() {
        return pricePulse;
    }

    public void setPricePulse(BigDecimal pricePulse) {
        this.pricePulse = pricePulse;
    }

    public BigDecimal getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(BigDecimal priceHour) {
        this.priceHour = priceHour;
    }

    public Integer getTimePulse() {
        return timePulse;
    }

    public void setTimePulse(Integer timePulse) {
        this.timePulse = timePulse;
    }

    public Integer getTimeHour() {
        return timeHour;
    }

    public void setTimeHour(Integer timeHour) {
        this.timeHour = timeHour;
    }

    public Integer getTolerance() {
        return tolerance;
    }

    public void setTolerance(Integer tolerance) {
        this.tolerance = tolerance;
    }

    public Parking getParking() {
        return parking;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }
}
