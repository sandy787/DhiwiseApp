package com.prajwalsapplication.app.modules.accountcreation.`data`.model

import com.prajwalsapplication.app.R
import com.prajwalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AccountCreationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelM: String? = MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_mobile_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMFour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_set_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10198Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10198OneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10198TwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10198ThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10198FourValue: String? = null
)
