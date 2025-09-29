# PP1 – SC-304 (Estructuras de Datos)

**Estudiante:** Kevin Andrés Gutiérrez Chinchilla  
**Carné:** (FI24039518)

## Fuentes/Referencias
- GeeksforGeeks – “Recursion in Java” — explicación de recursividad, casos base, casos recursivos.   // https://www.geeksforgeeks.org/java/recursion-in-java/?utm_source=chatgpt.com
- StackOverflow – preguntas/respuestas sobre invertir números con recursividad en Java.  //https://stackoverflow.com/questions/69439873/reverse-an-int-using-recursion?utm_source=chatgpt.com
 

## IA – Prompts y Respuestas

# Paso 1 — De cero a “ambiente listo + repo listo”

**Objetivo del paso**:
Dejar funcionando **Java 21** en tu máquina y crear el **repositorio Git con la carpeta `PP1/` y `README.md`** en la rama `main`, sin `.class` (con `.gitignore`).

> Nota rápida: la práctica pide **Java SE/JDK 21 LTS**, un solo archivo `Inverso.java`, algoritmo **recursivo** que use **cociente y residuo**, y repo con **PP1** + **README.md**. La idea de recursividad/pila va en la línea de lo explicado por el profesor en clase. 

---

## 1) Instalar JDK 21 (Windows)

1. Desinstala Javas viejos si los tienes (Panel de Control → Programas).
2. Instala **JDK 21** (OpenJDK u Oracle).
3. Configura `PATH`:

   * Inicio → “Editar las variables de entorno del sistema” → **Variables de entorno…**
   * En **Path** (Sistema), **Nuevo**: `C:\Program Files\Java\jdk-21\bin` → Aceptar todo.
4. Verifica en **Terminal/PowerShell**:

   ```bat
   java -version
   javac -version
   ```

   Debes ver algo como `21.x`.

**Mini-prueba** (opcional pero altamente recomendado):

```bat
mkdir C:\Users\%USERNAME%\Desktop\java-test
cd C:\Users\%USERNAME%\Desktop\java-test
notepad Hello.java
```

Pega:

```java
public class Hello {
  public static void main(String[] args) {
    System.out.println("Java 21 OK");
  }
}
```

Compila y corre:

```bat
javac Hello.java
java Hello
```

Debe imprimir: `Java 21 OK`.

---

## 2) Instalar VS Code + Extensiones de Java

1. Instala **Visual Studio Code** (si no lo tienes).
2. Abre VS Code → pestaña **Extensions**:

   * Instala **Extension Pack for Java** (Microsoft).
   * Instala **Language Support for Java™ by Red Hat** (si no viene ya en el pack).
3. Reinicia VS Code.

---

## 3) Crear el repositorio con estructura correcta

> Nombre sugerido del repo (libre): `sc304-pp1-kevin` (o el que uses siempre).

### Opción A (rápida, todo desde tu PC con Git):

1. Crea carpeta local:

   ```bat
   mkdir C:\Users\%USERNAME%\Documents\sc304-pp1-kevin
   cd C:\Users\%USERNAME%\Documents\sc304-pp1-kevin
   ```
2. Inicializa git y la rama `main`:

   ```bat
   git init
   git branch -M main
   ```
3. Crea estructura y archivos mínimos:

   ```bat
   mkdir PP1
   echo # PP1 - SC-304 > README.md
   echo *.class > .gitignore
   ```
4. Primer commit:

   ```bat
   git add .
   git commit -m "PP1 scaffold: folder, README, .gitignore"
   ```
5. Crea el repo **vacío** en GitHub (web) con el mismo nombre **sin README** (porque ya lo tienes local).
6. Conecta remoto y sube:

   ```bat
   git remote add origin https://github.com/<tu-usuario>/sc304-pp1-kevin.git
   git push -u origin main
   ```

### Opción B (VS Code “Clone from GitHub”):

1. Crea el repo vacío en GitHub (web) **sin README**.
2. En VS Code: **Ctrl+Shift+P** → “Git: Clone” → pega la URL del repo → elige una carpeta local.
3. Dentro de la carpeta clonada: crea `PP1/`, `README.md`, `.gitignore` con `*.class`.
4. **Source Control** (icono Git) → `+` → **Commit** → **Sync/Push**.

> **Regla de oro**: el archivo `Inverso.java` irá dentro de `PP1/` y **no** subas `Inverso.class`. El `.gitignore` con `*.class` evita metidas de pata.

---

## 4) Relleno mínimo del README.md (plantilla)

