package com.example.librarydatabaseapp.ui.addbook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.fragment.app.Fragment
import com.example.librarydatabaseapp.R
import com.example.librarydatabaseapp.databinding.FragmentAddBookBinding

class AddBookFragment : Fragment() {

    private var _binding: FragmentAddBookBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddBookBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setGenresAdapter(R.array.genres)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun setGenresAdapter(resource: Int) {
        val genres = resources.getStringArray(resource)
        val adapter = ArrayAdapter(requireContext(), R.layout.list_genre_item, genres)
        (binding.etGenre.editText as? AutoCompleteTextView)?.setAdapter(adapter)
    }

}