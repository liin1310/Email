// MainActivity.kt
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Danh sách email mẫu
        val emailList = listOf(
            Email("Alice", "Meeting Update", "9:30 AM", 'A'),
            Email("Bob", "New Assignment", "10:30 AM", 'B'),
            Email("Charlie", "Happy Birthday!", "Yesterday", 'C'),
            Email("David", "Project Report", "Oct 21", 'D'),
            Email("Eve", "Invitation", "Oct 20", 'E')
        )

        // Thiết lập RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmailAdapter(emailList)
    }
}
