package com.umomo.Stock.setting

import android.content.Context
import infix.imrankst1221.rocket.library.data.NavigationMenu

class AppDataInstance(context: Context) {
    companion object {
        private var INSTANCE: AppDataInstance? = null
        var notificationUrl = ""
        var navigationMenus: ArrayList<NavigationMenu> = arrayListOf()

        fun getINSTANCE(mContext: Context): AppDataInstance {
            if (INSTANCE == null)
                INSTANCE = AppDataInstance(mContext.applicationContext)
            return INSTANCE as AppDataInstance
        }
    }
}