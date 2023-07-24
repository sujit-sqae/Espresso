package com.example.espressotesting_calculatorandroidapp;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);


    @Test
    public void additionTest() {
        Espresso.onView(ViewMatchers.withId(R.id.button2)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.buttonadd)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.button3)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.buttoneql)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.edt1)).check(ViewAssertions.matches(ViewMatchers.withText("5.0")));
    }

    @Test
    public void subtractionTest() {
        Espresso.onView(ViewMatchers.withId(R.id.button8)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.buttonsub)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.button4)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.buttoneql)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.edt1)).check(ViewAssertions.matches(ViewMatchers.withText("4.0")));
    }

    @Test
    public void multiplicationTest() {
        Espresso.onView(ViewMatchers.withId(R.id.button5)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.buttonmul)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.button6)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.buttoneql)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.edt1)).check(ViewAssertions.matches(ViewMatchers.withText("30.0")));
    }

    @Test
    public void divisionTest() {
        Espresso.onView(ViewMatchers.withId(R.id.button9)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.buttondiv)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.button3)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.buttoneql)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.edt1)).check(ViewAssertions.matches(ViewMatchers.withText("3.0")));
    }
}
