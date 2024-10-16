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
    //Ejercicio 8
    println(sumaDigitos(100000001))
    //Ejercicio 9
    println("El maximo comun divisor es ${MaxComunDivisor(173,999)}")
    //Ejercicio 10
    fiboTermino(25)
    //Ejercicio 11
    //primoRelativo(503,163)
    //Ejercicio 12
    println(esCapicua(4424))
    //Ejercicio 14
    imprimeMosaico(20)
    //Ejercicio 15
    val iA1= intArrayOf(5,4,2,3,4,5,2,12,3,2)
    val iA2= intArrayOf(5,4,2,3,4,5,2,11,3,2)
    val booArr=booleanizadorDeArraysDeEnteros(iA1,iA2)
    for(i in 0.. booArr.size-1){
        println(booArr[i])
    }
    //Ejercicio 16
    val iA3= intArrayOf(5,5,5)
    var aoblongo=multiplicadorElementosArray(iA3)
    println(aoblongo)
    //Ejercicio 17
    var aoblonga=devuelvePares(iA2)
    for (i in 0..aoblonga.size-1){
        println(aoblonga[i])
    }
    //Ejercicio 18
    println(determinadorPrimo(5))
    //Ejercicio 19
    println(eleminaVocales("Esternocleidomastoideo"))
    //Ejercicio 20
    println(calculaFactorial(5))
    //Ejercicio 21
    println(revierteCadena("Hola"))
    //Ejercicio 22
    println(determinaNumerosPerfectos(495))
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
// Ejercicio 8. Crea una función que sume los dígitos de un número. Ejemplo:
//sumaDigitos(245) = 2 + 4 + 5 = 11
fun sumaDigitos(a: Int) {
    val b= a.toString()
    var res=0
    for (i in b.indices){
        res+= b[i].toString().toInt()
    }
    println("El resultado es $res")
}
//Ejercicio 9. Crea una función que calcule el máximo común divisor de dos números
//naturales
fun MaxComunDivisor(a: Int, b: Int): Int{
    var mcd=1
    var i=1
    while (i<=a && i<=b){
        if (a%i==0 && b%i==0){
            mcd=i
        }
        i++
    }
    return mcd
}
//Ejercicio 10. Crea una función que calcule el término n-ésimo de la sucesión de Finbonacci.
//En matemática, la sucesión de Fibonacci se trata de una serie infinita de números naturales que empieza con un 0 y un 1 y
//continúa añadiendo números que son la suma de los dos anteriores: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987,
//1597…
fun fiboTermino(n: Int){

    var a=0
    var b=1
    var c=0
    if (n<=0) println(a)
    else if (n==1) println(b)
    else {
        for (i in 1..n) {
            c = a + b
            println(c)
            a = b
            b = c
        }
    }
}
//Ejercicio 11. Crea una función que determine si dos números son primos relativos.
//Se dice que dos números son relativamente primos si su factor común más grande ( FCG ) es 1. Ejemplo 1: Los factores de 20 son 1, 2, 4, 5, 10
//y 20. Los factores de 33 son 1, 3, 11, y 33.
fun primoRelativo(a: Int, b: Int) {
    var primos=true
    for (i in 2..a) {
        if (a % i == 0 && b % i == 0) {
            println("$i ----- $a%$b")
            primos= false
            break
        }//REVISAR!
    }
}
//Ejercicio 12. Crea una función que determine si un número dado es capicúa
fun esCapicua(a: Int): Boolean{
    var b=""
    b=b+a
    return determinaPalindromos(b)
}
//Ejercicio 13. Crea una función que dada una cadena de texto con formato Emmet
//devuelva su correspondiente etiqueta HTML, teniendo en cuenta sólo los atributos
//de clase e id.


