package com.mariana.adv160420017uts.model

import androidx.room.*

@Dao
interface DonationDao {
    @Insert(onConflict =  OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg donation:Donation)

    @Query("SELECT * FROM donation")
    fun selectAllDonation(): List<Donation>

    @Query("SELECT * FROM donation WHERE id= :id")
    fun selectDonation(id:Int): Donation

    @Delete
    fun deleteDonation(donation: Donation)
}

interface MyDonationDao {
    @Insert(onConflict =  OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg myDonation: MyDonation)

    @Query("SELECT * FROM myDonation")
    fun selectAllMyDonation(): List<MyDonation>

    @Query("SELECT * FROM myDonation WHERE id= :id")
    fun selectMyDonation(id:Int): MyDonation

    @Delete
    fun deleteMyDonation(myDonation: MyDonation)
}