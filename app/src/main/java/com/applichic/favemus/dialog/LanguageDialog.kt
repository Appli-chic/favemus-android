package com.applichic.favemus.dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import com.applichic.favemus.R
import kotlinx.android.synthetic.main.dialog_language.*

class LanguageDialog(context: Context) : Dialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.dialog_language)
        title.text = context.resources.getString(R.string.dialog_language_title)
    }
}