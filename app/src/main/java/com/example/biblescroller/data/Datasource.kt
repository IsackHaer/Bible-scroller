package com.example.biblescroller.data

import android.content.Context
import com.example.biblescroller.R
import com.example.biblescroller.data.model.Bible

data class Datasource(val context: Context) {

    fun loadBible(): List<Bible> {
         val bibleList = mutableListOf<Bible>(
             Bible("SC-Bible","nkjv","Goatskin-leather","Black",thImageList),
             Bible("MA-Study Bible", "nkjv", "Goatskin-leather", "Brown",masImageList),
             Bible("LP-Bible", "kjv", "Leathersoft", "Burgundy",kjvImageList),
             Bible("NET-Bible", "net", "Leathersoft", "Teal", netImageList)

        )

        return bibleList
    }

    val thImageList = mutableListOf<Int>(
        R.drawable.th1,
        R.drawable.th2,
        R.drawable.th3,
        R.drawable.th4,
        R.drawable.th5,
    )

    val masImageList = mutableListOf<Int>(
        R.drawable.mas1,
        R.drawable.mas2,
        R.drawable.mas3,
        R.drawable.mas4,
    )

    val kjvImageList = mutableListOf<Int>(
        R.drawable.kjv1,
        R.drawable.kjv2,
        R.drawable.kjv3,
        R.drawable.kjv4,
        R.drawable.kjv5,
    )

    val netImageList = mutableListOf<Int>(
        R.drawable.net1,
        R.drawable.net2,
        R.drawable.net3,
        R.drawable.net4,
    )
}