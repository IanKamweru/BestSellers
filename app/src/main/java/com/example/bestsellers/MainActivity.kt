package com.example.bestsellers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bestsellers.R.id
import com.example.bestsellers.BestSellerBooksFragment

/**
 * The MainActivity for the BestSellerList app.
 * Launches a [BestSellerBooksFragment].
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val supportFragmentManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(id.content, BestSellerBooksFragment(), null).commit()
    }
}