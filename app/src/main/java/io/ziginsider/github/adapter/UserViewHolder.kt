package io.ziginsider.github.adapter

import androidx.recyclerview.widget.RecyclerView
import io.ziginsider.github.R
import io.ziginsider.github.databinding.UserItemBinding
import io.ziginsider.github.model.User

/**
 * RecyclerView ViewHolder for [User].
 */
class UserViewHolder(private val userItemBinding: UserItemBinding) :
    RecyclerView.ViewHolder(userItemBinding.root) {

    fun bind(user: User) {
        userItemBinding.apply {
            userName.text = user.name
            userAge.text = user.age.toString()
            userPhoto.setImageResource(getUserResId(user.age))
        }
    }

    private fun getUserResId(age: Int): Int {
        return when (age) {
            in 0..7 -> R.drawable.user12
            in 8..15 -> R.drawable.user9
            in 16..23 -> R.drawable.user11
            in 24..30 -> R.drawable.user3
            in 31..39 -> R.drawable.user7
            in 40..50 -> R.drawable.user8
            in 51..58 -> R.drawable.user4
            in 59..67 -> R.drawable.user1
            in 68..76 -> R.drawable.user6
            in 77..85 -> R.drawable.user2
            in 85..92 -> R.drawable.user10
            in 93..100 -> R.drawable.user5
            else -> R.drawable.user1
        }
    }
}
