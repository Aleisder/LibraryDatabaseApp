package com.example.librarydatabaseapp.ui.booklist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.librarydatabaseapp.R
import com.example.librarydatabaseapp.databinding.FragmentBooklistBinding

class BookListFragment : Fragment() {

    private var _binding: FragmentBooklistBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBooklistBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            fabAddBook.setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.action_bookListFragment_to_addBookFragment)
            }

        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}