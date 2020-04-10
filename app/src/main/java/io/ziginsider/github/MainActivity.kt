package io.ziginsider.github

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.ziginsider.github.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(R.layout.activity_main)

        binding.listOfUsers.apply {
            
        }
    }
}
