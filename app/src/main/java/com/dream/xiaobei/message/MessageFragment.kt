package com.dream.xiaobei.message

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.*
import android.webkit.WebView
import android.widget.PopupWindow
import com.blankj.utilcode.util.ToastUtils
import com.dream.xiaobei.R
import com.dream.xiaobei.bean.EmptyBean
import com.dream.xiaobei.databinding.FragmentMessageBinding
import com.dream.xiaobei.message.vm.MessageViewModel
import com.dream.xiaobei.user.adapter.RunningAdapter
import com.ruffian.library.widget.RCheckBox
import com.ruffian.library.widget.RImageView
import com.ruffian.library.widget.RTextView
import com.tcl.base.common.ui.BaseFragment
import com.tcl.base.weiget.ConsecutiveScrollerLayout


/**
 *@author tiaozi
 *@date   2022/1/26
 *description
 */
class MessageFragment : BaseFragment<MessageViewModel, FragmentMessageBinding>() {
    // 声明PopupWindow对象
    var popupWindow: PopupWindow? = null


    override fun initView(savedInstanceState: Bundle?) {

        val mAdapter = RunningAdapter()
        val data = arrayListOf<EmptyBean>()
        repeat(3) {
            data.add(EmptyBean())
        }
        mBinding.runningRv.apply {
            adapter = mAdapter
        }
        mAdapter.setList(data)



        mAdapter.setOnItemChildClickListener { adapter, view, position ->

            when (view.id) {
                R.id.seeButton -> showPopWindow()

            }

        }


    }

    /**
     * 显示弹窗方法
     */
    @SuppressLint("ResourceType")
    fun showPopWindow() {
        // 加载弹窗布局
        val pwView =
            LayoutInflater.from(context).inflate(R.layout.popup_message, null, false)
        // 实例化 PopupWindow
        popupWindow = PopupWindow(
            pwView,
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        popupWindow?.isOutsideTouchable = false
        popupWindow?.isFocusable = false
//        val webView = pwView.findViewById<WebView>(R.id.webView)
//        viewModel.privacyResult.value?.`84869D8295978DB59386919199919A80B68691829D95868DA18698`?.let {
//            webView.loadUrl(it)
//        }

//        //设置关闭popup按钮
//        val closeImage = pwView.findViewById<RImageView>(R.id.privacy_fault_image)
//        closeImage.setOnClickListener {
//            popupWindow?.dismiss()
//            finish()
//        }
        //设置popupWindow里面的未选中按钮
//        val unselectImage = pwView.findViewById<RCheckBox>(R.id.privacyPopupCb)
//        val checkButton = pwView.findViewById<RTextView>(R.id.privacy_box_button)
//        //设置continue按钮
//        checkButton.ktClick {
//            if (!unselectImage.isChecked) {
//                ToastUtils.showShort("Please check this box and continue")
//            } else {
//                popupWindow?.dismiss()
//            }
//        }
        //设置disagree按钮
//        val disagreeButton = pwView.findViewById<RTextView>(R.id.privacy_dis_agree_button)
//        disagreeButton?.setOnClickListener {
//            popupWindow?.dismiss()
//            finish()
//        }
        // 设置 popupWindow
        popupWindow?.isFocusable = true // 取得焦点
        //点击外部消失
        popupWindow?.isOutsideTouchable = true
        //设置可以点击
        popupWindow?.isTouchable = true
        // 加载弹窗动画
        popupWindow?.animationStyle = R.style.popup_dialog
        //从底部显示
        popupWindow?.showAtLocation(pwView, Gravity.BOTTOM, 0, 0)
        windowAlpha(0.5f)
        // 设置弹窗关闭监听——恢复亮度
        popupWindow?.setOnDismissListener {
            windowAlpha(1f)
        }
    }

    // 控制背景亮度
    private fun windowAlpha(alpha: Float) {
        val attributes = activity?.window?.attributes
        if (attributes != null) {
            attributes.alpha = alpha
        }
        activity?.window?.attributes = attributes
    }

    override fun onResume() {
        super.onResume()
    }

}