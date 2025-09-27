package com.example.mobileshop

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PurchasedAdapter(
    private val items: List<Purchase>
) : RecyclerView.Adapter<PurchasedAdapter.VH>() {

    inner class VH(view: View) : RecyclerView.ViewHolder(view) {
        val img: ImageView = view.findViewById(R.id.img)
        val name: TextView = view.findViewById(R.id.name)
        val priceQty: TextView = view.findViewById(R.id.priceQty)
        val date: TextView = view.findViewById(R.id.date)
        val total: TextView = view.findViewById(R.id.total)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_purchased_card, parent, false)
        return VH(v)
    }

    override fun onBindViewHolder(h: VH, position: Int) {
        val p = items[position]
        h.img.setImageResource(p.imageResId)
        h.name.text = p.name
        h.priceQty.text = "$ ${"%.2f".format(p.price)}  •  x${p.quantity}"
        h.date.text = p.date
        h.total.text = "Total: $ ${"%.2f".format(p.total)}"
    }

    override fun getItemCount() = items.size
}
