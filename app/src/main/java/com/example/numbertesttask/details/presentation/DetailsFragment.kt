package com.example.numbertesttask.details.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.numbertesttask.R

class DetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val value = requireArguments().getString(KEY)
        view.findViewById<TextView>(R.id.detailsTextView).text = value
    }

    companion object {
        private const val KEY = "NUMBER_ID"

        fun newInstance(content: String) =
            DetailsFragment().apply {
                arguments = Bundle().apply {
                    putString(KEY, content)
                }
            }
    }
}