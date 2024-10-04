//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val listaNumeros= intArrayOf(34,52,32,44,54,200,22,23,44,94,61,45,424)
    //Ejercicio 1
    obtenerMaximo(listaNumeros)
    //Ejercicio 2
    obtenerSumatoria(listaNumeros)
    //Ejercicio 3
    val kms=obtenerKms(5f)
    println(kms)
    //Ejercicio 4
    var esPalindromo=determinaPalindromos("galleta")
    println(esPalindromo)
    //Ejercicio 5
    var numLetras=cuentaLetras("El gato se subio al tejado y se cayo", ' ')
    println(numLetras)
    //Ejercicio 6

    //Ejercicio 7
    var letra=poneMayusculaPrimeraLetra("Hola, lo primero de todo como estan los maquinas?")
    println(letra)
    }

//Ejercicio 1. Crea una función que obtenga el número máximo de una lista de
//números
fun obtenerMaximo(a: IntArray){
    //print(a.max())
    var max=0
    for(i in a.indices){
        //println("i es $i")
        //println("a.get(i) es ${a.get(i)}")
        if(a.get(i)>max)
        {
            //println(a.get(i))
            max=a.get(i)
        }
    }
    println("El maximo es $max")
}

//Ejercicio 2. Crea una función que obtenga la sumatoria de una lista de números
fun obtenerSumatoria(a: IntArray){
    //a.sum()
    var suma=0
    for(i in a.indices){
        suma+=a.get(i)
    }
    println("La suma es $suma")
}
//Ejercicio 3. Crea una función que dada una distancia en millas calcule su
//correspondiente en kms
fun obtenerKms(a: Float) :Float{
    return (a *1.609344f)
}
//Ejercicio 4. Crea una función que determine si una cadena de texto es un
//palíndromo.
fun determinaPalindromos(a: String):Boolean{
    if (a.equals(a.reversed()))return true
    else return false
}
//Ejercicio 5. Crea una función que cuenta cuántas veces aparece una letra en un
//texto.
fun cuentaLetras(a:String, b: Char):Int{
    var contador=0
    for (i in a.indices){
        if (a.get(i)==b){
            contador++
        }
    }
    return contador
}
//Ejercicio 6. Crea una función que cuenta cuántas veces aparece una subcadena en
//un texto.
fun cuentaCadenas(a: String, b: String):Int{
    var contador=0
    // holaholhoa -> ho ->3 !!ESTE NO ESTA HECHO!!
    return contador
}
//Ejercicio 7. Crea una función que pone en mayúscula la primera letra de cada
//palabra de un texto
fun poneMayusculaPrimeraLetra(a: String) :String{
    var sol=""
    for (i in a.indices){
        if(i==0)
        {
            sol+=a.get(i).uppercase()
        }

        else if(a.get(i-1)==' '){
            sol+=a.get(i).uppercase()
        }
        else{
            sol+=a.get(i)
        }
    }
    return sol
}