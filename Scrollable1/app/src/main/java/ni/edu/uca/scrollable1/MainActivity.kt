package ni.edu.uca.scrollable1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import ni.edu.uca.scrollable1.adapter.ItemAdapter
import ni.edu.uca.scrollable1.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataSet = Datasource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataSet)
        recyclerView.setHasFixedSize(true)
    }
}