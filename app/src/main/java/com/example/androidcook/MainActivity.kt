package com.example.androidcook

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidcook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Включаем edge-to-edge режим, если требуется
        enableEdgeToEdge()

        // Инициализация ViewBinding и установка корневого макета
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Установка WindowInsetsListener на корневой макет для обработки системных инсетсов
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { view, insets ->
            val systemBarsInsets = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBarsInsets.left, systemBarsInsets.top, systemBarsInsets.right, systemBarsInsets.bottom)
            insets
        }

        // Здесь вы можете добавить любую дополнительную настройку UI через binding
    }
}
