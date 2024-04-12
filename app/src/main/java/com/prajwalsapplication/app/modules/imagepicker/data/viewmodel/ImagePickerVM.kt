package com.prajwalsapplication.app.modules.imagepicker.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.prajwalsapplication.app.modules.imagepicker.`data`.model.ImagePickerModel
import com.prajwalsapplication.app.modules.imagepicker.`data`.model.ImagePickerRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ImagePickerVM : ViewModel(), KoinComponent {
  val imagePickerModel: MutableLiveData<ImagePickerModel> = MutableLiveData(ImagePickerModel())

  var navArguments: Bundle? = null

  val imagePickerList: MutableLiveData<MutableList<ImagePickerRowModel>> =
      MutableLiveData(mutableListOf())
}
