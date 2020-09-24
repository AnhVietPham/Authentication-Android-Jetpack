package com.avp.authentication_android_jetpack

import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.fragment_welcome_to_dev_chicken.*


class WelcomeToDevChickenFragment : Fragment() {

    private lateinit var navController : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_welcome_to_dev_chicken, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        initClickListener()
    }

    private fun initClickListener() {
        outlinedTextFieldInputPhoneNumber.setOnClickListener {
            navController.navigate(R.id.action_welcomeToSenDoSellerFragment_to_signInFragment)
        }

        btnJoinGroup.setOnClickListener {
            navController.navigate(R.id.action_welcomeToSenDoSellerFragment_to_signUpFragment)
        }

    }

}