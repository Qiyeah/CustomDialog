package com.sunline.qi.customdialog;

/**
 * Created by sunline on 2016/8/22.
 */
public class AndroidInfo {
    private String mId;
    private int mRoute;
    private String mRouteName;
    private String fId;
    private int mTotalPer;
    private int mITPer;
    private int mTotalSymbol;
    private int mITSymbol;

    public AndroidInfo() {
    }

    public AndroidInfo(String id, int route, String routeName, String fId,
                       int totalPer, int ITPer, int totalSymbol, int ITSymbol) {
        mId = id;
        mRoute = route;
        mRouteName = routeName;
        this.fId = fId;
        mTotalPer = totalPer;
        mITPer = ITPer;
        mTotalSymbol = totalSymbol;
        mITSymbol = ITSymbol;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public int getRoute() {
        return mRoute;
    }

    public void setRoute(int route) {
        mRoute = route;
    }

    public String getRouteName() {
        return mRouteName;
    }

    public void setRouteName(String routeName) {
        mRouteName = routeName;
    }


    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public int getTotalPer() {
        return mTotalPer;
    }

    public void setTotalPer(int totalPer) {
        mTotalPer = totalPer;
    }

    public int getITPer() {
        return mITPer;
    }

    public void setITPer(int ITPer) {
        mITPer = ITPer;
    }

    public int getTotalSymbol() {
        return mTotalSymbol;
    }

    public void setTotalSymbol(int totalSymbol) {
        mTotalSymbol = totalSymbol;
    }

    public int getITSymbol() {
        return mITSymbol;
    }

    public void setITSymbol(int ITSymbol) {
        mITSymbol = ITSymbol;
    }
}
