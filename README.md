# Práctica Programada 3

| Curso                   | Estructuras de Datos                   |
| :---------------------- | :------------------------------------- |
| Código                  | SC-304                                 |
| Profesor                | Luis Andrés Rojas Matey                |
| Valor                   | 5 %                                    |
| Fecha y hora de entrega | Lunes 3 de noviembre antes de las 6 pm |


- Nombre: Kevin Andrés Gutiérrez Chinchilla  
- Carné: FI24039518  
- IDE utilizado: Visual Studio Code (VS Code) con extensiones de Java, Git y PowerShell integradas.  

- Fuentes consultadas / referencias de apoyo:
  - Documentación oficial de Oracle Java SE 21: https://docs.oracle.com/en/java/javase/21/docs/api/
  - OpenJDK 21 Reference Implementation: https://jdk.java.net/java-se-ri/21/
  - Stack Overflow – Manejo de listas enlazadas en Java: https://stackoverflow.com/questions/tagged/java+linked-list
  - Ejemplos base del repositorio del profesor: https://github.com/larmcr/2025-III-SC-304

- Prompts y asistencia con IA:
  - Durante el desarrollo se utilizó ChatGPT (modelo GPT-5, OpenAI) como herramienta de apoyo para aclarar dudas sobre las listas doblemente enlazadas circulares en Java y para revisar la lógica de los métodos addFirst, addLast, removeFirst y removeLast.  
  - También se usó para resolver algunos detalles prácticos con Git y la terminal de PowerShell, especialmente al conectar el proyecto local (descargado en ZIP) con el repositorio remoto https://github.com/gukevn/FI24039518, crear la rama PP3 y limpiar la estructura de carpetas duplicadas que venían en el archivo original del profesor.  
  - Las conversaciones con la IA se centraron en:  
    - Comprender la estructura circular de los nodos y cómo mantener correctamente las referencias head y tail.  
    - Corregir errores de compilación y de rutas en PowerShell (javac, java, cd, move, etc.).  
    - Preparar un README.md claro y bien presentado en formato Markdown, siguiendo las instrucciones exactas de la práctica.  

- Respuestas a las preguntas teóricas:

  1. Si tuviera que implementar una estructura tipo Cola (Queue), ¿qué tipo de lista (simple, circular, doblemente enlazada o circular doblemente enlazada) utilizaría y por qué? ¿Y para una estructura tipo Pila (Stack)?

     Para una Cola (Queue), elegiría una lista circular enlazada, ya que permite enlazar el último nodo con el primero y facilita las operaciones de inserción al final (enqueue) y eliminación al inicio (dequeue) sin necesidad de recorrer toda la estructura. La circularidad mantiene el flujo de datos de forma continua y eficiente.  

     En cambio, para una Pila (Stack) usaría una lista simple enlazada, porque las operaciones principales (push y pop) se realizan en un solo extremo. Es una opción más ligera, fácil de implementar y que aprovecha mejor la memoria.  

  2. ¿Cuál cree que podría ser una ventaja y una desventaja de utilizar una estructura de tipo lista creada por usted mismo, en vez de las opciones provistas directamente por los módulos estándar de Java (como por ejemplo List)?

     Ventaja: programar una lista desde cero permite entender con detalle cómo se enlazan los nodos, cómo se maneja la memoria y cómo funcionan internamente las estructuras de datos. Además, brinda la libertad de adaptar la lógica según las necesidades del proyecto.  

     Desventaja: las listas implementadas manualmente no son tan eficientes ni seguras como las que ya vienen optimizadas en las bibliotecas estándar de Java. Requieren más mantenimiento y pruebas, y son más propensas a errores si no se controlan bien los punteros.
