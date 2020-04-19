package com.applichic.favemus.dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.applichic.favemus.R
import kotlinx.android.synthetic.main.dialog_language.*


class LanguageDialog(context: Context) : Dialog(context) {
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.dialog_language)
        title.text = context.resources.getString(R.string.dialog_language_title)

        val countries = Country.getCountries()

        if (countries != null) {
            viewManager = LinearLayoutManager(context)
            viewAdapter = CountryAdapter(countries)
            recycler_view_languages.apply {
                setHasFixedSize(true)
                layoutManager = viewManager
                adapter = viewAdapter
            }
        }
    }

    class CountryAdapter(private val countries: List<Country>) :
        RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

        class CountryViewHolder(val v: View) : RecyclerView.ViewHolder(v) {
            val countryName = v.findViewById(R.id.tv_country_name) as TextView
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
            val view: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_view_language, parent, false)

            return CountryViewHolder(view)
        }

        override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
            holder.countryName.text = countries[position].name
        }

        override fun getItemCount() = countries.size
    }
}