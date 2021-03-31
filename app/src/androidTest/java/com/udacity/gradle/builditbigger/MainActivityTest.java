package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.hamcrest.core.StringContains;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;
/** Created this test by using tutorial in slack https://stackoverflow.com/questions/46598149/test-a-textview-value-is-not-empty-using-espresso-and-fail-if-a-textview-value-i/46598289#46598289*/
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkJokeIsDisplayed() throws Exception {
        // perform a click on the button
        onView(withId(R.id.tell_joke_button)).perform(click());

        // passes if the textView does not match the empty string
        onView(withId(R.id.joke_textview)).check(matches(not(withText(""))));
        //onView(withId(R.id.joke_textview)).check(matches(not(withText(StringContains.containsString("failed")))));
    }
}