package com.pritesh.androidloginunittestexample;

import android.content.Context;

import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class LoginUnitTest
{
    private static final String VALID_STRING = "Login was successful";
    private static final String INVALID_STRING = "Invalid login!";

    @Mock
    private Context mMockContext;

    @Test
    public void addition_isCorrect()
    {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void validLoginTest() {

        LoginActivity myObjectUnderTest = new LoginActivity(mMockContext);

        // ...when the string is returned from the object under test...
        String result = myObjectUnderTest.validate("user","user");

        // ...then the result should be the expected one.
        assertEquals(result, VALID_STRING);
    }

    @Test
    public void inValidLoginTest() {

        LoginActivity myObjectUnderTest = new LoginActivity(mMockContext);

        // ...when the string is returned from the object under test...
        String result = myObjectUnderTest.validate("invalid","invalid");

        // ...then the result should be the expected one.
        assertEquals(result, INVALID_STRING);
    }
}