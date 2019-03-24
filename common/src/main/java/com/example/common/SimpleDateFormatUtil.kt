package com.example.common

import java.text.SimpleDateFormat
import java.util.*

fun SimpleDateFormat.now() = this.format(Date())!!
val defaultSDF = SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss:")
fun defaultNow() = defaultSDF.now()!!