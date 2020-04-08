package io.ziginsider.github.stub

import io.ziginsider.github.model.User
import java.util.Random
import kotlin.collections.ArrayList

/**
 * Provides list of [User]s with random name and age.
 * Names start from 'A' to 'Z' with 10 users for each letter.
 */
class DataProvider {

    val data = ArrayList<User>()

    init {
        var index = 1
        for (i in 'A'..'Z') {
            for (j in 1..10) {
                data.add(
                    User(
                        index++,
                        i + getLowerPartName(),
                        getAge()
                    )
                )
            }
        }
    }

    private fun getLowerCaseAlphabet(): String {
        return CharArray(26) { (it + 97).toChar() }.joinToString("")
    }

    private fun getLowerPartName(): String {
        val lowerAlphabet = getLowerCaseAlphabet()
        val result = StringBuilder()
        val random = Random()

        while (result.length < NAME_LENGTH) {
            val index = (random.nextFloat() * lowerAlphabet.length).toInt()
            result.append(lowerAlphabet[index])
        }
        return result.toString()
    }

    private fun getAge(): Int = Random().nextInt(MAX_AGE) + 1

    private companion object {

        private const val NAME_LENGTH = 7
        private const val MAX_AGE = 100
    }
}
