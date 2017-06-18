package io.github.skyhacker2.dagger2learn.plane;

import javax.inject.Inject;
import javax.inject.Named;

import io.github.skyhacker2.dagger2learn.plane.battery.Battery;

/**
 * Spark飞机
 * Created by eleven on 2017/6/18.
 */

public class Spark extends Plane {

    @Inject
    public Spark() {
    }

    @Override
    public String getName() {
        return "Spark";
    }
}
