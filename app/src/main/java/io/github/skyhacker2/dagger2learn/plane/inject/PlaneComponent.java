package io.github.skyhacker2.dagger2learn.plane.inject;

import android.app.Activity;

import dagger.Component;
import io.github.skyhacker2.dagger2learn.MainActivity;
import io.github.skyhacker2.dagger2learn.plane.Plane;

/**
 * Created by eleven on 2017/6/18.
 */
@Component(modules = PlaneModule.class)
public interface PlaneComponent {
    void inject(MainActivity activity);
}
