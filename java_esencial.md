# JAVA ESENCIAL

## IDENTIFICADORES

### Que es un identificador

* Nombre que asignamos a diferentes elementos
* Variables, métodos, clases, paquetes e interfaces

### Que debe cumplir un identificador

* **Debe** comenzar con letra, guion bajo o carácter de moneda

* **Puede** contener: letras, números, caracteres moneda o caracteres de conexión
* Longitud
* No puede ser palabra clave
* Case-sensitive

## Convenciones

### Clases e Interfaces

* UpperCamelCase
* Acrónimos
* `CuentaBancaria, Usuario, ClienteHttp`

### Métodos

* LowerCamelCase
* Verbos en infinitivo o imperativo
* `convertir(),convertirAEuros(),obtenerNombre()`
* `convierte(),convierteAEuros(),obtenNombre()`

### Variables

* LowerCamelCase
* Nombres descriptivos
* `clienteActual, velocidad, numeroDePedido`

### Constantes

* Todo mayúsculas
* `PI, NUMERO_DE_SEMANAS`

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

