package com.example.burguerking

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import org.w3c.dom.Text

data class MenuItem(val id: Int, val name: String, val description: String, val price: Double)

@Composable
fun MenuScreen(menuItems: List<MenuItem>) {
    LazyColumn {
        items(menuItems) { menuItem ->
            MenuItemView(menuItem)
        }
    }
}

@Composable
fun MenuItemView(menuItem: MenuItem) {
    Text(text = "${menuItem.name}: ${menuItem.price}")
}


