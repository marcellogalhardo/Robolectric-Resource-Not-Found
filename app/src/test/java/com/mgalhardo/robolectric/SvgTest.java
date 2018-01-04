package com.mgalhardo.robolectric;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.android.controller.ActivityController;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(manifest= Config.NONE)
public class SvgTest {

    @Test
    public void testViewWithSvg() throws Exception {
        ActivityController<Activity> controller = Robolectric.buildActivity(Activity.class);
        final View view = LayoutInflater.from(controller.get()).inflate(R.layout.view_with_svg, null);
//        final View view = LayoutInflater.from(RuntimeEnvironment.application).inflate(R.layout.view_with_svg, null);
    }

}