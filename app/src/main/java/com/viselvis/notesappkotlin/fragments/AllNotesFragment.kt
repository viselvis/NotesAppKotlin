package com.viselvis.notesappkotlin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.viselvis.notesappkotlin.R
import com.viselvis.notesappkotlin.adapters.NoteListAdapter
import com.viselvis.notesappkotlin.databinding.FragmentAllNotesBinding

class AllNotesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentAllNotesBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_all_notes, container, false)

        binding.btnAddNote.setOnClickListener {
            binding.root.findNavController().navigate(R.id.action_allNotesFragment_to_addNoteFragment)
        }

        val adapter = NoteListAdapter()
        binding.rvNotes.adapter = adapter
        binding.rvNotes.layoutManager = LinearLayoutManager(activity)

        return binding.root
    }

    companion object {

    }
}