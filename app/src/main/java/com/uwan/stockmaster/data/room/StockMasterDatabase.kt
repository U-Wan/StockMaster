package com.uwan.stockmaster.data.room


import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [CompanyListingEntity::class],
    version = 1
)
abstract class StockMasterDatabase: RoomDatabase() {
    abstract val dao: StockMasterDao
}