package com.example.navlab

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        logLifecycle("onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logLifecycle("onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        logLifecycle("onCreateView")
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        logLifecycle("onViewCreated")
        view.findViewById<View>(R.id.open_detail_button).setOnClickListener {
            findNavController().navigate(
                R.id.action_homeFragment_to_detailFragment,
                Bundle().apply { putInt("itemId", 5) }
            )
        }
    }

    override fun onStart() {
        super.onStart()
        logLifecycle("onStart")
    }

    override fun onResume() {
        super.onResume()
        logLifecycle("onResume")
    }

    override fun onPause() {
        logLifecycle("onPause")
        super.onPause()
    }

    override fun onStop() {
        logLifecycle("onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        logLifecycle("onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        logLifecycle("onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        logLifecycle("onDetach")
        super.onDetach()
    }

    private fun logLifecycle(callback: String) {
        Log.d(TAG, callback)
    }

    private companion object {
        const val TAG = "LC_Home"
    }
}
