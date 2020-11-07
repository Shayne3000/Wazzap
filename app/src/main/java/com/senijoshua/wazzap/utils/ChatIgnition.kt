package com.senijoshua.wazzap.utils

import android.app.Application
import android.util.Base64

private const val streamChat = "YldGcVpXRXlhblJtY21SNgo="

/**
 * Class for initialising the chat module instance
 *
 * @author Seni Joshua
 */
object ChatIgnition {

    fun getClient(): String {
        val initialDecode = Base64.decode(streamChat, Base64.DEFAULT)
        return String(Base64.decode(initialDecode, Base64.DEFAULT))
    }
}
