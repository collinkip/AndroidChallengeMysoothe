package com.example.myapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.myapp.R

private val KulimParkLight= FontFamily(Font(R.font.kulim_park_light))
private val KulimParkRegular= FontFamily(Font(R.font.kulim_park))
private val latoRegular= FontFamily(Font(R.font.lato))
private val latoBold= FontFamily(Font(R.font.lato_bold))

// Set of Material typography styles to start with
val Typography = Typography(
    titleLarge =TextStyle(
        fontSize = 28.sp,
        letterSpacing = 1.15.sp,
        fontFamily = KulimParkLight,),
    titleMedium  =TextStyle(
        fontSize = 15.sp,
        letterSpacing = 1.15.sp,
        fontFamily = KulimParkRegular,
    ),
    titleSmall = TextStyle(
        fontSize = 14.sp,
        letterSpacing = 0.sp,
        fontFamily = latoBold,
    ),
    bodyLarge =TextStyle(
        fontSize = 14.sp,
        letterSpacing = 0.sp,
        fontFamily = latoRegular,),
    labelMedium =TextStyle(
        fontSize = 14.sp,
        letterSpacing = 1.15.sp,
        fontFamily = latoBold,),
    labelSmall =TextStyle(
        fontSize = 12.sp,
        letterSpacing = 1.15.sp,
        fontFamily = KulimParkRegular,),
)