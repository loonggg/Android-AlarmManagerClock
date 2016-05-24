package com.loonggg.alarmmanager.clock.view;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.loonggg.alarmmanager.clock.R;

public class SelectRemindCyclePopup implements OnClickListener {
    private TextView tv_mon, tv_tue, tv_wed, tv_thu, tv_fri, tv_sat, tv_sun, tv_sure, every_day,
            tv_drugcycle_once;
    public PopupWindow mPopupWindow;
    private SelectRemindCyclePopupOnClickListener selectRemindCyclePopupListener;

    public PopupWindow getmPopupWindow() {
        return mPopupWindow;
    }

    private Context mContext;

    @SuppressWarnings("deprecation")
    public SelectRemindCyclePopup(Context context) {
        mContext = context;
        mPopupWindow = new PopupWindow(context);
        mPopupWindow.setBackgroundDrawable(new BitmapDrawable());
        mPopupWindow.setWidth(WindowManager.LayoutParams.FILL_PARENT);
        mPopupWindow.setHeight(WindowManager.LayoutParams.FILL_PARENT);
        mPopupWindow.setTouchable(true);
        mPopupWindow.setFocusable(true);
        mPopupWindow.setOutsideTouchable(true);
        mPopupWindow.setAnimationStyle(R.style.AnimBottom);
        mPopupWindow.setContentView(initViews());
        mPopupWindow.getContentView().setOnTouchListener(new OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mPopupWindow.setFocusable(false);
                // mPopupWindow.dismiss();
                return true;
            }
        });

    }

    public View initViews() {
        View view = LayoutInflater.from(mContext).inflate(R.layout.selectremindcycle_pop_window,
                null);

        tv_drugcycle_once = (TextView) view.findViewById(R.id.tv_drugcycle_once);
        every_day = (TextView) view.findViewById(R.id.tv_drugcycle_0);
        tv_mon = (TextView) view.findViewById(R.id.tv_drugcycle_1);
        tv_tue = (TextView) view.findViewById(R.id.tv_drugcycle_2);
        tv_wed = (TextView) view.findViewById(R.id.tv_drugcycle_3);
        tv_thu = (TextView) view.findViewById(R.id.tv_drugcycle_4);
        tv_fri = (TextView) view.findViewById(R.id.tv_drugcycle_5);
        tv_sat = (TextView) view.findViewById(R.id.tv_drugcycle_6);
        tv_sun = (TextView) view.findViewById(R.id.tv_drugcycle_7);
        tv_sure = (TextView) view.findViewById(R.id.tv_drugcycle_sure);

        tv_drugcycle_once.setOnClickListener(this);
        tv_mon.setOnClickListener(this);
        tv_tue.setOnClickListener(this);
        tv_wed.setOnClickListener(this);
        tv_thu.setOnClickListener(this);
        tv_fri.setOnClickListener(this);
        tv_sat.setOnClickListener(this);
        tv_sun.setOnClickListener(this);
        tv_sure.setOnClickListener(this);
        every_day.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Drawable nav_right = mContext.getResources().getDrawable(R.drawable.cycle_check);
        nav_right.setBounds(0, 0, nav_right.getMinimumWidth(), nav_right.getMinimumHeight());
        switch (v.getId()) {
            case R.id.tv_drugcycle_once:
                selectRemindCyclePopupListener.obtainMessage(9, "");
                break;
            case R.id.tv_drugcycle_0:
                selectRemindCyclePopupListener.obtainMessage(8, "");
                break;
            case R.id.tv_drugcycle_1:
                if (tv_mon.getCompoundDrawables()[2] == null)
                    tv_mon.setCompoundDrawables(null, null, nav_right, null);
                else tv_mon.setCompoundDrawables(null, null, null, null);
                selectRemindCyclePopupListener.obtainMessage(0, "");
                break;
            case R.id.tv_drugcycle_2:
                if (tv_tue.getCompoundDrawables()[2] == null)
                    tv_tue.setCompoundDrawables(null, null, nav_right, null);
                else tv_tue.setCompoundDrawables(null, null, null, null);
                selectRemindCyclePopupListener.obtainMessage(1, "");
                break;
            case R.id.tv_drugcycle_3:
                if (tv_wed.getCompoundDrawables()[2] == null)
                    tv_wed.setCompoundDrawables(null, null, nav_right, null);
                else tv_wed.setCompoundDrawables(null, null, null, null);
                selectRemindCyclePopupListener.obtainMessage(2, "");
                break;
            case R.id.tv_drugcycle_4:
                if (tv_thu.getCompoundDrawables()[2] == null)
                    tv_thu.setCompoundDrawables(null, null, nav_right, null);
                else tv_thu.setCompoundDrawables(null, null, null, null);
                selectRemindCyclePopupListener.obtainMessage(3, "");
                break;
            case R.id.tv_drugcycle_5:
                if (tv_fri.getCompoundDrawables()[2] == null)
                    tv_fri.setCompoundDrawables(null, null, nav_right, null);
                else tv_fri.setCompoundDrawables(null, null, null, null);
                selectRemindCyclePopupListener.obtainMessage(4, "");
                break;
            case R.id.tv_drugcycle_6:
                if (tv_sat.getCompoundDrawables()[2] == null)
                    tv_sat.setCompoundDrawables(null, null, nav_right, null);
                else tv_sat.setCompoundDrawables(null, null, null, null);
                selectRemindCyclePopupListener.obtainMessage(5, "");
                break;
            case R.id.tv_drugcycle_7:
                if (tv_sun.getCompoundDrawables()[2] == null)
                    tv_sun.setCompoundDrawables(null, null, nav_right, null);
                else tv_sun.setCompoundDrawables(null, null, null, null);
                selectRemindCyclePopupListener.obtainMessage(6, "");
                break;
            case R.id.tv_drugcycle_sure:
                int remind = ((tv_mon.getCompoundDrawables()[2] == null) ? 0 : 1) * 1 // 周一
                        + ((tv_tue.getCompoundDrawables()[2] == null) ? 0 : 1) * 2 // 周二
                        + ((tv_wed.getCompoundDrawables()[2] == null) ? 0 : 1) * 4 // 周三
                        + ((tv_thu.getCompoundDrawables()[2] == null) ? 0 : 1) * 8 // 周四
                        + ((tv_fri.getCompoundDrawables()[2] == null) ? 0 : 1) * 16 // 周五
                        + ((tv_sat.getCompoundDrawables()[2] == null) ? 0 : 1) * 32 // 周六
                        + ((tv_sun.getCompoundDrawables()[2] == null) ? 0 : 1) * 64; // 周日
                selectRemindCyclePopupListener.obtainMessage(7, String.valueOf(remind));
                dismiss();
                break;
            default:
                break;
        }

    }

    public interface SelectRemindCyclePopupOnClickListener {
        void obtainMessage(int flag, String ret);
    }

    public void setOnSelectRemindCyclePopupListener(SelectRemindCyclePopupOnClickListener l) {
        this.selectRemindCyclePopupListener = l;
    }

    public void dismiss() {
        if (mPopupWindow != null && mPopupWindow.isShowing()) {
            mPopupWindow.dismiss();
        }
    }

    public void showPopup(View rootView) {
        // 第一个参数是要将PopupWindow放到的View，第二个参数是位置，第三第四是偏移值
        mPopupWindow.showAtLocation(rootView, Gravity.BOTTOM, 0, 0);
    }
}
