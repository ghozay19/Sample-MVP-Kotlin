package com.ghozay19.kotlinmvp

import com.ghozay19.kotlinmvp.base.BasePresenter
import com.ghozay19.kotlinmvp.models.HasilModel

class MainPresenter : BasePresenter<MainView>{

    //TODO Deklarasi
    var modelview: MainView? = null

    //TODO Klik kanan -> generate -> secondary construktor
    constructor(modelview: MainView?) {
        this.modelview = modelview
    }

    //TODO Buat Function sendiri

    fun hitung(satu: String, dua: String) {
        //TODO kondisional
        if (satu.isNotEmpty() && dua.isNotEmpty()) {
            val nilai1 = satu.toDouble()
            val nilai2 = dua.toDouble()
            val hasil = nilai1 * nilai2
            val model = HasilModel(hasil.toString())

            //TODO masukan ke view
            modelview?.success(model)
        } else {
            //TODO response ke view kalo string kosong
            modelview?.error()
        }
    }

    override fun onAttach(view: MainView){
        modelview = view
    }

    override fun  onDettach(){
        modelview = null
    }



}