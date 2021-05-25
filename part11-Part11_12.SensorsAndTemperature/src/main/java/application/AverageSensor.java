/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author truongtuan
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> reading;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
        this.reading = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        return this.sensors.stream().noneMatch((sensor) -> (!sensor.isOn()));
    }

    @Override
    public void setOn() {
        this.sensors.forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        this.sensors.forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        if (this.sensors.isEmpty() || !isOn()) {
            throw new IllegalStateException("");
        }
        int value = this.sensors.stream().mapToInt(sensor -> sensor.read()).sum() / this.sensors.size();
        this.reading.add(value);
        return value;
    }

    public List<Integer> readings() {
        return this.reading;
    }

}
