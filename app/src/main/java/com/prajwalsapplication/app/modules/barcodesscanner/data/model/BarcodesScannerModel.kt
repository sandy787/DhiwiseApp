package com.prajwalsapplication.app.modules.barcodesscanner.`data`.model

import com.prajwalsapplication.app.R
import com.prajwalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BarcodesScannerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtScantheQRcod: String? =
      MyApp.getInstance().resources.getString(R.string.msg_scan_the_qr_code)

)
