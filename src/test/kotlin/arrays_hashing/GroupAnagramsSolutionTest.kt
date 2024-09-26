package arrays_hashing

import kotlin.test.Test
import kotlin.test.assertContentEquals

class GroupAnagramsSolutionTest {
    @Test
    fun testGroupAnagramsWithMultipleStrings() {
        val solution = GroupAnagramsSolution()
        val input = arrayOf("eat","tea","tan","ate","nat","bat")
        val output = listOf(
            listOf("eat","tea","ate"),
            listOf("tan","nat"),
            listOf("bat"),
        )
        val res = solution.groupAnagrams(input)
        assertContentEquals(res, output)
    }

    @Test
    fun testGroupAnagramsWithEmptyArray() {
        val solution = GroupAnagramsSolution()
        val input = emptyArray<String>()
        val output = emptyList<List<String>>()
        val res = solution.groupAnagrams(input)
        assertContentEquals(res, output)
    }

    @Test
    fun testGroupAnagramsWithOneString() {
        val solution = GroupAnagramsSolution()
        val input = arrayOf("a")
        val output = listOf(listOf("a"))
        val res = solution.groupAnagrams(input)
        assertContentEquals(res, output)
    }
}