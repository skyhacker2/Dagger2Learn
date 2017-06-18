package io.github.skyhacker2.dagger2learn.plane.inject;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import io.github.skyhacker2.dagger2learn.plane.Mavic;
import io.github.skyhacker2.dagger2learn.plane.battery.Battery;
import io.github.skyhacker2.dagger2learn.plane.Plane;
import io.github.skyhacker2.dagger2learn.plane.battery.SmartBattery;
import io.github.skyhacker2.dagger2learn.plane.Spark;
import io.github.skyhacker2.dagger2learn.plane.battery.SparkBattery;

/**
 * Created by eleven on 2017/6/18.
 */
@Module
public class PlaneModule {

    @Provides
    public Battery provideBattery(SmartBattery battery) {
        return battery;
    }

    @Provides
    @Named("spark")
    public Plane provideSpark(Spark spark) {
        return spark;
    }

    @Provides
    @Named("mavic")
    public Plane provideMavic(Mavic mavic) {
        return mavic;
    }

    @Provides
    @Named("spark battery")
    public Battery provideSparkBattery(SparkBattery battery) {
        return battery;
    }
}
