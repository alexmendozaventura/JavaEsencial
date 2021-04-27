# JAVA ESENCIAL

## Características de Java

* Escríbelo una vez, ejecútalo en cualquier lugar

* Independencia de la plataforma

  ![](C:\Users\alexm\Documents\GitHub\JavaEsencial\imagenes\01_caracteristica_java_multiplataforma.png)

* Lenguaje orientado a objetos

  * Abstracción
  * Encapsulación
  * Polimorfismo
  * Herencia

## Características principales de Java

![](C:\Users\alexm\Documents\GitHub\JavaEsencial\imagenes\02_caracteristicas_principales_java.png)

## Identificadores

### Que es un identificador

* Nombre que asignamos a diferentes elementos
* Variables, métodos, clases, paquetes e interfaces

### Que debe cumplir un identificador

* **Debe** comenzar con letra, guion bajo o carácter de moneda

  ```java
  Character.isJavaIdentifierStart(miCaracter);
  ```

* **Puede** contener: letras, números, caracteres moneda o caracteres de conexión

  ```java
  Character.isJavaIdentifierPart(miCaracter);
  ```

* Longitud

* No puede ser palabra clave

* Case-sensitive

  Ejemplos incorrectos

  | Identificador incorrecto | Causa                         |
  | ------------------------ | ----------------------------- |
  | 2_imagen                 | Comienza con un número        |
  | Mi variable              | Contiene un espacio           |
  | x+y                      | + no es un carácter valido    |
  | true                     | true es una palabra reservada |

## Convenciones

### Clases e Interfaces

* UpperCamelCase
* Acrónimos
* Ejemplos: `CuentaBancaria, Usuario, ClienteHttp`

### Métodos

* LowerCamelCase
* Verbos en infinitivo o imperativo
* Ejemplos infinitivo : `convertir(),convertirAEuros(),obtenerNombre()`
* Ejemplos imperativo: `convierte(),convierteAEuros(),obtenNombre()`

### Variables

* LowerCamelCase
* Nombres descriptivos
* Ejemplos: `clienteActual, velocidad, numeroDePedido`

### Constantes

* Todo mayúsculas
* Ejemplos: `PI, NUMERO_DE_SEMANAS`

## Conversiones

### Conversión de promoción

`byte -> short, int, long, float o double`

`short -> int, long, float o double`

`int -> long, float o double`

`long -> float o double`

`float -> double`

### Conversión de contracción

`short -> byte o char`

`char -> byte o short`

`int -> byte, short o char`

`long -> byte, short, char o int`

`float -> byte, short, char, int o long`

`double -> byte, short, char, int, long o float`

## Reglas de promoción 

* Si alguno es `double`, resto `double`

* Si no, si alguno es `float`, resto `float`

* Si no, si alguno es `long`, resto `long`

* Resto de casos,`int`

  **Ejemplos**

  ```java
  int + double + float -> double
  char - char -> int
  byte * short -> int
  byte/int + long -> long
  ```

## Estructuras de Control

### Sentencias de selección

`if-else`

```java
if(condición){
	//bloque 1
}
else{
	//bloque 2
}
```

`switch`

```java
switch(exp){
case a: 
...
case b:
...
case c: 
...
}
```

### Sentencias de iteración

`for`

```java
for(inicialización; condición; iteración){
//bloque de código 
}
```

`while`

```
while(condición){
//bloque de código
}
```

`do-while`

```java
do{
//bloque de código
}
while(condición)

```

### Sentencias de salto

`break;`

`continue;`

`return;`

## Clases

### Función de las clases

* Describen los objetos
* Que variables tienen
* Como se manipulan esas variables
* Como se destruyen los objetos

### Ventajas de las clases

* Modular
* Reutilizable y transferible
* Extensible
* Testable
* Mantenible

### Forma general de una clase

```
class NombreDeLaClase{
//declaración de variables de instancia
tipo variable1;
tipo variable2;
//..
tipo variableN
//declaración de métodos
tipo metodo1(parámetros){
	//cuerpo del método
}
tipo metodo2(parámetros){
	//cuerpo del método
}	

}
```

## Encapsulación

![](C:\Users\alexm\Documents\GitHub\JavaEsencial\imagenes\01_encapsulación.png)

### Niveles

* Modificadores de acceso

* Paquetes

* Módulos

  ![](C:\Users\alexm\Documents\GitHub\JavaEsencial\imagenes\02_niveles_encapsulación.png)

  

### Organización de archivos 

```
https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html
```

Para abrir el explorador 

![](C:\Users\alexm\Documents\GitHub\JavaEsencial\imagenes\03_explorador_de_archivos.png)

Para abrir la estructura del proyecto

![](C:\Users\alexm\Documents\GitHub\JavaEsencial\imagenes\04_estructura_del_proyecto.png)

Para seleccionar el origen de las fuentes de compilación 

![](C:\Users\alexm\Documents\GitHub\JavaEsencial\imagenes\05_seleccionar_origen_fuente.png)

Módulos

Declaración de un modulo 

```
nombre del archivo: module-info.java
module modulename{

}
```

Directivas

* requires
* requires transitive
* exports
* exports...to
* uses
* provides...with
* open, opens y opens...to