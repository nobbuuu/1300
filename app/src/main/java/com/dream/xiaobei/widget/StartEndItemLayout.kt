package com.dream.xiaobei.widget

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import com.blankj.utilcode.util.ColorUtils
import com.dream.xiaobei.R
import com.tcl.base.kt.sp

class StartEndItemLayout @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {
    var mStartTv: TextView
    var mEndTv: TextView? = null
    var mEndEdt: EditText? = null
    var mLineView: View? = null

    init {
        val array = context.obtainStyledAttributes(attrs, R.styleable.startEndLayout)
        LayoutInflater.from(context).inflate(R.layout.view_lr_item_view, this)
        val startText = array.getString(R.styleable.startEndLayout_startText)
        val startTextSize = array.getDimension(R.styleable.startEndLayout_startTextSize, 15.sp)
        val startTextColor = array.getInteger(R.styleable.startEndLayout_startTextColor, R.color.black)
        val endText = array.getString(R.styleable.startEndLayout_endText)
        val hintText = array.getString(R.styleable.startEndLayout_hintText)
        val endTextSize = array.getDimension(R.styleable.startEndLayout_endTextSize, 18.sp)
        val endTextColor = array.getInteger(R.styleable.startEndLayout_endTextColor, R.color.black)
        val lineColor = array.getInteger(R.styleable.startEndLayout_lineColor, R.color._xpopup_list_divider)
        val startImg = array.getResourceId(R.styleable.startEndLayout_startImg, R.mipmap.must)
        val isDivider = array.getBoolean(R.styleable.startEndLayout_isDivider, true)
        val isSelect = array.getBoolean(R.styleable.startEndLayout_isSelect, false)
        val isMust = array.getBoolean(R.styleable.startEndLayout_isMust, false)
        mStartTv = findViewById(R.id.startTv)
        mStartTv.setTextSize(TypedValue.COMPLEX_UNIT_PX, startTextSize)
        mStartTv.setTextColor(startTextColor)
        mStartTv.text = "$startText"
        mEndTv = findViewById(R.id.endTv)
        mEndEdt = findViewById(R.id.endEdt)
        mLineView = findViewById(R.id.divider)
        mEndTv?.setTextSize(TypedValue.COMPLEX_UNIT_PX, endTextSize)
        mEndEdt?.setTextSize(TypedValue.COMPLEX_UNIT_PX, endTextSize)
        mEndTv?.setTextColor(endTextColor)
        mEndEdt?.setTextColor(endTextColor)
        mEndTv?.text = "$endText"
        mEndEdt?.setText(endText)
        mEndEdt?.hint = hintText
        val mDivider = findViewById<View>(R.id.divider)
        mDivider.isVisible = isDivider
        val mSelectIv = findViewById<ImageView>(R.id.nextIv)
        mSelectIv.isVisible = isSelect
        val startIv = findViewById<ImageView>(R.id.startIv)
        startIv.setImageResource(startImg)
    }

    fun setStartText(text: String) {
        mStartTv.text = text
    }

    fun setEndText(text: String) {
        mEndTv?.text = text
    }

    fun setEndEdtText(text: String) {
        mEndEdt?.setText(text)
    }

    fun setEndEdtTextColor(color: Int) {
        mEndEdt?.setTextColor(ColorUtils.getColor(color))
    }

    fun setEndTextColor(color: Int) {
        mEndTv?.setTextColor(ColorUtils.getColor(color))
    }

    fun setLineColor(color: Int) {
        mLineView?.setBackgroundColor(ColorUtils.getColor(color))
    }

    fun getEndEdtText(): String {
        return mEndEdt?.text.toString().trim()
    }

    fun getEndText(): String {
        return mEndTv?.text.toString().trim()
    }
}