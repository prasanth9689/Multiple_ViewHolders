package com.skyblue.viewholder


class LandmarkModel {
    companion object {
        fun getLandmarks(): ArrayList<Landmark> = arrayListOf(
            Landmark("Steve jobs", "The Apple company in United states 1", null, HasImage.FALSE),
            Landmark("Steve jobs", "The Apple company in United states 2", null, HasImage.FALSE),
            Landmark("Steve jobs", "he Apple company in United states 3", null, HasImage.FALSE),
            Landmark(
                "Steve jobs", "he Apple company in United states 4", R.drawable.steve_job,
                HasImage.TRUE
            ),
            Landmark("Steve jobs", "he Apple company in United states 5", null, HasImage.FALSE),
            Landmark(
                "Steve jobs", "he Apple company in United states 6", R.drawable.steve_job,
                HasImage.TRUE
            ),
            Landmark("Steve jobs", "he Apple company in United states 7", null, HasImage.FALSE),
            Landmark("Steve jobs", "he Apple company in United states 8", null, HasImage.FALSE)
        )
    }
}