package com.example.roomwordsample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_table")
class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)

//alternate way of doing it
//@Entity(tableName = "word_table")
//class Word(
//    @PrimaryKey(autoGenerate = true) val id: Int,
//    @ColumnInfo(name = "word") val word: String
//
//)