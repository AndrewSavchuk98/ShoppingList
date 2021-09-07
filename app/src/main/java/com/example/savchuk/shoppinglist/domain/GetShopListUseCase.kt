package com.example.savchuk.shoppinglist.domain

class GetShopListUseCase(private val repository: Repository) {

    fun getShopItemList(): List<ShopItem>{
        return repository.getShopItemList()
    }
}