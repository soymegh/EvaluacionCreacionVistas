package ni.edu.uca.triangulos

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import ni.edu.uca.triangulos.clases.Triangulos

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val img: ImageView = findViewById(R.id.imgTriangulos)
        val triangulo = Triangulos()
        val btnInicio: Button = findViewById(R.id.btnIniciar)
        val btnEquilatero: Button = findViewById(R.id.btnEquilatero)
        val btnEscaleno: Button = findViewById(R.id.btnEscaleno)
        val btnIsoseles: Button = findViewById(R.id.btnIsosceles)
        var equilatero: Int = 1
        var escaleno: Int = 2
        var isoseles: Int = 3

        btnInicio.setOnClickListener(View.OnClickListener {
            triangulo.triSeleccion(triangulo.numRandom(), img)
        })

        btnEquilatero.setOnClickListener(View.OnClickListener {
            if(equilatero == triangulo.triSeleccion(triangulo.numRandom(), img)){
                Toast.makeText(this, "Correcto" ,Toast.LENGTH_SHORT).show()
                triangulo.triSeleccion(triangulo.numRandom(), img)
            }else{
                Toast.makeText(this, "Incorrecto" ,Toast.LENGTH_SHORT).show()
                triangulo.triSeleccion(triangulo.numRandom(), img)
            }
        })

        btnEscaleno.setOnClickListener(View.OnClickListener {
            if(escaleno == triangulo.triSeleccion(triangulo.numRandom(), img)){
                Toast.makeText(this, "Correcto" ,Toast.LENGTH_SHORT).show()
                triangulo.triSeleccion(triangulo.numRandom(), img)
            }else{
                Toast.makeText(this, "Incorrecto" ,Toast.LENGTH_SHORT).show()
                triangulo.triSeleccion(triangulo.numRandom(), img)
            }
        })

        btnIsoseles.setOnClickListener(View.OnClickListener {
            if(isoseles == triangulo.triSeleccion(triangulo.numRandom(), img)){
                Toast.makeText(this, "Correcto" ,Toast.LENGTH_SHORT).show()
                triangulo.triSeleccion(triangulo.numRandom(), img)
            }else {
                Toast.makeText(this, "Incorrecto" ,Toast.LENGTH_SHORT).show()
                triangulo.triSeleccion(triangulo.numRandom(), img)
            }
        })
    }
}


