fun calculaVector(primerValor: Int,numPosiciones: Int): List<Int> {
    var vector: MutableList<Int> = mutableListOf()
    vector.add(primerValor)
    var siguienteValor = primerValor
    for (i in 1 until numPosiciones) {
        siguienteValor = 2 * i + primerValor
        vector.add(siguienteValor)
    }
    return vector


}

fun generaMatriz(primerVector: List<Int>, segundoVector: List<Int>): List<List<Int>> {
    return listOf<List<Int>>(primerVector,segundoVector)
}

fun salidaTexto(matriz: List<List<Int>>): String {
    var salida: String = ""
    for (x in matriz) {
        for (y in x) {
            salida += if (x.last() == y) {
                "$y\n"
            } else {
                "$y - "
            }
        }
    }
    return salida
}



fun main() {
    print("Introduzca el número de posiciones para el primer vector: ")
    var posicionesV1 = readLine()?.toInt() ?: 5
    print("Introduzca el número de posiciones para el segundo vector: ")
    var posicionesV2 = readLine()?.toInt() ?: 4
    print("Introduzca el primer valor del vector 1: ")
    var primeraPosicion = readLine()?.toInt() ?: 5
    print("Introduzca el primer valor del vector 2: ")
    var segundaPosicion = readLine()?.toInt() ?: 4

    var matriz = generaMatriz(calculaVector(primeraPosicion,posicionesV1),calculaVector(segundaPosicion,posicionesV2))

    println(salidaTexto(matriz))





}