package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//1)- recycler view
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        var menuList: ArrayList<ItemData> = ArrayList()

        var item1 = ItemData(R.drawable.samosa, "Samosa", "Spiced, fried pastry pockets");
        var item2 = ItemData(R.drawable.cookies, "Cookies", "Crispy, chewy, sweet treats");
        var item4 = ItemData(R.drawable.kebab, "Kebab", "Grilled, seasoned meat skewers");
        var item5 = ItemData(R.drawable.momos, "Momos", "Steamed, fried pastry pockets");
        var item6 = ItemData(R.drawable.pancake, "Pan Cake", "Fluffy, golden breakfast classic");
        var item7 = ItemData(R.drawable.ramen, "Ramen", "Savory Japanese noodle bowl");
        var item8 = ItemData(R.drawable.cupcake, "Cup Cake", "Tiny frosted sweet delight");
        var item9 = ItemData(R.drawable.sandwich, "Sandwich", "Layers of tasty filling");
        var item10 = ItemData(R.drawable.sushi, "Sushi", "Fresh, bite-sized rice rolls");
        var item11 = ItemData(R.drawable.yogut, "Yogurt", "Creamy, probiotic-rich dairy delight");
        menuList.add(item1)
        menuList.add(item2)
        menuList.add(item4)
        menuList.add(item5)
        menuList.add(item6)
        menuList.add(item7)
        menuList.add(item8)
        menuList.add(item9)
        menuList.add(item10)
        menuList.add(item11)
        val adaptor = MyAdapter(menuList)
        recyclerView.adapter = adaptor
    }
}

