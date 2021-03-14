# 👀️ Repositorio en construccion 👀️

# Java 🚀️

* Con el lenguaje java apareció el concepto de Lenguaje orientado a objetos, ya que antes los lenguajes eran tipo "sabana" , todos de corrido.
* Al principio Java fue llamado Oak, y fue creado por la empresa Sun, antes de la explosion de internet. Busco una interfaz más cómoda, un lenguaje más fácil de usar y diversidad para escribir un código que funcione para varios dispositivos.
* Java es un lenguaje diseñado en los 90 por Sun Microsystems y ahora el dueño es Oracle. Es independiente de la plataforma, es decir, escribis el codigo solo 1 vez para que el mismo corra en varios dispositivos.
* Cada programa en java debe tener una clase, y todos los programas de java comienzan desde el main method que es publico, static (cualquiera puede acceder sin tener que instanciar la clase), void (no devuelve nada).

* Lo único malo que posee es que es un poco más lento que algunos programas de C por su tipo de lenguaje Byte Code que tiene que ser traducido en cada maquina donde es compilado el lenguaje.
* Funciona con la JVM (Java Virtual Machine) Gracias a este, cualquier programa java es ejecutable en cualquier sistema operativo, es como una mini maquina virtual que unifica todo.
* Recomiendo poner el codigo en un proyecto Java para poder ejecutarlo de manera mas facil.

## Ventajas y Desventajas de Java

### Ventajas

* El mismo codigo funciona para cualquier sistema operativo.
* Es orientado a objetos
* Un browser compatible con java te va a ejecutar cualquier aplicacion java.
* Es un lenguaje y brinda todo lo que te brinda cualquier lenguaje.
* Brinda elementos multimedia a las paginas web.

### Desventajas

* No tienden a ser muy rapidos los programas.
* Sigue siendo un lenguaje de programacion que hay que aprender de cero.

## Diferencias Java con C y C++ 🚀️

* **Punteros**: En java no existen punteros que es una manera de invocar unos tipos de memoria, y que su uso inadecuado causaba errores de compilación en C.
* **Variables Globales**: En java lo único global es el nombre de las clases, las variables pueden cambiar mucho
* **Sentencias Goto**: Son la forma más rápida de arreglar un programa rompiendo su estructura secuencia. Java no tiene ninguna sentencia goto, pero posee las sentencias break y continue que cubren los casos importantes de goto.
* **Asignación de Memoria**: Reservar memoria en C o C++ implicaba la utilización de sentencias como new o mallocs, que creaban objetos en memoria, que el mismo programador era responsable de eliminar de la memoria una vez que se los dejaba de utilizar y en la mayoría de los casos se omitía hacerlo. Java, ante esta vicisitud, posee un Garbage Collector (recolector de basura) que permite al programador desligarse de tener que eliminar los objetos de memoria.
* **Conversión de tipos Insegura**: Los cambios de tipo (casting) son un mecanismo de C y C++ que permite cambiar el tipo de un puntero. Java provee una comprobación de tipos de datos al momento de castear un tipo en otro. El casting (a veces denominado casteo en el lenguaje informático) es la conversión automática de tipos. Por ejemplo, si asignamos un número entero a  una variable de tipo real, se debe hacer un “casteo” del tipo entero al real.
* **Es más simple**: Se creo un lenguaje parecido a C++ para su rapido aprendizaje, y además maneja mucho mejor la memoria.
* **Distribuido**: Java se ha construido con extensas capacidades de interconexión con el protocolo TCP/IP. Existen rutinas para acceder e interactuar con protocolos como http y ftp. El protocolo http se utiliza para conectarse a un recurso (por ejemplo un archivo o un servidor) dentro de una misma red de datos; mientras que el protocolo ftp se utiliza para transmitir archivos de un dispositivo a otro. Esto permite a los programadores acceder a la información a través de la red con tanta facilidad como a los archivos locales.
* **Robusto**: Java realiza verificaciones en busca de problemas tanto en tiempo de compilación como en tiempo de ejecución. La comprobación de tipos en Java ayuda a detectar errores, lo antes posible, en el ciclo de desarrollo. Java obliga a la declaración explícita de métodos, reduciendo así las posibilidades de error. Maneja la memoria para eliminar las preocupaciones por parte del programador de la liberación o corrupción de memoria.
  También implementa los arrays o arreglos auténticos, en vez de listas enlazadas de punteros, con comprobación de límites, para evitar la posibilidad de sobrescribir o corromper memoria.
