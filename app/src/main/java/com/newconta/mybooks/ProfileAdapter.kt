package com.newconta.mybooks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProfileAdapter (var profilelist:List<Profile> ):
    RecyclerView.Adapter<ProfileViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.books_list, parent,false)
        return ProfileViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return  profilelist.size
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val contact = profilelist[position]
        holder.rvProfile.text = contact.profile
        holder.rvPerson.text = contact.person
        holder.rvTitle.text = contact.title
        holder.rvYear.text = contact.year
        holder.rvPreview.text =contact.preview
    }
}
class ProfileViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var rvProfile = itemView.findViewById<TextView>(R.id.rvProfile)
    var rvPerson = itemView.findViewById<TextView>(R.id.rvPerson)
    var rvTitle = itemView.findViewById<TextView>(R.id.rvTitle)
    var rvYear = itemView.findViewById<TextView>(R.id.rvYear)
    var rvPreview = itemView.findViewById<TextView>(R.id.rvPreview)




}