package com.prajwalsapplication.app.modules.imagepicker.ui

import android.view.View
import androidx.activity.viewModels
import com.prajwalsapplication.app.R
import com.prajwalsapplication.app.appcomponents.base.BaseActivity
import com.prajwalsapplication.app.databinding.ActivityImagePickerBinding
import com.prajwalsapplication.app.modules.imagepicker.`data`.model.ImagePickerRowModel
import com.prajwalsapplication.app.modules.imagepicker.`data`.viewmodel.ImagePickerVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ImagePickerActivity : BaseActivity<ActivityImagePickerBinding>(R.layout.activity_image_picker)
    {
  private val viewModel: ImagePickerVM by viewModels<ImagePickerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val imagePickerAdapter =
    ImagePickerAdapter(viewModel.imagePickerList.value?:mutableListOf())
    binding.recyclerImagePicker.adapter = imagePickerAdapter
    imagePickerAdapter.setOnItemClickListener(
    object : ImagePickerAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ImagePickerRowModel) {
        onClickRecyclerImagePicker(view, position, item)
      }
    }
    )
    viewModel.imagePickerList.observe(this) {
      imagePickerAdapter.updateData(it)
    }
    binding.imagePickerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerImagePicker(
    view: View,
    position: Int,
    item: ImagePickerRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IMAGE_PICKER_ACTIVITY"

  }
}
