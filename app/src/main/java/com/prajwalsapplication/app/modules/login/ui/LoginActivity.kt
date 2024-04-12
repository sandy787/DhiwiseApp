package com.prajwalsapplication.app.modules.login.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.prajwalsapplication.app.R
import com.prajwalsapplication.app.appcomponents.base.BaseActivity
import com.prajwalsapplication.app.databinding.ActivityLoginBinding
import com.prajwalsapplication.app.modules.accountcreation.ui.AccountCreationActivity
import com.prajwalsapplication.app.modules.login.`data`.viewmodel.LoginVM
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = AccountCreationActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
    }

    companion object {
      const val TAG: String = "LOGIN_ACTIVITY"

    }
  }
