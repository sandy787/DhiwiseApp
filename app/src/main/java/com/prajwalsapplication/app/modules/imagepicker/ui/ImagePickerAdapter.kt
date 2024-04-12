package com.prajwalsapplication.app.modules.imagepicker.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prajwalsapplication.app.R
import com.prajwalsapplication.app.databinding.RowImagePickerBinding
import com.prajwalsapplication.app.modules.imagepicker.`data`.model.ImagePickerRowModel
import kotlin.Int
import kotlin.collections.List

class ImagePickerAdapter(
  var list: List<ImagePickerRowModel>
) : RecyclerView.Adapter<ImagePickerAdapter.RowImagePickerVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowImagePickerVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_image_picker,parent,false)
    return RowImagePickerVH(view)
  }

  override fun onBindViewHolder(holder: RowImagePickerVH, position: Int) {
    val imagePickerRowModel = ImagePickerRowModel()
    // TODO uncomment following line after integration with data source
    // val imagePickerRowModel = list[position]
    holder.binding.imagePickerRowModel = imagePickerRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ImagePickerRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ImagePickerRowModel
    ) {
    }
  }

  inner class RowImagePickerVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowImagePickerBinding = RowImagePickerBinding.bind(itemView)
  }
}
