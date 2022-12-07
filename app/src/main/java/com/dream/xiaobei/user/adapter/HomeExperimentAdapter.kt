package com.dream.xiaobei.user.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.dream.xiaobei.R
import com.dream.xiaobei.bean.EmptyBean

class HomeExperimentAdapter:BaseQuickAdapter<EmptyBean,BaseViewHolder>(R.layout.item_experiment) {
    init {
        addChildClickViewIds(R.id.seeButton)
    }
    override fun convert(holder: BaseViewHolder, item: EmptyBean) {

//        holder.getView<RTextView>(R.id.seeButton).setOnClickListener {
//            ToastUtils.showShort("查看按钮")
//        }

    }
}