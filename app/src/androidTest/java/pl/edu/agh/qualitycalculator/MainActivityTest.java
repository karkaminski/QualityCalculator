package pl.edu.agh.qualitycalculator;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.fail;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void testSum() {
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.btnAdd)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("4.0 plus 4.0 gives value 8.0")));
    }

    @Test
    public void testSubtract() {
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("10"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.btnSub)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("10.0 minus 4.0 gives value 6.0")));
    }

    @Test
    public void testMultiply() {
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("10"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("5"));
        onView(withId(R.id.btnMult)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("10.0 multiplied by 5.0 gives value 50.0")));
    }

    @Test
    public void testDivide() {
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("40"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("10"));
        onView(withId(R.id.btnDiv)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("40.0 divided by 10.0 gives value 4.0")));
    }

    @Test
    public void testDivideByZero() {
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("40"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("0"));
        onView(withId(R.id.btnDiv)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("40.0 divided by 0.0 gives value Infinity")));
    }

    @Test
    public void testEmptySum() {
        onView(withId(R.id.btnAdd)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Enter some data to calculate")));
    }

    @Test
    public void testEmptySubtract() {
        onView(withId(R.id.btnSub)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Enter some data to calculate")));
    }

    @Test
    public void testEmptyMultiply() {
        onView(withId(R.id.btnMult)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Enter some data to calculate")));
    }

    @Test
    public void testEmptyDivide() {
        onView(withId(R.id.btnDiv)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Enter some data to calculate")));
    }
}



