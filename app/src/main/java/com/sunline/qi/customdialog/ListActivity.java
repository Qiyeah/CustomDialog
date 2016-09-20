package com.sunline.qi.customdialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by qi on 2016/9/20.
 */
public class ListActivity extends Activity {
    private ListView menu;
    private LinearLayout item;
    int[] dcRouteIds = {R.id.dc_route1, R.id.dc_route2, R.id.dc_route3, R.id.dc_route4, R.id.dc_route5
            , R.id.dc_route6, R.id.dc_route7, R.id.dc_route8, R.id.dc_route9, R.id.dc_route10
            , R.id.dc_route11, R.id.dc_route12, R.id.dc_route13, R.id.dc_route14, R.id.dc_route15
            , R.id.dc_route16
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        initMenu();
    }
    private void initMenu(){
        menu = (ListView) findViewById(R.id.info_menu);
        menu.setAdapter(new MyAdapter());
    }
    private class MyAdapter extends BaseAdapter{
        private AndroidInfo[] dcInfos;

        public MyAdapter() {
            dcInfos = new AndroidInfo[dcRouteIds.length];
            for (int i = 0; i < dcRouteIds.length; i++) {
                dcInfos[i] = new AndroidInfo();
            }
        }

        @Override
        public int getCount() {
            return dcRouteIds.length;
        }

        @Override
        public Object getItem(int position) {

            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.info_menu_item,null);
            TextView route = (TextView) view.findViewById(R.id.dc_route1);
            route.setText(Integer.toString(position+1));
            EditText name = (EditText)view.findViewById(R.id.dc_name1);
            Spinner totalSymbol = (Spinner)view.findViewById(R.id.dc_total_symbol1);
            totalSymbol.setOnItemSelectedListener(new InfoOnItemSelectedListenerImpl() {
                @Override
                public void callBack(int value) {
                    dcInfos[position].setTotalSymbol(value);
                    Toast.makeText(ListActivity.this, "inInfos["+position+"] = "+dcInfos[position].getTotalSymbol(), Toast.LENGTH_LONG).show();
                }
            });
            EditText totalPer = (EditText)view.findViewById(R.id.dc_total_per1);
            Spinner itSymbol = (Spinner)view.findViewById(R.id.dc_it_symbol1);
            itSymbol.setOnItemSelectedListener(new InfoOnItemSelectedListenerImpl() {
                @Override
                public void callBack(int value) {

                }
            });
            EditText itPer = (EditText)view.findViewById(R.id.dc_it_per1);
            return view;
        }
    }
}
