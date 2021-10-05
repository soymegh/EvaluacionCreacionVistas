package ni.edu.uca.triangulos.clases

import android.widget.ImageView
import ni.edu.uca.triangulos.R

class Triangulos {
    fun numRandom(): Int {
        return (1..3).random()
    }

    fun triSeleccion(numRandom: Int, img: ImageView): Int{
        when(numRandom) {
            1 -> img.setImageResource(R.drawable.triangulo_equilatero)
            2 -> img.setImageResource(R.drawable.triangulo_escaleno)
            else -> img.setImageResource(R.drawable.isoseles)
        }

        return numRandom
    }
}