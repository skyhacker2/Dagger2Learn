package io.github.skyhacker2.dagger2learn.plane.battery;

import javax.inject.Inject;

/**
 * Created by eleven on 2017/6/18.
 */

public class SmartBattery implements Battery {

    @Inject
    public SmartBattery() {
    }

    @Override
    public String getName() {
        return SmartBattery.class.getSimpleName();
    }
}
