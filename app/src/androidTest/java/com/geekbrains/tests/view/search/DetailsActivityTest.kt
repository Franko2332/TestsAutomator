package com.geekbrains.tests.view.search


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.geekbrains.tests.R
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class DetailsActivityTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun detailsActivityTest() {
        onView(allOf(withId(R.id.toDetailsActivityButton))).perform(click())
        onView(allOf(withId(R.id.incrementButton))).perform(click())
        val textView = onView(
            allOf(
                withId(R.id.totalCountTextView),
                withText("Number of results: 1"),
                isDisplayed()
            )
        )
        textView.check(matches(withText("Number of results: 1")))
    }

}
