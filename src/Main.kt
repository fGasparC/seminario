//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val listaNumeros= intArrayOf(34,52,32,44,54,200,22,23,44,94,61,45,424)

    println("Ejercicio 1")//Ejercicio 1
    obtenerMaximo(listaNumeros)

    println("Ejercicio 2")//Ejercicio 2
    obtenerSumatoria(listaNumeros)

    println("Ejercicio 3")//Ejercicio 3
    val kms=obtenerKms(5f)
    println(kms)

    println("Ejercicio 4")//Ejercicio 4
    var esPalindromo=determinaPalindromos("galleta")
    println(esPalindromo)

    println("Ejercicio 5")//Ejercicio 5
    var numLetras=cuentaLetras("El gato se subio al tejado y se cayo", ' ')
    println(numLetras)
    println("Ejercicio 6")//Ejercicio 6
    println(cuentaCadenas("hola hola hola adios hola adios hola hola adios","hola"))
    println("Ejercicio 7")//Ejercicio 7
    var letra=poneMayusculaPrimeraLetra("Hola, lo primero de todo como estan los maquinas?")
    println(letra)

    println("Ejercicio 8")//Ejercicio 8
    println(sumaDigitos(100000001))

    println("Ejercicio 9")//Ejercicio 9
    println("El maximo comun divisor es ${MaxComunDivisor(173,999)}")

    println("Ejercicio 10")//Ejercicio 10
    fiboTermino(25)

    println("Ejercicio 11")//Ejercicio 11
    primoRelativo(503,163)

    println("Ejercicio 12")//Ejercicio 12
    println(esCapicua(4424))

    println("Ejercicio 13")//Ejercicio 13

    println("Ejercicio 14")//Ejercicio 14
    imprimeMosaico(20)

    println("Ejercicio 15")//Ejercicio 15
    val iA1= intArrayOf(5,4,2,3,4,5,2,12,3,2)
    val iA2= intArrayOf(5,4,2,3,4,5,2,11,3,2)
    val booArr=booleanizadorDeArraysDeEnteros(iA1,iA2)
    for(i in 0.. booArr.size-1){
        print(booArr[i])
    }

    println("Ejercicio 16")//Ejercicio 16
    val iA3= intArrayOf(5,5,5)
    var aoblongo=multiplicadorElementosArray(iA3)
    println(aoblongo)
    println("Ejercicio 17")//Ejercicio 17
    var aoblonga=devuelvePares(iA2)
    for (i in 0..aoblonga.size-1){
        print(aoblonga[i])
    }
    println()

    println("Ejercicio 18")//Ejercicio 18
    println(determinadorPrimo(5))

    println("Ejercicio 19")//Ejercicio 19
    println(eleminaVocales("Esternocleidomastoideo"))

    println("Ejercicio 20")//Ejercicio 20
    println(calculaFactorial(5))

    println("Ejercicio 21")//Ejercicio 21
    println(revierteCadena("Hola"))

    println("Ejercicio 22")//Ejercicio 22
    println(determinaNumerosPerfectos(495))

    println("Ejercicio 23")//Ejercicio 23
    println(determinaNumeroAmstrong(8209))

    println("Ejercicio 24")//Ejercicio 24
    val matrix: Array<IntArray> = arrayOf(iA1,iA2)
    println(buscaMaximoEnMatrices(matrix))

    println("Ejercicio 25")//Ejercicio 25
    println(buscaMinimoEnMatrices(matrix))

    println("Ejercicio 26")//Ejercicio 26
    val listaPalabras= arrayOf("pelota","monitor","madrugar","Desoxirribonucleótido", "solecito","sol")
    println(devuelvePalabraMasLarga(listaPalabras))

    println("Ejercicio 27")//Ejercicio 27
    println(devuelvePalabraMasCorta(listaPalabras))

    println("Ejercicio 28")//Ejercicio 28
    println(esSoloLetrasSoloEspacios("Uno dos tres cuatro cinco"))

    println("Ejercicio 29")//Ejercicio 29
    println(esAnagrama("mora","amor"))

    println("Ejercicio 30")//Ejercicio 30
    println(esNumeroTriangular(21))

    println("Ejercicio 31")//Ejercicio 31)
    val numeros = listOf(1, 2, 3, 4)
    var dNL=duplicadorNumerosLista(numeros)
    println(dNL)

    println("Ejercicio 32")//Ejercicio 32)


    println("Ejercicio 33")//Ejercicio 33)
    println(decimalABinario(10))

    println("Ejercicio 34")//Ejercicio 34)
    println(encriptacionKaraca("Hola que tal"))

    println("Ejercicio 35")//Ejercicio 35)
    val ej35= intArrayOf(5,4,2,34,4,1,9,0,332)
    var ej35R=ordenaNumeros(ej35,"desc")
    for(i in 0..ej35R.size-1){
        print(ej35R[i])
        print(" ")
    }
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
    var contador = 0
    var posI=0
    var posF=b.length
    while (posF<a.length-1){
        var pal=""
        for(i in posI..posF-1)
        {
            pal+=a[i].lowercase()
        }
        if(pal==b.lowercase()) contador++
        posI++
        posF++
    }

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
    }
    if (suma==a) return true
    else return false
}

