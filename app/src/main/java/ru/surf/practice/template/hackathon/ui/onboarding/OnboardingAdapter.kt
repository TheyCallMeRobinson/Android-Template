package ru.surf.practice.template.hackathon.ui.onboarding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.surf.practice.template.hackathon.R

data class OnboardingData(
    val id: String,
    val text: String
)

class OnboardingAdapter(
    private val onboardingPages: List<OnboardingData>
): RecyclerView.Adapter<OnboardingAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_onboarding_page, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindPage(onboardingPages[position])
    }

    override fun getItemCount(): Int = onboardingPages.size

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        private val onboardingText = itemView.findViewById<TextView>(R.id.text_onboarding)

        fun bindPage(page: OnboardingData){
            onboardingText.text = page.text
        }

    }
}