Abre `README.md` y deja este esqueleto para completar luego:

```md
# PP1 – SC-304 (Estructuras de Datos)

**Estudiante:** Kevin Andrés Gutiérrez Chinchilla  
**Carné:** (tu carné)

## Fuentes/Referencias
- (Enlaces a páginas que uses)
- (Snippets que consultes)

## IA – Prompts y Respuestas
- (Enlace(s) compartido(s) a ChatGPT/Copilot/Gemini o pega el prompt/resultado)

## Preguntas requeridas
1. ¿Se puede implementar equivalente iterativo? (Responderás al final)
2. ¿Hay otra manera recursiva de generar el mismo resultado? (Responderás al final)
3. Relación con cambio de bases usando cocientes y residuos. (Responderás al final)
```

---

## Checklist accionable (Paso 1)

| Tarea                                                        | Cómo                                   | Responsable | Fecha/Hora CR            |
| ------------------------------------------------------------ | -------------------------------------- | ----------- | ------------------------ |
| Instalar JDK 21 y configurar PATH                            | Pasos 1 y prueba `java/javac -version` | **Kevin**   | **Hoy dom 28/09, 21:00** |
| Instalar VS Code + Extensiones Java                          | Pasos 2                                | **Kevin**   | **Hoy dom 28/09, 21:30** |
| Crear repo local + `PP1/`, `README.md`, `.gitignore`         | Pasos 3 (A o B)                        | **Kevin**   | **Hoy dom 28/09, 22:00** |
| Crear repo en GitHub y subir `main`                          | `git remote add origin` + `git push`   | **Kevin**   | **Hoy dom 28/09, 22:15** |
| Verificar en GitHub que `PP1/` y `README.md` están en `main` | Navegador                              | **Kevin**   | **Hoy dom 28/09, 22:20** |

> **Fecha límite oficial**: **Lun 29/09/2025 antes de las 6:00 pm (CR)**. Hoy dejamos el ambiente y el repo **listos** para que mañana solo programes y documentes sin drama.

---

## Señales de que el Paso 1 quedó OK

* `java -version` y `javac -version` muestran **21**.
* En GitHub (rama `main`) ves: `PP1/`, `README.md`, `.gitignore`.
* `.gitignore` contiene `*.class`.

---

¿Todo claro y logrado el **Paso 1**?
Respóndeme **“listo paso 1”** (y si algo falló, dime exactamente en qué paso se atoró: mensaje de error o captura). Cuando me confirmes, pasamos al **Paso 2: crear `Inverso.java` (recursivo con cociente y residuo), compilar y ejecutar desde consola con `java Inverso 123` y que imprima `123 → 321`.


## Preguntas requeridas
1. ¿Se puede implementar equivalente iterativo? 
-Sí, es posible. En lugar de usar recursividad, se puede aplicar un bucle while que vaya dividiendo el número entre 10 y construyendo el inverso acumulando los residuos. Por ejemplo: 

"public static int invertirIterativo(int n) {
    int inverso = 0;
    while (n > 0) {
        int residuo = n % 10;
        n = n / 10;
        inverso = inverso * 10 + residuo;
    }
    return inverso;
}
"
2. ¿Hay otra manera recursiva de generar el mismo resultado? 
-Sí. La forma que implementamos usa un acumulador para ir construyendo el resultado paso a paso. Pero también se puede resolver sin acumulador, calculando cuántos dígitos tiene el cociente en cada paso y multiplicando el residuo por la potencia de 10 correspondiente. Por ejemplo:
"
public static int invertirOtraForma(int n) {
    if (n < 10) {
        return n;
    }
    int residuo = n % 10;
    int cociente = n / 10;
    int digitos = (int) Math.log10(cociente) + 1;
    return residuo * (int) Math.pow(10, digitos) + invertirOtraForma(cociente);
}
"
3. Relación con cambio de bases usando cocientes y residuos.
-La relación está en el mismo principio matemático: la descomposición de un número en cociente y residuo.

Para invertir un número, se divide entre 10 repetidamente, tomando el residuo en cada paso para reconstruir los dígitos en orden inverso.

Para convertir a otra base, se divide el número entre la base destino (2, 8, 16, etc.), tomando cada residuo como dígito en esa base y continuando con el cociente.

En ambos casos, el algoritmo se basa en la idea de que cualquier número puede expresarse como combinación de cocientes y residuos sucesivos. La diferencia está en el uso: en la inversión, esos residuos se reorganizan en orden contrario; en el cambio de base, se reinterpretan en un sistema distinto.


