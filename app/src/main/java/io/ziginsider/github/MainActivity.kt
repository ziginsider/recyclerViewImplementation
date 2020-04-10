package io.ziginsider.github

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import io.ziginsider.github.adapter.UserAdapter
import io.ziginsider.github.databinding.ActivityMainBinding
import io.ziginsider.github.stub.DataProvider

/**
 * Represents screen with list of [User]s.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val users = DataProvider().data
        val userAdapter = UserAdapter(users)

        binding.listOfUsers.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = userAdapter
        }
    }
}
