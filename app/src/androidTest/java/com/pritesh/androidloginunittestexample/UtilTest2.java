package com.pritesh.androidloginunittestexample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

/**
 * Created by pritesh.patel on 2019-03-05, 12:37 PM.
 * ADESA, Canada
 */
@RunWith(AndroidJUnit4.class)
public class UtilTest2
{
    @Test
    public void shouldContainTheCorrectExtras()  throws Exception {
        Context context = mock(Context.class);
        Intent intent = Util.createQuery(context, "query", "value");
        assertNotNull(intent);
        Bundle extras = intent.getExtras();
        assertNotNull(extras);
        assertEquals("query", extras.getString("QUERY"));
        assertEquals("value", extras.getString("VALUE"));
    }
}
