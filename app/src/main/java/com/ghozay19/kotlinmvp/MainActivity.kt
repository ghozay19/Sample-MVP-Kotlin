package com.ghozay19.kotlinmvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ghozay19.kotlinmvp.models.HasilModel
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.noButton
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.toast
import org.jetbrains.anko.yesButton

class MainActivity : AppCompatActivity(), MainView {

    lateinit var presenter: MainPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO inisial dolo boz q
        presenter = MainPresenter(this)

        submitHitung.onClick {
            presenter.hitung(input1.text.toString(), input2.text.toString())
        }

    }

    override fun success(hasil: HasilModel) {
        alert {
            title = hasil.hasilModel
            noButton {  }
            yesButton {  }
        }.show()
    }

    override fun error() {
        toast("jangan kosong")
    }

    override fun onAttachView() {
        presenter.onAttach(this)
    }

    override fun onDettachView() {
        onDettachView()
    }

    override fun onStart() {
        super.onStart()
        onAttachView()
    }

    override fun onDestroy() {
        super.onDestroy()
        onDettachView()
    }

}
