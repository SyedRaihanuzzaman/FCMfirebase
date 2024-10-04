package com.example.yourname.fcmnotification

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.yourname.fcmnotification.databinding.ActivityMainBinding
import com.google.firebase.messaging.FirebaseMessaging

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    var dataString:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

//        if(intent!=null){
//            if(intent.hasExtra("key1"))
//            {
//                  for(key in intent.extras!!.keySet())
//                  {
//                        dataString = dataString + intent.extras!!.getString(key)+"\n"
//                      Log.d("mytag",key+intent.extras!!.getString(key))
//                  }
//
//                binding.textView2.text = dataString
//            }
//        }

        FirebaseMessaging.getInstance().token.addOnCompleteListener{

            if (it.isSuccessful){
                Log.d("my tag",it.result.toString())
            }
        }


    }
}