package io.github.skyhacker2.dagger2learn.plane.battery;

import javax.inject.Inject;

/**
 * Spark专用电池
 * Created by eleven on 2017/6/18.
 */

public class SparkBattery implements Battery {

    @Inject
    public SparkBattery() {
    }

    @Override
    public String getName() {
        return SparkBattery.class.getSimpleName();
    }
}
