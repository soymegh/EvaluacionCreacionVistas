package ni.edu.uca.salario

class Empleado {
    private var salario: Double = 0.00

    fun getSalario(): Double{
        return this.salario
    }

    fun setSalario(salario: Double){
        this.salario = salario
    }
}