//Ejercicio 14. Crea una función que dado un número n imprima el siguiente ‘mosaico’
//(para n = 6):
fun imprimeMosaico(a: Int){
    for (i in 1..a){
       for (j in 1..i){
           print(i)
       }
        println()
    }
}
//Ejercicio 15. Crear una función que reciba dos arrays de enteros y devuelva un array de booleanos
//que determine si los elementos, uno a uno, de ambos arrays son iguales
fun booleanizadorDeArraysDeEnteros(a: IntArray, b:IntArray): BooleanArray{
    var c=a.size
    if(b.size>a.size) c=b.size
    var BooleanArray= BooleanArray(c)
    for (i in 0..a.size-1){
        if(a[i]==b[i]){
            BooleanArray[i]=true
        }else{
            BooleanArray[i]=false
        }
    }
    return BooleanArray
}
//Ejercicio 16: Crea una función que calcule el producto de todos los elementos en
//una lista de números.
fun multiplicadorElementosArray(a: IntArray): Int{
    var res=1
    for(i in 0..a.size-1){
        res=a[i]*res
    }
    return res
}
//Ejercicio 17: Crea una función que dada una lista de números, devuelva una nueva
//lista con solo los números pares.
fun devuelvePares(a:IntArray):IntArray{
    var cP=0
    var cont=0
    for(i in 0..a.size-1){
        if(a[i]%2==0){
            cP++
        }
    }
    var aux=IntArray(cP)
    for(i in 0..a.size-1){
        if(a[i]%2==0){
            aux[cont]=a[i]
            cont++
        }
    }
    return aux
}
//Ejercicio 18: Crea una función que determine si un número es primo.
fun determinadorPrimo(a:Int):Boolean{
    var res=true
    for (i in 2..a-1)
    {
        if(a%i==0){
            res=false
        }
    }
    return res
}
//Ejercicio 19: Crea una función que, dada una cadena de texto, elimine todas las
//vocales de la cadena.
fun eleminaVocales(a: String):String{
    var aux=""
    for (i in 0..a.length-1){
        if((a[i]!='a'&&a[i]!='e'&&a[i]!='i'&&a[i]!='o'&&a[i]!='u'&&a[i]!='A'&&a[i]!='E'&&a[i]!='I'&&a[i]!='O'&&a[i]!='U')){
            aux += a[i]
        }
    }
    return aux
}
//Ejercicio 20: Crea una función que calcule el factorial de un número.
fun calculaFactorial(a:Int):Int{
    var res = 1
    for (i in 2..a)
    {
        res*=i
    }
    return res
}
//Ejercicio 21: Crea una función que invierta una cadena de texto. Por ejemplo, "hola" debería convertirse en
//"aloh
fun revierteCadena(a:String):String{
    var aux=""
    for (i in 0..a.length-1){
        aux+=a[a.length-1-i]
    }
    return aux
}
//Ejercicio 22: Crea una función que, dado un número, devuelva True si es un número perfecto (la suma de
//sus divisores propios positivos es igual al número), o False en caso contrario.
fun determinaNumerosPerfectos(a:Int):Boolean{
    var suma=0
    for (i in 1..a-1){
        if(a%i==0)suma+=i
        println(suma)
    }
    if (suma==a) return true
    else return false
}
/*
Ejercicio 23: Crea una función que, dado un número entero, devuelva True si es un número Armstrong (un
número que es igual a la suma de sus propios dígitos elevados a una potencia). Por ejemplo, 153 es un
número Armstrong porque 1^3 + 5^3 + 3^3 = 153

Ejercicio 24: Crea una función que encuentre el número más grande en una matriz bidimensional
(una lista de listas).
Ejercicio 25: Crea una función que encuentre el número más pequeño en una matriz
bidimensional (una lista de listas).
Ejercicio 26: Crea una función que, dada una lista de palabras, devuelva la palabra más larga.
Ejercicio 27: Crea una función que, dada una lista de palabras, devuelva la palabra más corta.
Ejercicio 28: Crea una función que determine si una cadena de texto contiene solo
caracteres alfabéticos (letras) y espacios en blanco.
Ejercicio 29: Crea una función que determine si una cadena de texto es un
anagrama de otra cadena. Dos palabras son anagramas si tienen las mismas letras,
pero en un orden diferente.
Ejercicio 30: Crea una función que, dado un número entero, devuelva True si es un
número triangular (puede representarse como un triángulo equilátero de puntos), o
False en caso contrario.
Ejercicio 31: Duplicar Elementos en una Lista
Escribe una función que tome una lista de números y utilice la función map para
duplicar cada número en la lista. La función debe devolver una nueva lista con
todos los números duplicados.
Por ejemplo, si la entrada es [1, 2, 3, 4], la función debe devolver [2, 4, 6, 8]

Ejercicio 32: Crear un Diccionario a partir de Listas
Escribe una función que tome dos listas, una lista de claves y otra lista de valores, y
cree un diccionario utilizando mapOf para combinar las listas en un diccionario
clave-valor. La función debe devolver el diccionario resultante.

Ejercicio 33: Crea un programa se encargue de transformar un número decimal a
binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
Ejercicio 34: Crea una función que sea capaz de encriptar y desencriptar texto
utilizando el algoritmo de encriptación de Karaca (debes buscar información sobre
él).

Ejercicio 35: Crea una función que ordene y retorne una matriz de números.
 - La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro adicional
 - "Asc" o "Desc" para indicar si debe ordenarse de menor a mayor o de mayor a
menor.
 - No se pueden utilizar funciones propias del lenguaje que lo resuelvan
automáticamente
 */