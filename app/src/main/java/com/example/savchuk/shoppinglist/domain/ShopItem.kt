package com.example.savchuk.shoppinglist.domain

import androidx.room.Entity

@Entity
data class ShopItem(
    val id: Int,
    var name: String,
    var count: Int,
    var isActive: Boolean
)