package com.connect.view

data class Album(
    val name: String,
    val artist: String,
    val desc: String
) {
    companion object{
        fun albumList(): List<Album> {
            return listOf(
                Album("OXAGON", "@NEOMOXAGON",
                    "Products of the future need factories of the future.OXAGON's advanced clean industries fuse principal of Industry 4.0 and the circular economy"),
                Album("OXAGON", "@NEOMOXAGON",
                    "Products of the future need factories of the future.OXAGON's advanced clean industries fuse principal of Industry 4.0 and the circular economy"),

                Album("OXAGON", "@NEOMOXAGON",
                    "Products of the future need factories of the future.OXAGON's advanced clean industries fuse principal of Industry 4.0 and the circular economy"),

                Album("OXAGON", "@NEOMOXAGON",
                    "Products of the future need factories of the future.OXAGON's advanced clean industries fuse principal of Industry 4.0 and the circular economy"),

                Album("OXAGON", "@NEOMOXAGON",
                    "Products of the future need factories of the future.OXAGON's advanced clean industries fuse principal of Industry 4.0 and the circular economy"),

                Album("OXAGON", "@NEOMOXAGON",
                    "Products of the future need factories of the future.OXAGON's advanced clean industries fuse principal of Industry 4.0 and the circular economy"),

                Album("OXAGON", "@NEOMOXAGON",
                    "Products of the future need factories of the future.OXAGON's advanced clean industries fuse principal of Industry 4.0 and the circular economy"),

                Album("OXAGON", "@NEOMOXAGON",
                    "Products of the future need factories of the future.OXAGON's advanced clean industries fuse principal of Industry 4.0 and the circular economy"),

                Album("OXAGON", "@NEOMOXAGON",
                    "Products of the future need factories of the future.OXAGON's advanced clean industries fuse principal of Industry 4.0 and the circular economy"),

                Album("OXAGON", "@NEOMOXAGON",
                    "Products of the future need factories of the future.OXAGON's advanced clean industries fuse principal of Industry 4.0 and the circular economy"),

                Album("OXAGON", "@NEOMOXAGON",
                    "Products of the future need factories of the future.OXAGON's advanced clean industries fuse principal of Industry 4.0 and the circular economy"),

                )
        }
    }
}