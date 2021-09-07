package com.example.savchuk.shoppinglist.domain

interface Repository {

    fun addShopItem(shopItem: ShopItem)

    fun updateShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun getShopItemList(): List<ShopItem>

    fun getShopItem(id: Int): ShopItem
}