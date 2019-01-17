package com.t.buttonlibrary.button;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.t.buttonlibrary.R;

public class CustomButton  extends android.support.v7.widget.AppCompatButton {
     private int mHeight;
    private int mWidth;
    public CustomButton(Context context) {
        super(context);
        initView();
    }
    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }
    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (mHeight == 0 && mWidth == 0 && w != 0 && h != 0) {
            mHeight = getHeight();
            mWidth = getWidth();
        }
    }


    private void initView() {

GradientDrawable drawable=new GradientDrawable();
        drawable.setShape(GradientDrawable.RECTANGLE);
        drawable.setColor(getResources().getColor(R.color.x));
        drawable.setCornerRadius(50);


      /*  drawable.getGradientDrawable().setShape(GradientDrawable.RECTANGLE);
        drawable.setColor(color);
        drawable.setCornerRadius(cornerRadius);
        drawable.setStrokeColor(color);
        drawable.setStrokeWidth(strokeWidth);*/

        setBackgroundCompat(drawable);
    }
    @SuppressWarnings("deprecation")
    private void setBackgroundCompat(@Nullable Drawable drawable) {

        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.JELLY_BEAN) {
            setBackgroundDrawable(drawable);
        } else {
            setBackground(drawable);
        }
    }

}



















