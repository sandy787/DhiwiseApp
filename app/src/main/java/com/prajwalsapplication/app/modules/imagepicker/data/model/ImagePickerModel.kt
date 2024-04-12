package com.prajwalsapplication.app.modules.imagepicker.`data`.model

import com.prajwalsapplication.app.R
import com.prajwalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ImagePickerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectedCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_selected)

)
