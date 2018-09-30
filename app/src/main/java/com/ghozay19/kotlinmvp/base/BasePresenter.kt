package com.ghozay19.kotlinmvp.base

interface BasePresenter<in T : BaseView> {

    fun onAttach(view : T)
    fun onDettach()

    /**
     *onAttach digunakan nanti memindahkan data ke model atau ke view
     * onDettach kalau sendainya proses onAttach selesai.Bingung “T” itu gunanya apa ?
     * itu sebagai variable generator saja,bebas mas “N”,”A” atau yang lainnya.
     * jadi intinya nanti yang di dalam kurung sikut itu bebas mau interface
     * apapun tidak ada pengecualian.atau bisa di pakai oleh presenter manapun.
     */
}