package com.example.savchuk.shoppinglist.domain

class GetShopItemUseCase(private val repository: Repository) {

    fun getShopItem(id: Int): ShopItem{
        return repository.getShopItem(id)
    }
}