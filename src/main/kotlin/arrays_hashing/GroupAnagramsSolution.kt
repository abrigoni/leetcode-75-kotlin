package arrays_hashing

class GroupAnagramsSolution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val mapHashToString = mutableMapOf<String, List<String>>()

        for (i in strs.indices) {
            val s = strs[i]
            val hash = IntArray(26)

            for (c in s) {
                hash[c.code - 'a'.code]++
            }
            val key = hash.joinToString()
            mapHashToString[key] = mapHashToString.getOrDefault(key, listOf()) + s
        }

        return mapHashToString.values.toList();
    }
}