package com.newconta.mybooks

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.newconta.mybooks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        displayBooks()

    }

    fun displayBooks(){
        val  book1 = Profile("","Trevor","Born a Crime","2/20/2003","revor Noah was born in 1984 during apartheid in South Africa to a black mother and white father, an illegal interracial relationship at the time.","" )
        val  book2 = Profile("","Mary","Born a Crime","2/20/2003","revor Noah was born in 1984 during apartheid in South Africa to a black mother and white father, an illegal interracial relationship at the time.","" )
        val  book3 = Profile("","Nancy","Born a Crime","2/20/2003","revor Noah was born in 1984 during apartheid in South Africa to a black mother and white father, an illegal interracial relationship at the time.","" )
        val  book4 = Profile("","Resian","Born a Crime","2/20/2003","revor Noah was born in 1984 during apartheid in South Africa to a black mother and white father, an illegal interracial relationship at the time.","" )
        val myProfile = listOf(book1,book2,book3,book4)

        val profileAdapter = ProfileAdapter(myProfile)
        binding.rvProfile.adapter = profileAdapter

    }
}