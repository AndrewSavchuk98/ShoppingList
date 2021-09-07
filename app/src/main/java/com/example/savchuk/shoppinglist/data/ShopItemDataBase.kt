package com.example.savchuk.shoppinglist.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.savchuk.shoppinglist.domain.ShopItem

@Database(
    entities = [ShopItem::class],
    version = 0
)
abstract class ShopItemDataBase : RoomDatabase() {

    abstract fun getShopItemDAO(): ShopItemDAO
}