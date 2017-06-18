package io.github.skyhacker2.dagger2learn.plane;

import javax.inject.Inject;

import io.github.skyhacker2.dagger2learn.plane.battery.Battery;

/**
 * 飞机
 * Created by eleven on 2017/6/18.
 */

public abstract class Plane {
    @Inject
    Battery mBattery;

    public abstract String getName();

    public Battery getBattery() {
        return mBattery;
    }

    @Override
    public String toString() {
        return getName() + "{" +
                "mBattery=" + mBattery.getName() +
                '}';
    }
}
