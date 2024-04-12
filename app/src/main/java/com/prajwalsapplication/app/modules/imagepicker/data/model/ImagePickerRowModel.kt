package com.prajwalsapplication.app.modules.imagepicker.`data`.model

import com.prajwalsapplication.app.R
import com.prajwalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ImagePickerRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRecent: String? = MyApp.getInstance().resources.getString(R.string.lbl_recent)

)
