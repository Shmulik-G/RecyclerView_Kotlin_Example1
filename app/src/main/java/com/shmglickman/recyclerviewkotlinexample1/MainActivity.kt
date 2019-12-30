package com.shmglickman.recyclerviewkotlinexample1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getting recyclerview from xml
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        //crating an arraylist to store users using the data class user
        val users = ArrayList<User>()

        //adding some dummy data to the list
        users.add(User("Yosi Bakshi", "Azamir 1"))
        users.add(User("Yona Bakshi", "Azamir 2"))
        users.add(User("Dana Bakshi", "Azamir 3"))
        users.add(User("Gal Bakshi", "Azamir 4"))
        users.add(User("Rubi Bakshi", "Azamir 5"))
        users.add(User("Gadi Bakshi", "Azamir 6"))
        users.add(User("Alona Bakshi", "Azamir 7"))
        users.add(User("Zaava Bakshi", "Azamir 8"))
        users.add(User("Eden Bakshi", "Azamir 9"))
        users.add(User("Tamar Bakshi", "Azamir 10"))
        users.add(User("Yuval Bakshi", "Azamir 11"))

        //creating our adapter
        val adapter = CustomAdapter(users)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter

    }
}
