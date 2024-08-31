package com.example.androidcook

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidcook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Инициализация ViewBinding и установка корневого макета
        setContentView(binding.root)

        // Установка WindowInsetsListener на корневой макет для обработки системных инсетсов
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { view, insets ->
            val systemBarsInsets = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBarsInsets.left, systemBarsInsets.top, systemBarsInsets.right, systemBarsInsets.bottom)
            insets
        }
    }
}
