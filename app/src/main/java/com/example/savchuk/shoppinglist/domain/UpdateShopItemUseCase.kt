package com.example.savchuk.shoppinglist.domain

class UpdateShopItemUseCase(private val repository: Repository) {

    fun updateShopItem(shopItem: ShopItem){
       repository.updateShopItem(shopItem)
    }
}