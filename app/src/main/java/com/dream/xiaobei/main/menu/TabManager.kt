package com.dream.xiaobei.main.menu

import androidx.annotation.IntDef
import com.dream.xiaobei.R

/**
 * Author: tiaozi
 * Date : 2021/6/9
 * Drc:
 */
const val MAIN_TAB_AREA = 0
const val MAIN_TAB_MESSAGE = 1
const val MAIN_TAB_MINE = 2
const val KEY_TAB_POSITION = "position"

object TabManager {
    val menus: List<TabItem>
        get() {
            return arrayListOf<TabItem>().apply {
                add(
                    TabItem(
                        MAIN_TAB_AREA,
                        R.id.tab_lottie_1,
                        R.string.title_area,
                        "lottie_home.json",
                        selectImg = R.mipmap.tab_home_select,
                        normalImg = R.mipmap.tab_home_normal
                    )
                )
                add(
                    TabItem(
                        MAIN_TAB_MESSAGE,
                        R.id.tab_lottie_3,
                        R.string.title_message,
                        "lottie_rank.json",
                        selectImg = R.mipmap.tab_ing_select,
                        normalImg = R.mipmap.tab_ing_normal
                    )
                )
                add(
                    TabItem(
                        MAIN_TAB_MINE,
                        R.id.tab_lottie_5,
                        R.string.title_mine,
                        "lottie_mine.json",
                        selectImg = R.mipmap.tab_mine_select,
                        normalImg = R.mipmap.tab_mine_normal
                    )
                )
            }
        }
}

@IntDef(MAIN_TAB_AREA, MAIN_TAB_MESSAGE, MAIN_TAB_MINE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
annotation class TabId