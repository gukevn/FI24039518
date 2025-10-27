# Caso Práctico 1 – Estructuras de Datos (SC-304)

**Estudiante:** Kevin Andrés Gutiérrez Chinchilla  
**Profesor:** Luis Andrés Rojas Matey  
**Fecha de entrega:** Lunes 27 de octubre, antes de las 6:00 pm  
**Carpeta de entrega:** CP1 (ubicada en la raíz del repositorio, branch main)

---

## 1. Descripción General

Este caso práctico consta de tres proyectos completamente independientes entre sí:

- **Recursividad:** Implementación de la serie de Números Metálicos mediante fórmula directa, recursión e iteración.
- **Pilas:** Implementación de una pila (estructura LIFO) con manejo de desbordamiento (overflow) y vaciado (underflow).
- **Colas:** Implementación de una cola (estructura FIFO) para simular nucleótidos de ADN y generar codones (tripletas).

Se respetaron todas las restricciones del enunciado:
- No se modificaron las interfaces ni los métodos `main`.
- No se agregaron impresiones adicionales (`System.out.print`).
- No se utilizaron bloques `try/catch/finally`.
- No se incluyeron archivos `.class` ni directorios de compilación en el repositorio.

---

## 2. Estructura del Proyecto
CP1/
├─ Recursividad/
│ └─ Numbers.java
├─ Pilas/
│ ├─ IStack.java
│ └─ TheStack.java
└─ Colas/
├─ IQueue.java
└─ TheQueue.java

---

## 3. Instrucciones de Compilación y Ejecución

### 📌 Recursividad
```bash
cd CP1/Recursividad
javac Numbers.java
java Numbers

cd CP1/Pilas
javac IStack.java TheStack.java
java CP1.Pilas.TheStack 3

cd CP1/Colas
javac IQueue.java TheQueue.java
java CP1.Colas.TheQueue 15



4. Descripción de Implementaciones
🔷 Recursividad

Se calcula el valor metálico usando:

Fórmula directa: formula(z)

Recursivo: f(z, n) = z * f(z, n - 1) + f(z, n - 2)

Iterativo: usando bucles para replicar la misma lógica.

Se utiliza double con precisión de 10 decimales, según especificación.

🔷 Pilas

push(x) retorna true si el valor se inserta; false si hay overflow.

pop() y peek() retornan null si la pila está vacía.

La pila se prueba con n + 1 operaciones para validar ambos casos.

🔷 Colas

Se utiliza ArrayDeque para almacenar nucleótidos generados aleatoriamente.

dequeue() y getFront() obtienen elementos de la cola retornando null si está vacía.

getCodons(n) genera un arreglo de n / 3 codones, vaciando completamente la cola.

5. Confirmación de Entrega Correcta

Carpeta CP1 se encuentra en la raíz del branch main
No contiene archivos compilados (.class)
Todas las secciones (Errors, Improvement, Update) han sido implementadas correctamente en los tres proyectos
El código compila y ejecuta exactamente como lo exige el enunciado

// Fuente teórica: https://en.wikipedia.org/wiki/Metallic_mean
// Uso de sucesión recursiva basada en definición matemática estándar

// Concepto de pila (LIFO) basado en documentación académica de estructuras de datos
// Referencia teórica: https://es.wikipedia.org/wiki/Pila_(inform%C3%A1tica)

// Cola basada en interfaz Deque según documentación oficial de Java SE
// Referencia: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html
