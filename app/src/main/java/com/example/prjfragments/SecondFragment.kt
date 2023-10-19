package com.example.prjfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val layout = inflater.inflate(R.layout.fragment_second, container, false)
        val editText : EditText = layout.findViewById(R.id.txtInput)
        val button: Button = layout.findViewById(R.id.btnFrame2)
        val textview:TextView = layout.findViewById(R.id.lblOutput)

        button.setOnClickListener{
            textview.text = editText.text
        }
        return layout



        // Inflate the layout for this fragment
    }


}