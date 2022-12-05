package com.dream.xiaobei.widget

import android.content.Context
import android.graphics.Typeface
import android.text.SpannableString
import android.text.Spanned
import android.text.style.AbsoluteSizeSpan
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import com.blankj.utilcode.util.ColorUtils
import com.blankj.utilcode.util.LogUtils
import com.dream.xiaobei.R

class SpanTextview @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    init {
        val array = context.obtainStyledAttributes(attrs, R.styleable.spanTextview)
        val spanText = array.getString(R.styleable.spanTextview_spanText)
        val spanTextSize = array.getInteger(R.styleable.spanTextview_spanTextSize, 18)
        val spanColor = array.getColor(
            R.styleable.spanTextview_spanColor,
            ColorUtils.getColor(R.color.color_44B0AE)
        )
        val content = text.toString()
        val spanStr = SpannableString(content)
        spanText?.let {
            if (content.contains(it)) {
                val startIndex = content.indexOf(spanText.first())
                val endIndex = content.indexOf(spanText.last())
                LogUtils.dTag("tz", startIndex)
                LogUtils.dTag("tz", endIndex)
                spanStr.setSpan(
                    ForegroundColorSpan(spanColor),
                    startIndex,
                    endIndex + 1,
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
                )
                spanStr.setSpan(
                    AbsoluteSizeSpan(spanTextSize, true),
                    startIndex,
                    endIndex + 1,
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
                )
                spanStr.setSpan(
                    StyleSpan(Typeface.BOLD),
                    startIndex,
                    endIndex + 1,
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
                )
            }
        }
        text = spanStr
    }

}