* **Arquitectura Neutral**: Para establecer Java como parte integral de la red, el compilador Java compila su código a un archivo objeto de formato independiente de la arquitectura de la máquina en que se ejecutará. Cualquier máquina que tenga el run-time puede ejecutar ese código objeto, sin importar en modo alguno la máquina en que ha sido generado. El código fuente Java se "compila" a un código de bytes de alto nivel independiente de la máquina. Este bytecodes está diseñado para ejecutarse en una máquina hipotética que es implementada por un sistema run-time, que sí es dependiente de la máquina.
* **Seguro**: La seguridad en Java tiene dos facetas. En el lenguaje, se eliminan características como los punteros o el casting implícito que hacen los compiladores de C y C++, para prevenir el acceso ilegal a la memoria.
  El código de Java pasa muchos tests antes de ejecutarse en una máquina. El código se pasa a través de un verificador de bytecodes que comprueba el formato de los fragmentos de código y aplica un tester de teoremas para detectar fragmentos de código ilegal (código que falsea punteros, viola derechos de acceso sobre objetos o intenta cambiar el tipo o clase de un objeto).
  Si los byte-codes pasan la verificación sin generar ningún mensaje de error, entonces sabemos que:
  El código no produce desbordamiento de operandos en la pila
  El tipo de los parámetros de todos los códigos de operación es conocido y correcto.
  No ha ocurrido ninguna conversión ilegal de datos, tal como convertir enteros en punteros.
  El acceso a los campos de un objeto se sabe que es legal: public, private, protected.
  No hay ningún intento de violar las reglas de acceso y seguridad establecidas.
* **Portable**:  Más allá de la portabilidad básica por ser de arquitectura independiente, Java implementa otros estándares de portabilidad para facilitar el desarrollo. Java construye sus interfaces de usuario a través de un sistema abstracto de ventanas de forma que las ventanas puedan ser implementadas en entornos Unix, Pc o Mac.
* **Integrado**: El intérprete Java (run-time) puede ejecutar directamente el código objeto. Enlazar un programa, normalmente, consume menos recursos que compilarlo, por lo que los desarrolladores con Java pasarán más tiempo desarrollando y menos esperando por la ejecución. No obstante, el compilador actual del JDK es bastante lento. Por ahora, que todavía no hay compiladores específicos de Java para las diversas plataformas, Java es más lento que otros lenguajes de programación, como C++, ya que debe ser interpretado y no ejecutado como sucede en cualquier programa tradicional.
* **Multitema**: Primero, te contamos que los threads (hilos en español) son básicamente pequeños procesos o piezas independientes de un gran proceso. Java, al ser multithreaded, permite muchas actividades simultáneas en un programa. De esta manera, al estar los threads construidos en el lenguaje, son más fáciles de usar y más robustos que sus homólogos en C o C++.
  El beneficio de ser miltithreaded consiste en un mejor rendimiento interactivo y mejor comportamiento en tiempo real. Aunque el comportamiento en tiempo real está limitado a las capacidades del sistema operativo subyacente (Unix, Windows, etc.), aún supera a los entornos de flujo único de programa (single-threaded) tanto en facilidad de desarrollo como en rendimiento
* **Dinamico**: Java se beneficia todo lo posible de la tecnología orientada a objetos. Java no intenta conectar todos los módulos que comprenden una aplicación hasta el tiempo de ejecución. Las librerías nuevas o actualizadas no paralizarán las aplicaciones actuales.
  Para evitar que haya que estar trayendo los módulos de byte-codes o los objetos o nuevas clases de la red cada vez que se necesiten, se implementan las opciones de persistencia, para que no se eliminen cuando se limpie la caché de la máquina.

## Scanner

Tipos de Scans que puedo hacer:

* `nextByte()`
* `nextShort()`
* `nextInt()`
* `nextLong()`
* `nextFloat()`
* `nextDouble()`
* `nextBoolean()`
* `nextLine()`
* `next()` (Una sola palabra)

