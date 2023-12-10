package com.example.thirthydays.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.thirthydays.R
data class Day(
    @DrawableRes
    val imageResourceId: Int,

    @StringRes
    val name: Int,

    val day: Int,

    @StringRes
    val description: Int,
)

val activities = listOf(
    Day(R.drawable.image1, R.string.act_name_1, 1, R.string.descr),
    Day(R.drawable.image2, R.string.act_name_2, 1, R.string.descr),
    Day(R.drawable.image3, R.string.act_name_3, 1, R.string.descr),
    Day(R.drawable.image4, R.string.act_name_4, 1, R.string.descr),
    Day(R.drawable.image5, R.string.act_name_5, 1, R.string.descr),
    Day(R.drawable.image6, R.string.act_name_6, 1, R.string.descr),
    Day(R.drawable.image7, R.string.act_name_7, 1, R.string.descr),
    Day(R.drawable.image8, R.string.act_name_8, 1, R.string.descr),
    Day(R.drawable.image9, R.string.act_name_1, 1, R.string.descr),
    Day(R.drawable.image10, R.string.act_name_2, 1, R.string.descr),
    Day(R.drawable.image1, R.string.act_name_3, 1, R.string.descr),
    Day(R.drawable.image2, R.string.act_name_5, 1, R.string.descr),
    Day(R.drawable.image3, R.string.act_name_4, 1, R.string.descr),
    Day(R.drawable.image4, R.string.act_name_7, 1, R.string.descr),
    Day(R.drawable.image5, R.string.act_name_6, 1, R.string.descr),
    Day(R.drawable.image6, R.string.act_name_8, 1, R.string.descr),
    Day(R.drawable.image7, R.string.act_name_2, 1, R.string.descr),
    Day(R.drawable.image8, R.string.act_name_3, 1, R.string.descr),
    Day(R.drawable.image9, R.string.act_name_4, 1, R.string.descr),
    Day(R.drawable.image10, R.string.act_name_1, 1, R.string.descr),
    Day(R.drawable.image1, R.string.act_name_6, 1, R.string.descr),
    Day(R.drawable.image2, R.string.act_name_8, 1, R.string.descr),
    Day(R.drawable.image3, R.string.act_name_7, 1, R.string.descr),
    Day(R.drawable.image4, R.string.act_name_4, 1, R.string.descr),
    Day(R.drawable.image5, R.string.act_name_3, 1, R.string.descr),
    Day(R.drawable.image6, R.string.act_name_2, 1, R.string.descr),
    Day(R.drawable.image7, R.string.act_name_8, 1, R.string.descr),
    Day(R.drawable.image8, R.string.act_name_6, 1, R.string.descr),
    Day(R.drawable.image9, R.string.act_name_1, 1, R.string.descr),
    Day(R.drawable.image10, R.string.act_name_7, 1, R.string.descr),
)
