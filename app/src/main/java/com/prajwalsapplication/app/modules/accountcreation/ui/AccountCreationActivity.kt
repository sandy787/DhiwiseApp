package com.prajwalsapplication.app.modules.accountcreation.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.prajwalsapplication.app.R
import com.prajwalsapplication.app.appcomponents.base.BaseActivity
import com.prajwalsapplication.app.databinding.ActivityAccountCreationBinding
import com.prajwalsapplication.app.modules.accountcreation.`data`.viewmodel.AccountCreationVM
import kotlin.String
import kotlin.Unit

class AccountCreationActivity :
    BaseActivity<ActivityAccountCreationBinding>(R.layout.activity_account_creation) {
  private val viewModel: AccountCreationVM by viewModels<AccountCreationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.accountCreationVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ACCOUNT_CREATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccountCreationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
