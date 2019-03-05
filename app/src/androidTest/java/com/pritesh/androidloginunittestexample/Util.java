package com.pritesh.androidloginunittestexample;

import android.content.Context;
import android.content.Intent;

/**
 * Created by pritesh.patel on 2019-03-05, 12:27 PM.
 * ADESA, Canada
 */

public class Util {

    public static Intent createQuery(Context context, String query, String value) {
        // Reuse MainActivity for simplification
        Intent i = new Intent(context, LoginActivity.class);
        i.putExtra("QUERY", query);
        i.putExtra("VALUE", value);
        return i;
    }
}
