package com.example.savchuk.shoppinglist.domain

import androidx.lifecycle.LiveData

interface Repository {

    fun addShopItem(shopItem: ShopItem)

    fun updateShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun getShopItemList(): LiveData<List<ShopItem>>

    fun getShopItem(id: Int): LiveData<ShopItem>
}