package com.applichic.favemus.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.applichic.favemus.AppExecutors

import com.applichic.favemus.R
import com.applichic.favemus.di.Injectable
import com.applichic.favemus.viewmodel.UserViewModel
import javax.inject.Inject

class HomeFragment : Fragment(), Injectable {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    @Inject
    lateinit var appExecutors: AppExecutors

    private val userViewModel: UserViewModel by viewModels {
        viewModelFactory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        userViewModel.setId(1)
        userViewModel.user.observe(viewLifecycleOwner, Observer {
            print(it)
        })
    }

    companion object {
        fun newInstance(): HomeFragment = HomeFragment()
    }
}
