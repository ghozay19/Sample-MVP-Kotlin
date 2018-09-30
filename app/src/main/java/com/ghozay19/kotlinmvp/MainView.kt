package com.ghozay19.kotlinmvp

import com.ghozay19.kotlinmvp.base.BaseView
import com.ghozay19.kotlinmvp.models.HasilModel

interface MainView : BaseView {

    fun success(hasil : HasilModel)
    fun error()
}