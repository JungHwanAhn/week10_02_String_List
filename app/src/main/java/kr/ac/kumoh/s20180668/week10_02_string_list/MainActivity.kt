package kr.ac.kumoh.s20180668.week10_02_string_list

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kr.ac.kumoh.s20180668.week10_02_string_list.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var view: ActivityMainBinding

    private val songs = arrayOf(
        "박하사탕", "흰수염고래", "노땡큐", "Home", "북두칠성",
        "박하사탕", "흰수염고래", "노땡큐", "Home", "북두칠성",
        "박하사탕", "흰수염고래", "노땡큐", "Home", "북두칠성",
        "박하사탕", "흰수염고래", "노땡큐", "Home", "북두칠성",
        "박하사탕", "흰수염고래", "노땡큐", "Home", "북두칠성",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = ActivityMainBinding.inflate(layoutInflater)
        setContentView(view.root)

        view.list.adapter = ArrayAdapter<String>(this,
        android.R.layout.simple_list_item_1,songs)

        view.list.setOnItemClickListener { _, _, i, _ ->
            val uri = Uri.parse("http://youtube.com/results?search_query=노래방+" + songs[i])
            val youtube = Intent(Intent.ACTION_VIEW, uri)
            startActivity(youtube)
        }
    }
}