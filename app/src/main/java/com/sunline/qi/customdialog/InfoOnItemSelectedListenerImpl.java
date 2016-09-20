package com.sunline.qi.customdialog;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

/**
 * Created by sunline on 2016/9/19.
 */
public abstract class InfoOnItemSelectedListenerImpl implements AdapterView.OnItemSelectedListener {
    int mIndex;
    int value;
    public static final int ITEM_SYMBOL = 0x01;
    int type;
    public InfoOnItemSelectedListenerImpl(int index,int type) {
        mIndex = index;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(view.getContext(), "position = "+position, Toast.LENGTH_SHORT).show();
        if (0 == position) {
            callBack(1);
        } else if (1 == position) {
            callBack(-1);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public abstract void callBack(int value);
}
