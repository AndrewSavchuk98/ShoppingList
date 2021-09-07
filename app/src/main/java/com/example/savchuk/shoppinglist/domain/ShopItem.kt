package com.example.savchuk.shoppinglist.domain

data class ShopItem(
    val id: Int,
    var name: String,
    var count: Int,
    var isActive: Boolean
)