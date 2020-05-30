package com.complete.sensor

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_addinguser.*
import kotlinx.android.synthetic.main.activity_addinguser.view.*
import kotlinx.android.synthetic.main.activity_addinguser.view.editText3
import kotlinx.android.synthetic.main.activity_confirm.view.*
import kotlinx.android.synthetic.main.activity_confirmremv.view.*
import kotlinx.android.synthetic.main.activity_customverification.view.*
import kotlinx.android.synthetic.main.activity_done.view.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_maxusers.view.*
import kotlinx.android.synthetic.main.activity_scan.view.*
import kotlinx.android.synthetic.main.activity_surety.view.*
import kotlinx.android.synthetic.main.activity_unregister_user.*
import kotlinx.android.synthetic.main.activity_unregister_user.view.*
import kotlinx.android.synthetic.main.activity_unregister_user.view.button10
import kotlinx.android.synthetic.main.activity_verificationfailed.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val mDialogView =
                LayoutInflater.from(this).inflate(R.layout.activity_customverification, null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
            val mAlertDialog = mBuilder.show()
            mDialogView.textView3.setOnClickListener {
                mAlertDialog.dismiss()
            }
        }
        button2.setOnClickListener {
            val mDialogView =
                LayoutInflater.from(this).inflate(R.layout.activity_verificationfailed, null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
            val mAlertDialog = mBuilder.show()
            mDialogView.textView14.setOnClickListener {
                mAlertDialog.dismiss()
            }
            mDialogView.textView15.setOnClickListener {
                Toast.makeText(this, R.string.option_two, Toast.LENGTH_SHORT).show()
                mAlertDialog.dismiss()
            }
        }
        button3.setOnClickListener {
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_scan, null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
            val mAlertDialog = mBuilder.show()
            mDialogView.textView21.setOnClickListener {
                mAlertDialog.dismiss()
            }
        }
        button4.setOnClickListener {
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_surety, null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
            val mAlertDialog = mBuilder.show()
            mDialogView.textView16.setOnClickListener {
                mAlertDialog.dismiss()
            }
            mDialogView.textView17.setOnClickListener {
                Toast.makeText(this, R.string.option_four, Toast.LENGTH_SHORT).show()
                mAlertDialog.dismiss()
            }

        }
        button5.setOnClickListener {
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_maxusers, null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
            val mAlertDialog = mBuilder.show()

            mDialogView.textView46.setOnClickListener {

                Toast.makeText(this, R.string.text17, Toast.LENGTH_SHORT).show()
                mAlertDialog.dismiss()
            }
            mDialogView.textView47.setOnClickListener {

                Toast.makeText(this, R.string.text18, Toast.LENGTH_SHORT).show()
                mAlertDialog.dismiss()
            }

            button6.setOnClickListener {
                val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_done, null)
                val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
                val mAlertDialog = mBuilder.show()
                mDialogView.textView23.setOnClickListener {
                    mAlertDialog.dismiss()
                }
            }
            button7.setOnClickListener {
                val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_confirm, null)
                val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
                val mAlertDialog = mBuilder.show()
                mDialogView.textView28.setOnClickListener {
                    mAlertDialog.dismiss()
                }
                mDialogView.textView29.setOnClickListener {
                    Toast.makeText(this, R.string.btn_six, Toast.LENGTH_SHORT).show()
                    mAlertDialog.dismiss()
                }
            }
            button8.setOnClickListener {
                val mDialogView =
                    LayoutInflater.from(this).inflate(R.layout.activity_confirmremv, null)
                val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
                val mAlertDialog = mBuilder.show()
                mDialogView.textView33.setOnClickListener {
                    mAlertDialog.dismiss()
                }
                mDialogView.textView34.setOnClickListener {
                    Toast.makeText(this, R.string.btn_six, Toast.LENGTH_SHORT).show()
                    mAlertDialog.dismiss()
                }

            }
            button9.setOnClickListener {
                val mDialogView =
                    LayoutInflater.from(this).inflate(R.layout.activity_unregister_user, null)
                val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
                val mAlertDialog = mBuilder.show()

                mDialogView.button10.setOnClickListener {
                    Toast.makeText(this, R.string.btn_six, Toast.LENGTH_SHORT).show()
                    mAlertDialog.dismiss()
                }

            }
            button11.setOnClickListener {
                val mDialogView =
                    LayoutInflater.from(this).inflate(R.layout.activity_addinguser, null)
                val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
                val mAlertDialog = mBuilder.show()

                mDialogView.button12.setOnClickListener {

                    Toast.makeText(this, R.string.btn_six, Toast.LENGTH_SHORT).show()
                    mAlertDialog.dismiss()
                }


            }
            button13.setOnClickListener {
                val intent=Intent(this,hubactivity::class.java)
                startActivity(intent)
            }
        }
    }
}





