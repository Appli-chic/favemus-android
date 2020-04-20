package com.applichic.favemus.dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.applichic.favemus.R
import kotlinx.android.synthetic.main.dialog_language.*
import java.util.*


class LanguageDialog(context: Context) : Dialog(context) {
    private lateinit var viewAdapter: CountryAdapter
    private lateinit var viewManager: RecyclerView.LayoutManager

    private var clickListener: ClickListener? = null
    private var countries: List<Country>? = null
    private var searchCountries: List<Country>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.dialog_language)
        title.text = context.resources.getString(R.string.dialog_language_title)

        countries = Country.getCountries()
        searchCountries = countries

        if (searchCountries != null) {
            viewManager = LinearLayoutManager(context)
            viewAdapter = CountryAdapter(context, searchCountries!!)
            recycler_view_languages.apply {
                setHasFixedSize(true)
                layoutManager = viewManager
                adapter = viewAdapter
            }

            viewAdapter.setOnItemClickListener(object : CountryAdapter.ClickListener {
                override fun onItemClick(position: Int, v: View?) {
                    val selectedCountry = searchCountries!![position]
                    clickListener?.onItemClick(selectedCountry)
                    dismiss()
                }
            })
        }

        search_text.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                searchCountries = countries?.filter {
                    it.name.toLowerCase(Locale.getDefault()).contains(
                        search_text.text.toString().toLowerCase(
                            Locale.getDefault()
                        )
                    )
                }

                if (searchCountries != null) {
                    viewAdapter.setCountries(searchCountries!!)
                    viewAdapter.notifyDataSetChanged()
                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            }
        })
    }

    fun setOnItemClickListener(clickListener: ClickListener?) {
        this.clickListener = clickListener
    }

    interface ClickListener {
        fun onItemClick(country: Country)
    }

    class CountryAdapter(private val context: Context, private var countries: List<Country>) :
        RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {
        private var clickListener: ClickListener? = null

        class CountryViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
            val countryName = view.findViewById(R.id.tv_country_name) as TextView
            val countryFlag = view.findViewById(R.id.image_flag) as ImageView
        }

        fun setCountries(countries: List<Country>) {
            this.countries = countries
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
            val view: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_view_language, parent, false)
            return CountryViewHolder(view)
        }

        override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
            holder.view.setOnClickListener {
                clickListener?.onItemClick(holder.adapterPosition, it)
            }

            holder.countryName.text = countries[position].name
            holder.countryFlag.setImageResource(
                Country.getFlag(
                    countries[position],
                    context,
                    context.packageName
                )
            )
        }

        override fun getItemCount() = countries.size

        fun setOnItemClickListener(clickListener: ClickListener?) {
            this.clickListener = clickListener
        }

        interface ClickListener {
            fun onItemClick(position: Int, v: View?)
        }
    }
}