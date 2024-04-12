package com.prajwalsapplication.app.modules.barcodesscanner.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.prajwalsapplication.app.modules.barcodesscanner.`data`.model.BarcodesScannerModel
import org.koin.core.KoinComponent

class BarcodesScannerVM : ViewModel(), KoinComponent {
  val barcodesScannerModel: MutableLiveData<BarcodesScannerModel> =
      MutableLiveData(BarcodesScannerModel())

  var navArguments: Bundle? = null
}
