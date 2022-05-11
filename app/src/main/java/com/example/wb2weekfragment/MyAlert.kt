package com.example.wb2weekfragment


import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.wb2weekfragment.R

class MyAlert : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val listener = DialogInterface.OnClickListener {_ ,_  ->
            Toast.makeText(requireContext(), "ATTENTION", Toast.LENGTH_SHORT).show()
            Log.e("MyAlert onCreateDialog","запущен")
        }

        val alertDialog=AlertDialog.Builder(requireContext())
            .setCancelable(true)
            .setIcon(R.mipmap.ic_launcher_round)
            .setTitle("Title")
            .setMessage("Default message")
            .setPositiveButton("Yes", listener)
            .setNegativeButton("Cancel", {_,_->
                Log.e("MyAlert onCreateDialog","Canceled")
            })
            .setNeutralButton("Neutral", listener)
            .create()
        alertDialog.getWindow()?.setGravity(Gravity.BOTTOM)

        return alertDialog

    }
}