package com.infotechworld.bottomnavfragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav = findViewById(R.id.bottomNavigationView)

        setFragment(Home(), "Jayesh")

        bottomNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> {
                    Toast.makeText(this, "home", Toast.LENGTH_LONG).show()

                    setFragment(Home(), "Jayesh home")
                    true
                }

                R.id.whatsup -> {
                    Toast.makeText(this, "whatsapp", Toast.LENGTH_LONG).show()

                    setFragment(WhatsApp(), "Jayesh whatsapp")
                    true
                }

                R.id.sms -> {
                    Toast.makeText(this, "sms", Toast.LENGTH_LONG).show()

                    setFragment(Sms(), "Jayesh sms")
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

    /*override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home -> {
                Toast.makeText(this, "home", Toast.LENGTH_LONG).show()
                val bundle = Bundle().apply {
                    putString("Name", "Jayesh home")
                }

                val home = Home()
                home.arguments = bundle

                setFragment(home)
                return true
            }

            R.id.whatsup -> {
                Toast.makeText(this, "whatsapp", Toast.LENGTH_LONG).show()
                val bundle = Bundle().apply {
                    putString("Name", "Jayesh whatsapp")
                }

                val whatsApp = WhatsApp()
                whatsApp.arguments = bundle

                setFragment(whatsApp)
                return true
            }

            R.id.sms -> {
                Toast.makeText(this, "sms", Toast.LENGTH_LONG).show()
                val bundle = Bundle().apply {
                    putString("Name", "Jayesh sms")
                }

                val sms = Sms()
                sms.arguments = bundle

                setFragment(sms)
                return true
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }

        }
    }*/

    private fun setFragment(fragment: Fragment, argument: String) {
        val bundle = Bundle().apply {
            putString("Name", argument)
        }

        fragment.arguments = bundle

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout, fragment)
            commit()
        }
    }
}