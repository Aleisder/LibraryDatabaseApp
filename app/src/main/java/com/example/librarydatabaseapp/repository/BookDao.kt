package com.example.librarydatabaseapp.repository

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.librarydatabaseapp.model.Book
import kotlinx.coroutines.flow.Flow

@Dao
interface BookDao {

    @Query("SELECT name, authors, publish_house FROM Book")
    fun getAllBooks(): Flow<List<Book>>

    @Query("SELECT * FROM Book WHERE inventory_number = :number")
    fun getSpecificBook(number: Int): Book

    @Insert
    suspend fun addBook(book: Book)

    @Update(entity = Book::class)
    suspend fun updateBookInfo(book: Book)

}