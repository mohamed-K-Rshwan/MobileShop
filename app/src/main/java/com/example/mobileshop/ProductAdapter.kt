package com.example.mobileshop

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(
    private val context: Context,
    private val items: List<Product>
) : RecyclerView.Adapter<ProductAdapter.VH>() {

    inner class VH(view: View) : RecyclerView.ViewHolder(view) {
        val img: ImageView = view.findViewById(R.id.img)
        val name: TextView = view.findViewById(R.id.name)
        val desc: TextView = view.findViewById(R.id.desc)
        val price: TextView = view.findViewById(R.id.price)
        val rate: RatingBar = view.findViewById(R.id.rate)
        val btnLocation: ImageButton = view.findViewById(R.id.btnLocation)
        val btnCart: Button = view.findViewById(R.id.btnCart)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_product_card, parent, false)
        return VH(v)
    }

    override fun onBindViewHolder(h: VH, position: Int) {
        val p = items[position]
        h.img.setImageResource(p.imageResId)
        h.name.text = p.name
        h.desc.text = p.desc
        h.price.text = "$ ${"%.2f".format(p.price)}"
        h.rate.rating = p.rate

        // الموقع → خرائط (شرط بالمشروح)
        h.btnLocation.setOnClickListener {
            val uri = Uri.parse("geo:0,0?q=${Uri.encode(p.location)}")
            val mapIntent = Intent(Intent.ACTION_VIEW, uri).apply {
                setPackage("com.google.android.apps.maps")
            }
            try {
                context.startActivity(mapIntent)
            } catch (_: Exception) {
                context.startActivity(Intent(Intent.ACTION_VIEW, uri))
            }
        }

        // فتح تفاصيل المنتج
        h.itemView.setOnClickListener {
            context.startActivity(Intent(context, ProductDetailsActivity::class.java))
        }

        // زر السلة: بدون سلوك مؤقت الآن (نضيفه بعد الربط)
        h.btnCart.setOnClickListener {
            // لاحقًا: إضافة للسلة بعد الربط
        }
    }

    override fun getItemCount() = items.size
}
