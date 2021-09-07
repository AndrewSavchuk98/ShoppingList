package com.example.savchuk.shoppinglist.domain

class AddShopItemUseCase(private val repository: Repository) {

    fun addShopItem(shopItem: ShopItem){
        repository.addShopItem(shopItem)
    }
}