// EmailAdapter.kt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emailList: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    inner class EmailViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val sender: TextView = view.findViewById(R.id.tvSender)
        val subject: TextView = view.findViewById(R.id.tvSubject)
        val time: TextView = view.findViewById(R.id.tvTime)
        val icon: TextView = view.findViewById(R.id.tvIcon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        holder.sender.text = email.sender
        holder.subject.text = email.subject
        holder.time.text = email.time
        holder.icon.text = email.icon.toString()
    }

    override fun getItemCount(): Int = emailList.size
}
