package com.patrickchow.anywherefitness.customViews

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.*
import androidx.core.content.ContextCompat
import com.patrickchow.anywherefitness.R

class LoginViewCustom (context: Context, attrs: AttributeSet?): LinearLayout(context, attrs){

    init {
        //Have typedArray hold the data inside of attrs.xml with the declare-styleable name = LoginViewCustom
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.LoginViewCustom)

        val textSize = typedArray.getDimension(R.styleable.LoginViewCustom_textSize, 16f)
        val maxLines = typedArray.getInt(R.styleable.LoginViewCustom_maxLines, 1)
        val textWeight = typedArray.getFloat(R.styleable.LoginViewCustom_layout_weight, 8f)
        val editUserHint = typedArray.getString(R.styleable.LoginViewCustom_hint)
        val textColorHint = typedArray.getColor(R.styleable.LoginViewCustom_textColorHint, Color.RED)
        val textStyle = typedArray.getString(R.styleable.LoginViewCustom_textStyle)
        typedArray.recycle()

        //Create an imageView with a logo. It should be placed on top of the login.
        val logo = ImageView(context)
        logo.setImageResource(R.drawable.af_logo_v3)

        //Create an editTextView to take in the username
        val editViewUser = EditText(context)
        editViewUser.hint = "Username"
        editViewUser.textSize = textSize
        editViewUser.maxLines = maxLines

        //Create an editTextView to take in the password
        val editPassUser = EditText(context)
        editPassUser.hint = "Password"
        editPassUser.textSize = textSize
        editPassUser.maxLines = maxLines

        orientation = VERTICAL
        addView(logo)
        addView(editViewUser)
        addView(editPassUser)

    }
}