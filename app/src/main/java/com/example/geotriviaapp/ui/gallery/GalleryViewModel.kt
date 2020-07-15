package com.example.geotriviaapp.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "¿Qué es Lorem Ipsum?"
    }
    val text: LiveData<String> = _text
}