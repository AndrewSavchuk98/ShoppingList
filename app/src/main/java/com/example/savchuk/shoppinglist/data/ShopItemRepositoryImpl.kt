package com.example.savchuk.shoppinglist.data

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.example.savchuk.shoppinglist.domain.Repository
import com.example.savchuk.shoppinglist.domain.ShopItem
import java.lang.IllegalStateException

class ShopItemRepositoryImpl(context: Context) : Repository {

    private val database = Room.databaseBuilder(
        context.applicationContext,
        ShopItemDataBase::class.java,
        "ShopItem.db"
    ).build()

    override fun addShopItem(shopItem: ShopItem) = database.getShopItemDAO().addShopItem(shopItem)


    override fun updateShopItem(shopItem: ShopItem) {
        database.getShopItemDAO().updateShopItem(shopItem)
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        database.getShopItemDAO().updateShopItem(shopItem)
    }

    override fun getShopItemList(): LiveData<List<ShopItem>> =
        database.getShopItemDAO().getShopItemList()

    override fun getShopItem(id: Int): LiveData<ShopItem> =
        database.getShopItemDAO().getShopItem(id)

    companion object {
        private var INSTANCE: ShopItemRepositoryImpl? = null

        fun initialize(context: Context) {
            if (INSTANCE == null) {
                INSTANCE = ShopItemRepositoryImpl(context)
            }
        }

        fun get(): ShopItemRepositoryImpl {
            return INSTANCE
                ?: throw IllegalStateException("Repository must be initialized")
        }
    }
}