//Ejercicio 23: Crea una función que, dado un número entero, devuelva True si es un número Armstrong (un
//número que es igual a la suma de sus propios dígitos elevados a una potencia). Por ejemplo, 153 es un
//número Armstrong porque 1^3 + 5^3 + 3^3 = 153
fun determinaNumeroAmstrong(a: Int):Boolean{
    var numeroStr=""+a
    var cifrasNumeros=numeroStr.length
    var res=0
    for(i in 0..cifrasNumeros-1)
    {
        res+=Math.pow(numeroStr.get(i).digitToInt().toDouble(),cifrasNumeros.toDouble()).toInt()
    }
    if (res==a) return true
    else return false
}

//Ejercicio 24: Crea una función que encuentre el número más grande en una matriz bidimensional
//(una lista de listas).
fun buscaMaximoEnMatrices(a:Array<IntArray>):Int{
    var max=0
    for (i in 0..a.size-1){
        for (j in 0..a[0].size-1){
            if(j==0 && i==0){
                max = a[i][j]
            }
            else{
                if (a[i][j]>max){
                   max= a[i][j]
                }
            }
        }
 }
    return max
}

//Ejercicio 25: Crea una función que encuentre el número más pequeño en una matriz
//bidimensional (una lista de listas).
fun buscaMinimoEnMatrices(a:Array<IntArray>):Int{
    var min=0
    for (i in 0..a.size-1){
        for (j in 0..a[0].size-1){
            if(j==0 && i==0){
                min = a[i][j]
            }
            else{
                if (a[i][j]<min){
                    min= a[i][j]
                }
            }
        }
    }
    return min
}

//Ejercicio 26: Crea una función que, dada una lista de palabras, devuelva la palabra más larga.
fun devuelvePalabraMasLarga(a: Array<String>):String{
    var res=""
    for(i in 0..a.size-1){
        if(a[i].length>res.length){
            res=a[i]
        }
    }
    return res
}

//Ejercicio 27: Crea una función que, dada una lista de palabras, devuelva la palabra más corta.
fun devuelvePalabraMasCorta(a: Array<String>):String{
    var res=""
    for(i in 0..a.size-1){
        if(i==0){
            res=a[i]
        }else{
            if(a[i].length<res.length){
                res=a[i]
            }
        }

    }
    return res
}

//Ejercicio 28: Crea una función que determine si una cadena de texto contiene solo
//caracteres alfabéticos (letras) y espacios en blanco.
fun esSoloLetrasSoloEspacios(a: String):Boolean{
    var res=true
    for(i in 0..a.length-1){
        if (a[i] != ' ' && a[i] !in ('A'..'Z') && a[i] !in ('a'..'z')) res= false
    }
    return res
}

