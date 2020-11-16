package com.example.androidjetpack

import android.os.Parcelable
import java.math.BigDecimal

@Parcelize
data class Money(val amount: BigDecimal): Parcelable{

}

annotation class Parcelize


