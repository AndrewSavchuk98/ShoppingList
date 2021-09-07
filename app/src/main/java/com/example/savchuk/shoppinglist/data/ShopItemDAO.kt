package com.example.savchuk.shoppinglist.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.example.savchuk.shoppinglist.domain.ShopItem

@Dao
interface ShopItemDAO {

    @Insert(onConflict = REPLACE)
    fun addShopItem(shopItem: ShopItem)

    @Update
    fun updateShopItem(shopItem: ShopItem)

    @Delete
    fun deleteShopItem(shopItem: ShopItem)

    @Query("SELECT * FROM shopitem")
    fun getShopItemList(): LiveData<List<ShopItem>>

    @Query("SELECT * FROM shopitem WHERE id =:id")
    fun getShopItem(id: Int): LiveData<ShopItem>
}