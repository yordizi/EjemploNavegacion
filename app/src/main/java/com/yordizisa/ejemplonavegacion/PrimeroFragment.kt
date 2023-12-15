package com.yordizisa.ejemplonavegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class PrimeroFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Manejador de clics para el primer botón
        // Inflate the layout for this fragment
       val view = inflater.inflate(R.layout.fragment_primero, container, false)

        view.findViewById<Button>(R.id.btnF2).setOnClickListener {
            // Navegar a través de la acción definida en nav_graph.xml
            findNavController().navigate(R.id.action_primeroFragment_to_segundoFragment2)
        }
        view.findViewById<Button>(R.id.btnF3).setOnClickListener {
            // Navegar a través de la acción definida en nav_graph.xml
            findNavController().navigate(R.id.action_primeroFragment_to_tercerofragment2)
        }
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PrimeroFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}