//Ejercicio 29: Crea una función que determine si una cadena de texto es un
//anagrama de otra cadena. Dos palabras son anagramas si tienen las mismas letras,
//pero en un orden diferente.
fun esAnagrama(a: String, b: String):Boolean{
    if (a.length!=b.length) return false
    else{
        var contA=IntArray('z'-'a')
        var contB=IntArray(contA.size)
        for(i in 0..a.length-1){
            contA[a[i]-'a']++
            contB[b[i]-'a']++
        }
        if (contA.contentEquals(contB)) return true
        else return false
    }


}
//Ejercicio 30: Crea una función que, dado un número entero, devuelva True si es un
//número triangular (puede representarse como un triángulo equilátero de puntos), o
//False en caso contrario.
fun esNumeroTriangular(a: Int):Boolean{
    var n=1
    var numT=0
    while (numT<a){
        numT=(n*(n+1))/2
        n++
    }
    if(numT==a) return true
    else return false
}

//Ejercicio 31: Duplicar Elementos en una Lista
//Escribe una función que tome una lista de números y utilice la función map para
//duplicar cada número en la lista. La función debe devolver una nueva lista con
//todos los números duplicados.
//Por ejemplo, si la entrada es [1, 2, 3, 4], la función debe devolver [2, 4, 6, 8]
fun duplicadorNumerosLista(a: List<Int>):List<Int>{
    return a.map{it*2}
}

//Ejercicio 32: Crear un Diccionario a partir de Listas
//Escribe una función que tome dos listas, una lista de claves y otra lista de valores, y
//cree un diccionario utilizando mapOf para combinar las listas en un diccionario
//clave-valor. La función debe devolver el diccionario resultante.

//Ejercicio 33: Crea un programa se encargue de transformar un número decimal a
//binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
fun decimalABinario(a:Int):String{
    var n=a
    var res=""
    while (n>0){
        var aux=n%2
        res+=aux
        n=n/2
    }
    return res.reversed()
}
//Ejercicio 34: Crea una función que sea capaz de encriptar y desencriptar texto
//utilizando el algoritmo de encriptación de Karaca (debes buscar información sobre
//él).
fun encriptacionKaraca(a:String):List<String>{
    var aux= a.lowercase().split(' ').toMutableList()
    for(i in 0..aux.size-1){
        aux[i]=aux[i].reversed()
    }
    return auxEncriptacionKaraca(aux)
}
fun auxEncriptacionKaraca(a:MutableList<String>):List<String>{
    for(i in 0..a.size-1){
        var pal=""
        for (j in 0..a[i].length-1){
            if (a[i][j]=='a'){
                pal+="0"
            }
            else if(a[i][j]=='e'){
                pal+="1"
            }
            else if(a[i][j]=='i'|| a[i][j]=='o'){
                pal+="2"
            }
            else if(a[i][j]=='u'){
                pal+="3"
            }
            else{
                pal+=a[i][j]
            }
        }
        a[i]=pal
    }
    for (i in 0..a.size-1){
        a[i]+="aca"
    }
    return a
}
//Ejercicio 35: Crea una función que ordene y retorne una matriz de números.
// - La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro adicional
// - "Asc" o "Desc" para indicar si debe ordenarse de menor a mayor o de mayor a
//menor.
// - No se pueden utilizar funciones propias del lenguaje que lo resuelvan
//automáticamente
fun ordenaNumeros(a:IntArray,b: String="asc"):IntArray{
    var aux=0
    for(i in 0..a.size){
        for(j in 0..a.size-2){
            if(a[j]>a[j+1]){
                aux=a[j]
                a[j]=a[j+1]
                a[j+1]=aux
            }
        }
    }
    if(b.lowercase().equals("asc")) return a
    else return a.reversed().toIntArray()
}