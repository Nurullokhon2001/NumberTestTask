package com.example.numbertesttask.numbers.presentation

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.numbertesttask.R
import com.example.numbertesttask.details.presentation.DetailsFragment
import com.example.numbertesttask.main.ShowFragment

class NumbersFragment : Fragment() {

    private var show: ShowFragment = ShowFragment.Base()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        show = context as ShowFragment
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_numbers, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.getFactButton).setOnClickListener {
            show.show(DetailsFragment.newInstance("Test"))
        }
    }

    override fun onDetach() {
        super.onDetach()
        show = ShowFragment.Base()
    }
}