package com.sunline.qi.customdialog;

import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String tag = "Main";
    private View mView;
    private InfoTag dcTag;
    private AndroidInfo[] dcInfos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        WindowManager manager = getWindowManager();
        DisplayMetrics dm = new DisplayMetrics();
        manager.getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;

        //TODO 初始化容器
        initContainer(R.layout.info_dc);
        EditText name = (EditText) mView.findViewById(R.id.dc_name1);
        System.out.println(name.getText().toString().trim());
        Toast.makeText(MainActivity.this, "name = " +(name.getText().toString().trim()), Toast.LENGTH_LONG).show();

        //TODO 初始化TAG
     /*   if (null == dcTag){
            dcTag = new InfoTag();
            initInfoTag(dcTag, dcRouteIds, dcNameIds, dcTotalSymbolIds, dcITSymbolIds, dcTotalPerIds, dcITPerIds);
        }*/
        //TODO 初始化Spinner
       /* dcInfos = new AndroidInfo[dcRouteIds.length];
        for (int i = 0; i < dcRouteIds.length; i++) {
            dcInfos[i] = new AndroidInfo();
        }
        initSpinner(dcTag, dcInfos);*/



        Spinner totalSymbolSpinner = (Spinner) mView.findViewById(R.id.dc_total_symbol1);
        totalSymbolSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "position = " + position, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity.this, "onNothingSelected ", Toast.LENGTH_SHORT).show();
            }
        });

        //generateInfos( dcTag,dcInfos);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        AlertDialog alert = builder.create();
        builder.setCustomTitle(getLayoutInflater().inflate(R.layout.info_title, null));
        builder.setView(getLayoutInflater().inflate(R.layout.info_dc, null));
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //generateInfos( dcTag,dcInfos);
                EditText name = (EditText) mView.findViewById(R.id.dc_name1);
                System.out.println(name.getText().toString().trim());
                Toast.makeText(MainActivity.this, "name = " +(name.getText().toString().trim()), Toast.LENGTH_LONG).show();

            }
        });
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alert.getWindow().setLayout(width / 3, height / 2);
        builder.show();
    }

    int[] dcRouteIds = {R.id.dc_route1, R.id.dc_route2};
    int[] dcNameIds = {R.id.dc_name1, R.id.dc_name2};
    int[] dcTotalSymbolIds = {R.id.dc_total_symbol1, R.id.dc_total_symbol2};
    int[] dcTotalPerIds = {R.id.dc_total_per1, R.id.dc_total_per2};
    int[] dcITSymbolIds = {R.id.dc_it_symbol1, R.id.dc_it_symbol2};
    int[] dcITPerIds = {R.id.dc_it_per1, R.id.dc_it_per2};
   /* int[] dcRouteIds = {R.id.dc_route1, R.id.dc_route2, R.id.dc_route3, R.id.dc_route4, R.id.dc_route5
            , R.id.dc_route6, R.id.dc_route7, R.id.dc_route8, R.id.dc_route9, R.id.dc_route10
            , R.id.dc_route11, R.id.dc_route12, R.id.dc_route13, R.id.dc_route14, R.id.dc_route15
            , R.id.dc_route16
    };*/
    /*int[] dcNameIds = {R.id.dc_name1, R.id.dc_name2, R.id.dc_name3, R.id.dc_name4, R.id.dc_name5
            , R.id.dc_name6, R.id.dc_name7, R.id.dc_name8, R.id.dc_name9, R.id.dc_name10
            , R.id.dc_name11, R.id.dc_name12, R.id.dc_name13, R.id.dc_name14, R.id.dc_name15
            , R.id.dc_name16
    };*/

   /* int[] dcTotalSymbolIds = {R.id.dc_total_symbol1, R.id.dc_total_symbol2, R.id.dc_total_symbol3, R.id.dc_total_symbol4, R.id.dc_total_symbol5
            , R.id.dc_total_symbol6, R.id.dc_total_symbol7, R.id.dc_total_symbol8, R.id.dc_total_symbol9, R.id.dc_total_symbol10
            , R.id.dc_total_symbol11, R.id.dc_total_symbol12, R.id.dc_total_symbol13, R.id.dc_total_symbol14, R.id.dc_total_symbol15
            , R.id.dc_total_symbol16
    };*/


    /*int[] dcTotalPerIds = {R.id.dc_total_per1, R.id.dc_total_per2, R.id.dc_total_per3, R.id.dc_total_per4, R.id.dc_total_per5
            , R.id.dc_total_per6, R.id.dc_total_per7, R.id.dc_total_per8, R.id.dc_total_per9, R.id.dc_total_per10
            , R.id.dc_total_per11, R.id.dc_total_per12, R.id.dc_total_per13, R.id.dc_total_per14, R.id.dc_total_per15
            , R.id.dc_total_per16
    };*/
  /*  int[] dcITSymbolIds = {R.id.dc_it_symbol1, R.id.dc_it_symbol2, R.id.dc_it_symbol3, R.id.dc_it_symbol4, R.id.dc_it_symbol5
            , R.id.dc_it_symbol6, R.id.dc_it_symbol7, R.id.dc_it_symbol8, R.id.dc_it_symbol9, R.id.dc_it_symbol10
            , R.id.dc_it_symbol11, R.id.dc_it_symbol12, R.id.dc_it_symbol13, R.id.dc_it_symbol14, R.id.dc_it_symbol15
            , R.id.dc_it_symbol16
    };*/
    /*int[] dcITPerIds = {R.id.dc_it_per1, R.id.dc_it_per2, R.id.dc_it_per3, R.id.dc_it_per4, R.id.dc_it_per5
            , R.id.dc_it_per6, R.id.dc_it_per7, R.id.dc_it_per8, R.id.dc_it_per9, R.id.dc_it_per10
            , R.id.dc_it_per11, R.id.dc_it_per12, R.id.dc_it_per13, R.id.dc_it_per14, R.id.dc_it_per15
            , R.id.dc_it_per16
    };*/


    private void initInfoTag(InfoTag tag, int[] routeIds, int[] nameIds, int[] totalSymbolIds,
                             int[] itSymbolIds, int[] totalPerIds, int[] itPerIds) {
        int size = routeIds.length;
        for (int i = 0; i < size; i++) {
//            System.out.println(routeIds[i]);
            TextView route = (TextView) mView.findViewById(routeIds[i]);
            EditText name = (EditText) mView.findViewById(nameIds[i]);
            Spinner totalSymbol = (Spinner) mView.findViewById(totalSymbolIds[i]);
            Spinner itSymbol = (Spinner) mView.findViewById(itSymbolIds[i]);
            EditText totalPer = (EditText) mView.findViewById(totalPerIds[i]);
            EditText itPer = (EditText) mView.findViewById(itPerIds[i]);
//            System.out.println(null == route);
//            System.out.println("null == tag :"+(null == tag));
            tag.route.add(route);
            tag.name.add(name);
            tag.totalSymbol.add(totalSymbol);
            tag.itSymbol.add(itSymbol);
            tag.totalPer.add(totalPer);
            tag.itPer.add(itPer);
        }
    }

    int totalSymbol = 0;
    int itSymbol = 0;

    /*
    new InfoOnItemSelectedListenerImpl(i, InfoOnItemSelectedListenerImpl.ITEM_SYMBOL) {
                @Override
                public void callBack(int value) {
                    totalSymbol = value;
                    Toast.makeText(MainActivity.this, "value = "+value, Toast.LENGTH_SHORT).show();
                }
            }
     */
    private void initSpinner(InfoTag tag, AndroidInfo[] infos) {
        int size = tag.route.size();
        for (int i = 0; i < size; i++) {
            Spinner totalSymbolSpinner = tag.totalSymbol.get(i);
            totalSymbolSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(MainActivity.this, "position = " + position, Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            System.out.println("null == infos[i] : " + (null == infos[i]));
            System.out.println("null == tag.totalSymbol.get(i) : " + (null == tag.totalSymbol.get(i)));
            infos[i].setTotalSymbol(totalSymbol);
            tag.itSymbol.get(i).setOnItemSelectedListener(new InfoOnItemSelectedListenerImpl(i, InfoOnItemSelectedListenerImpl.ITEM_SYMBOL) {
                @Override
                public void callBack(int value) {
                    itSymbol = value;
                }
            });
            infos[i].setITSymbol(itSymbol);
        }
    }

    private void initContainer(int layoutId) {
        //TODO 加载布局文件
        mView = LayoutInflater.from(this).inflate(layoutId, null);

    }

    private void generateInfos(InfoTag tag, AndroidInfo[] infos) {
        AndroidInfo info;
        TextView route;
        EditText name, totalPer, itPer;
        String id, nameStr;
        int routeInt, totalPerInt, itPerInt;
        for (int i = 0; i < infos.length; i++) {
            //TODO 获取控件
            info = infos[i];
            route = tag.route.get(i);
            name = tag.name.get(i);
            totalPer = tag.totalPer.get(i);
            itPer = tag.itPer.get(i);
            //TODO 获取控件内容
            id = IDUtils.getId(IDUtils.INFO);
            totalPerInt = Integer.parseInt(totalPer.getText().toString().trim());
            itPerInt = Integer.parseInt(itPer.getText().toString().trim());
            routeInt = Integer.parseInt(route.getText().toString().trim());
            nameStr = name.getText().toString().trim();
            //TODO 设置参数
            info.setId(id);
            //TODO 缺少fid
            info.setfId("");
            info.setRoute(routeInt);
            info.setTotalPer(totalPerInt);
            info.setITPer(itPerInt);
            info.setRouteName(nameStr);
            System.out.println("id = " + info.getId() +
                    "\nname = " + info.getRouteName() +
                    "\nroute = " + info.getRoute() +
                    "\ntotalPer = " + info.getTotalPer() +
                    "\ntotalSymbol = " + info.getTotalSymbol() +
                    "\nitPer = " + info.getITPer() +
                    "\nitSymbol = " + info.getITSymbol());
            System.out.println();
            Toast.makeText(MainActivity.this, "id = "+info.getId()+
                    "\nroute = "+info.getRoute()+
                    "\nname = "+info.getRouteName()+
                    "\ntotalPer = "+info.getTotalPer()+
                    "\ntotalSymbol = "+info.getTotalSymbol()+
                    "\nitPer = "+info.getITPer()+
                    "\nitSymbol = "+info.getITSymbol()
                    , Toast.LENGTH_SHORT).show();

        }
    }


    /*
    private void displayBriefMemory() {

        final ActivityManager activityManager = (ActivityManager)   getSystemService(ACTIVITY_SERVICE);

        ActivityManager.MemoryInfo   info = new ActivityManager.MemoryInfo();

        activityManager.getMemoryInfo(info);


        Log.i(tag, "系统剩余内存:" + (info.availMem >> 10) + "k");

        Log.i(tag, "系统是否处于低内存运行：" + info.lowMemory);

        Log.i(tag, "当系统剩余内存低于" + info.threshold + "时就看成低内存运行");

    }*/
    /*
    WindowManager manager = getWindowManager();
        DisplayMetrics dm = new DisplayMetrics();
        manager.getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        AlertDialog alert = new AlertDialog.Builder(this).create();
        View title = getLayoutInflater().inflate(R.layout.info_title, null);
        alert.setCustomTitle(title);  alert.setTitle("测试");
        alert.show();
        alert.getWindow().setLayout(width/2, height);
        alert.getWindow().setContentView(R.layout.info_dc);

     */
}
