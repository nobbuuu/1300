package com.dream.xiaobei.user.adapter

import com.blankj.utilcode.util.ToastUtils
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.dream.xiaobei.R
import com.dream.xiaobei.bean.EmptyBean
import com.ruffian.library.widget.RTextView

class RunningAdapter:BaseQuickAdapter<EmptyBean,BaseViewHolder>(R.layout.item_running) {
    init {
        addChildClickViewIds(R.id.seeButton)
    }
    override fun convert(holder: BaseViewHolder, item: EmptyBean) {

//        holder.getView<RTextView>(R.id.seeButton).setOnClickListener {
//            ToastUtils.showShort("查看按钮")
//        }

    }
}