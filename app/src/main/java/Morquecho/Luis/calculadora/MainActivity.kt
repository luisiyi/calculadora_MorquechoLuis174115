package Morquecho.Luis.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var num1: Int = 0
    var num2: Int = 0
    var numeros: String = ""
    var resultado: String = ""
    var signoAritmetico: String = ""
    var operacion: Int = 0
    var aux: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv_arriba = findViewById<TextView>(R.id.tv_arriba)
        val tv_abajo = findViewById<TextView>(R.id.tv_abajo)
        val btnCero = findViewById<Button>(R.id.btnCero)
        val btnUno = findViewById<Button>(R.id.btnUno)
        val btnDos = findViewById<Button>(R.id.btnDos)
        val btnTres = findViewById<Button>(R.id.btnTres)
        val btnCuatro = findViewById<Button>(R.id.btnCuatro)
        val btnCinco = findViewById<Button>(R.id.btnCinco)
        val btnSeis = findViewById<Button>(R.id.btnSeis)
        val btnSiete = findViewById<Button>(R.id.btnSiete)
        val btnOcho = findViewById<Button>(R.id.btnOcho)
        val btnNueve = findViewById<Button>(R.id.btnNueve)
        val btnMas = findViewById<Button>(R.id.btnMas)
        val btnMenos = findViewById<Button>(R.id.btnMenos)
        val btnMultiplicacion = findViewById<Button>(R.id.btnMultiplicacion)
        val btnDivision = findViewById<Button>(R.id.btnDivision)
        val btnResult = findViewById<Button>(R.id.btnResult)
        val btnBorrar = findViewById<Button>(R.id.btnBorrar)



        btnCero.setOnClickListener {
            numeros = numeros.toString() + "0"
            tv_abajo.setText(numeros)
            aux = numeros.toInt()
        }
        btnUno.setOnClickListener {
            numeros = numeros.toString() + "1"
            tv_abajo.setText(numeros)
            aux = numeros.toInt()
        }
        btnDos.setOnClickListener {
            numeros = numeros.toString() + "2"
            tv_abajo.setText(numeros)
            aux = numeros.toInt()
        }
        btnTres.setOnClickListener {
            numeros = numeros.toString() + "3"
            tv_abajo.setText(numeros)
            aux = numeros.toInt()
        }
        btnCuatro.setOnClickListener {
            numeros = numeros.toString() + "4"
            tv_abajo.setText(numeros)
            aux = numeros.toInt()
        }
        btnCinco.setOnClickListener {
            numeros = numeros.toString() + "5"
            tv_abajo.setText(numeros)
            aux = numeros.toInt()
        }
        btnSeis.setOnClickListener {
            numeros = numeros.toString() + "6"
            tv_abajo.setText(numeros)
            aux = numeros.toInt()
        }
        btnSiete.setOnClickListener {
            numeros = numeros.toString() + "7"
            tv_abajo.setText(numeros)
            aux = numeros.toInt()
        }
        btnOcho.setOnClickListener {
            numeros = numeros.toString() + "8"
            tv_abajo.setText(numeros)
            aux = numeros.toInt()
        }
        btnNueve.setOnClickListener {
            numeros = numeros.toString() + "9"
            tv_abajo.setText(numeros)
            aux = numeros.toInt()
        }
        btnMas.setOnClickListener {
            num1 = aux
            resultado = numeros.toString() + "+"
            tv_arriba.setText(resultado)
            tv_abajo .setText("")
            signoAritmetico = "+"
            numeros = ""
            aux = 0
        }
        btnMenos.setOnClickListener {
            num1 = aux
            resultado = numeros.toString() + "-"
            tv_arriba.setText(resultado)
            tv_abajo .setText("")
            signoAritmetico = "-"
            numeros = ""
            aux = 0
        }
        btnMultiplicacion.setOnClickListener {
            num1 = aux
            resultado = numeros.toString() + "*"
            tv_arriba.setText(resultado)
            tv_abajo .setText("")
            signoAritmetico = "*"
            numeros = ""
            aux = 0
        }
        btnDivision.setOnClickListener {
            num1 = aux
            resultado = numeros.toString() + "/"
            tv_arriba.setText(resultado)
            tv_abajo .setText("")
            signoAritmetico = "/"
            numeros = ""
            aux = 0
        }
        btnResult.setOnClickListener {
            if (signoAritmetico.equals("+")){
                num2 = aux
                operacion = num1 + num2
                tv_arriba.setText(operacion.toString())
                tv_abajo.setText("0")
            }
            if (signoAritmetico.equals("-")){
                num2 = aux
                operacion = num1 - num2
                tv_arriba.setText(operacion.toString())
                tv_abajo.setText("0")
            }
            if (signoAritmetico.equals("*")){
                num2 = aux
                operacion = num1 * num2
                tv_arriba.setText(operacion.toString())
                tv_abajo.setText("0")
            }
            if (signoAritmetico.equals("/")){
                num2 = aux
                operacion = num1 / num2
                tv_arriba.setText(operacion.toString())
                tv_abajo.setText("0")
            }
            numeros = ""
            resultado = ""
            signoAritmetico = ""
            num1 = 0
            num2 = 0
            aux = 0
            tv_abajo.setText("")
        }
        btnBorrar.setOnClickListener {
            numeros = ""
            resultado = ""
            signoAritmetico = ""
            num1 = 0
            num2 = 0
            aux = 0
            tv_arriba.setText("")
            tv_abajo.setText("")
        }


    }
}