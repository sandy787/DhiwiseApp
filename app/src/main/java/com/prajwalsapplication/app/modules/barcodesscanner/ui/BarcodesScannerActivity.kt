package com.prajwalsapplication.app.modules.barcodesscanner.ui

import androidx.activity.viewModels
import com.prajwalsapplication.app.R
import com.prajwalsapplication.app.appcomponents.base.BaseActivity
import com.prajwalsapplication.app.databinding.ActivityBarcodesScannerBinding
import com.prajwalsapplication.app.modules.barcodesscanner.`data`.viewmodel.BarcodesScannerVM
import kotlin.String
import kotlin.Unit

class BarcodesScannerActivity :
    BaseActivity<ActivityBarcodesScannerBinding>(R.layout.activity_barcodes_scanner) {
  private val viewModel: BarcodesScannerVM by viewModels<BarcodesScannerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.barcodesScannerVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BARCODES_SCANNER_ACTIVITY"

  }
}
