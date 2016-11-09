package com.espressorotation;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isRoot;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static com.espressorotation.OrientationChangeAction.orientationLandscape;
import static com.espressorotation.OrientationChangeAction.orientationPortrait;

@RunWith(AndroidJUnit4.class)
public class EspressoTests {

    @Rule
    public ActivityTestRule<MainActivity> testRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void rotationTest() {
        onView(withId(R.id.fab_plus)).perform(click());
        onView(isRoot()).perform(orientationLandscape());
        onView(isRoot()).perform(orientationPortrait());
    }

}
