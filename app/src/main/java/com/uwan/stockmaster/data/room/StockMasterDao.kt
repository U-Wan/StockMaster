package com.uwan.stockmaster.data.room


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface StockMasterDao {

    @Query("DELETE FROM companylistingentity")
    suspend fun clearCompanyListings()

    @Query("""SELECT *FROM companylistingentity
            WHERE LOWER(name) LIKE '%' || LOWER(:query) || '%' OR UPPER(:query) == symbol""")
    suspend fun searchCompanyListing(query: String): List<CompanyListingEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCompanyListings(
        companyListingEntities: List<CompanyListingEntity>
    )
}