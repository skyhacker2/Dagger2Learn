package io.github.skyhacker2.dagger2learn;

import org.junit.Test;

import javax.inject.Inject;

import io.github.skyhacker2.dagger2learn.plane.Plane;
import io.github.skyhacker2.dagger2learn.plane.inject.DaggerPlaneComponent;

import static org.junit.Assert.*;

/**
 * Created by eleven on 2017/6/18.
 */

public class PlaneTest {

    @Inject
    Plane mSpark;

    @Test
    public void testSpark() {
        DaggerPlaneComponent.builder().build().inject(this);
        assertNotNull(mSpark);
        System.out.println(mSpark.getName());
        System.out.println(mSpark.getBattery().getName());
    }
}
