package com.devbenadate.calculatorapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var etEnternumber:TextInputLayout
    lateinit var etEntersecondnumber:TextInputLayout
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnModulus:Button
    lateinit var btnDivide:Button
    lateinit var tvOutput:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etEnternumber =findViewById(R.id.etEnternumber)
        etEntersecondnumber = findViewById(R.id.etEntersecondnumber)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnModulus=findViewById(R.id.btnModulus)
        btnDivide=findViewById(R.id.btnDivide)
        tvOutput=findViewById(R.id.tvOutput)

        btnAdd.setOnClickListener {
            tvOutput . text = ""
            var number=etEnternumber.editText.toString() .toInt()
            var numb =etEntersecondnumber.editText.toString() .toInt()
            getResult(number,numb)
        }

        btnSubtract.setOnClickListener {
            var number=etEnternumber.editText.toString() .toInt()
            var numb=etEntersecondnumber.editText.toString() .toInt()
            getResult2(number,numb)
        }
        btnModulus.setOnClickListener {
            var number=etEnternumber.editText.toString() .toInt()
            var numb=etEntersecondnumber.editText.toString() .toInt()
            getResult3(number,numb)
        }
        btnDivide.setOnClickListener {
            var number=etEnternumber.editText.toString() .toInt()
            var numb=etEntersecondnumber.editText.toString() .toInt()
            getResult4(number,numb)
        }


}

fun getResult(number:Int,numb:Int){
    var result=number+numb
    tvOutput.text = result.toString()

}
fun getResult2(number: Int,numb: Int){
    var result =number/numb
    tvOutput.text = result.toString()
}
fun getResult3(number: Int,numb: Int){
    var result =number%numb
    tvOutput.text = result.toString()
}
fun getResult4(number: Int,numb: Int){
    var result =number-numb
    tvOutput.text = result.toString()
}

}

