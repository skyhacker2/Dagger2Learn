package io.github.skyhacker2.dagger2learn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

import io.github.skyhacker2.dagger2learn.plane.Plane;
import io.github.skyhacker2.dagger2learn.plane.Spark;
import io.github.skyhacker2.dagger2learn.plane.inject.DaggerPlaneComponent;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = MainActivity.class.getSimpleName();

    @Inject @Named("spark")
    Plane mSpark;

    @Inject @Named("mavic")
    Plane mMavic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerPlaneComponent.builder().build().inject(this);

        if (mSpark == null) {
            Log.e("MainActivity", "mSpark is null");
        } else {
            Log.d("MainActivity", mSpark.toString());
        }

        if (mMavic == null) {
            Log.e("MainActivity", "mSpark is null");
        } else {
            Log.d("MainActivity", mMavic.toString());
        }

    }
}
