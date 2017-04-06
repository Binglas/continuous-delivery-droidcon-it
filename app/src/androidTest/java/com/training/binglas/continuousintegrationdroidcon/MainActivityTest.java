package com.training.binglas.continuousintegrationdroidcon;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * Created by joaozao on 06/04/17.
 */

public class MainActivityTest {

  @Rule
  public ActivityTestRule<MainActivity> rule = new ActivityTestRule <MainActivity> (MainActivity.class);

  @Test
  public void showHelloWorld() {
    onView(withId(R.id.hello)).check(matches(withText(R.string.hello)));

  }
}
