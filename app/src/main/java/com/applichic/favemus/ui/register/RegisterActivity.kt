package com.applichic.favemus.ui.register

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.applichic.favemus.AppExecutors
import com.applichic.favemus.R
import com.applichic.favemus.dialog.LanguageDialog
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_register.layout_loading
import kotlinx.android.synthetic.main.activity_register.toolbar
import javax.inject.Inject

class RegisterActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    @Inject
    lateinit var appExecutors: AppExecutors

    private val registerViewModel: RegisterViewModel by viewModels {
        viewModelFactory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        setSupportActionBar(toolbar)
        supportActionBar?.title = ""
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        registerViewModel.isLoading.observe(this, Observer {
            if(it) {
                layout_loading.visibility = View.VISIBLE
            } else {
                layout_loading.visibility = View.GONE
            }
        })
    }

    fun onRegisterClicked(view: View) {
    }

    fun onSelectCountry(view: View) {
        val languageDialog = LanguageDialog(this)
        languageDialog.show()
    }
}
