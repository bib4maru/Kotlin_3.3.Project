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

val days = listOf(
    Day(R.drawable.image1, R.string.act_name_1, 1, R.string.descr),
    Day(R.drawable.image2, R.string.act_name_2, 2, R.string.descr),
    Day(R.drawable.image3, R.string.act_name_3, 3, R.string.descr),
    Day(R.drawable.image4, R.string.act_name_4, 4, R.string.descr),
    Day(R.drawable.image5, R.string.act_name_5, 5, R.string.descr),
    Day(R.drawable.image6, R.string.act_name_6, 6, R.string.descr),
    Day(R.drawable.image7, R.string.act_name_7, 7, R.string.descr),
    Day(R.drawable.image8, R.string.act_name_8, 8, R.string.descr),
    Day(R.drawable.image9, R.string.act_name_1, 9, R.string.descr),
    Day(R.drawable.image10, R.string.act_name_2, 10, R.string.descr),
    Day(R.drawable.image1, R.string.act_name_3, 11, R.string.descr),
    Day(R.drawable.image2, R.string.act_name_5, 12, R.string.descr),
    Day(R.drawable.image3, R.string.act_name_4, 13, R.string.descr),
    Day(R.drawable.image4, R.string.act_name_7, 14, R.string.descr),
    Day(R.drawable.image5, R.string.act_name_6, 15, R.string.descr),
    Day(R.drawable.image6, R.string.act_name_8, 16, R.string.descr),
    Day(R.drawable.image7, R.string.act_name_2, 17, R.string.descr),
    Day(R.drawable.image8, R.string.act_name_3, 18, R.string.descr),
    Day(R.drawable.image9, R.string.act_name_4, 19, R.string.descr),
    Day(R.drawable.image10, R.string.act_name_1, 20, R.string.descr),
    Day(R.drawable.image1, R.string.act_name_6, 21, R.string.descr),
    Day(R.drawable.image2, R.string.act_name_8, 22, R.string.descr),
    Day(R.drawable.image3, R.string.act_name_7, 23, R.string.descr),
    Day(R.drawable.image4, R.string.act_name_4, 24, R.string.descr),
    Day(R.drawable.image5, R.string.act_name_3, 25, R.string.descr),
    Day(R.drawable.image6, R.string.act_name_2, 26, R.string.descr),
    Day(R.drawable.image7, R.string.act_name_8, 27, R.string.descr),
    Day(R.drawable.image8, R.string.act_name_6, 28, R.string.descr),
    Day(R.drawable.image9, R.string.act_name_1, 29, R.string.descr),
    Day(R.drawable.image10, R.string.act_name_7, 30, R.string.descr),
)
