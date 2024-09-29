package com.example.eighth

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.eighth.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding : ActivityMainBinding

    private lateinit var login : String
    private lateinit var password : String

    override fun onCreate(savedInstanceState: Bundle?) {
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(mainBinding.root)

        mainBinding.loginBtn.setOnClickListener{
            login = mainBinding.usernameInput.text.toString()
            password = mainBinding.passwordInput.text.toString()

            mainBinding.usernameInput.text.clear()
            mainBinding.passwordInput.text.clear()
            Log.d("Huy" , "Login : $login , jopa : $password")
        }
        mainBinding.inst.setOnClickListener{
            var url : String = "https://www.instagram.com/noxemillion/?hl=ru"
            var intent = Intent(Intent.ACTION_VIEW)

            intent.setData(Uri.parse(url))

            if(intent.resolveActivity(getPackageManager()) != null){
                startActivity(intent)
            }
        }
    }
}