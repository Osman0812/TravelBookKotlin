package com.example.travelbookkotlin.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.travelbookkotlin.Place

@Database(entities = [Place::class], version = 1)
abstract class PlaceDatabase : RoomDatabase(){
    abstract fun placeDao(): PlaceDao
}