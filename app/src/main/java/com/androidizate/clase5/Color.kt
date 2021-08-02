package com.androidizate.clase5

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Color(
    val name: String,
    val hex: String,
    val value: Int
) : Parcelable
