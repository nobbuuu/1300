package com.dream.xiaobei.home.adapter

import android.widget.TextView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.dream.xiaobei.R
import com.dream.xiaobei.bean.EmptyBean
import com.dream.xiaobei.home.ui.SubjectInfoActivity
import com.tcl.base.kt.ktClick
import com.tcl.base.kt.ktStartActivity

class SubjectAdapter :
    BaseQuickAdapter<EmptyBean, BaseViewHolder>(R.layout.item_subject) {
    override fun convert(holder: BaseViewHolder, item: EmptyBean) {
        holder.getView<TextView>(R.id.viewTv).ktClick {
            context.ktStartActivity(SubjectInfoActivity::class)
        }
    }
}