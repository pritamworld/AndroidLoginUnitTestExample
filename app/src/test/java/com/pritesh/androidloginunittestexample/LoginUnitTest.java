package com.pritesh.androidloginunittestexample;

import android.content.Context;

import org.junit.Test;
import org.mockito.Mock;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 * https://www.vogella.com/tutorials/Mockito/article.html
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

    // demonstrates the return of multiple values
    @Test
    public void testMoreThanOneReturnValue()  {
        Iterator<String> i= mock(Iterator.class);
        when(i.next()).thenReturn("Mockito").thenReturn("rocks");
        String result= i.next()+" "+i.next();
        //assert
        assertEquals("Mockito rocks", result);
    }

    // this test demonstrates how to return values based on the input
    @Test
    public void testReturnValueDependentOnMethodParameter()  {
        Comparable<String> c= mock(Comparable.class);
        when(c.compareTo("Mockito")).thenReturn(1);
        when(c.compareTo("Eclipse")).thenReturn(2);
        //assert
        assertEquals(1, c.compareTo("Mockito"));
    }

    // this test demonstrates how to return values independent of the input value
    @Test
    public void testReturnValueInDependentOnMethodParameter()  {
        Comparable<Integer> c= mock(Comparable.class);
        when(c.compareTo(anyInt())).thenReturn(-1);
        //assert
        assertEquals(-1, c.compareTo(9));
    }
}