package com.dream.xiaobei.home.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.dream.xiaobei.R
import com.dream.xiaobei.bean.EmptyBean

class MsgAdapter :
    BaseQuickAdapter<EmptyBean, BaseViewHolder>(R.layout.item_msg) {
    override fun convert(holder: BaseViewHolder, item: EmptyBean) {

    }
}