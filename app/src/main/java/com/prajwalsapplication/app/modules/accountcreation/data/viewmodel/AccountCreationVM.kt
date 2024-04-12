package com.prajwalsapplication.app.modules.accountcreation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.prajwalsapplication.app.modules.accountcreation.`data`.model.AccountCreationModel
import org.koin.core.KoinComponent

class AccountCreationVM : ViewModel(), KoinComponent {
  val accountCreationModel: MutableLiveData<AccountCreationModel> =
      MutableLiveData(AccountCreationModel())

  var navArguments: Bundle? = null
}
