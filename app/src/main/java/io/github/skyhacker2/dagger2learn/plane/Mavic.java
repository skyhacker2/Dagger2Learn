package io.github.skyhacker2.dagger2learn.plane;


import javax.inject.Inject;

/**
 * Created by eleven on 2017/6/18.
 */

public class Mavic extends Plane {

    @Inject
    public Mavic() {
    }

    @Override
    public String getName() {
        return "Mavic";
    }
}
