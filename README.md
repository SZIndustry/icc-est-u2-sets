# 📦 Sets en Java - Implementación de HashSet, LinkedHashSet y TreeSet

Este proyecto demuestra el uso de diferentes implementaciones de la interfaz `Set` en Java, incluyendo `HashSet`, `LinkedHashSet` y `TreeSet`, además de comparadores personalizados para ordenar los elementos según distintos criterios.

---

## 📂 Paquete

`controllers.Sets`

---

## 🚀 Funcionalidades

### ✅ `construirHashSet()`
- Usa `HashSet`.
- No mantiene el orden de inserción.
- No permite duplicados.

### ✅ `construirLinkedHashSet()`
- Usa `LinkedHashSet`.
- Mantiene el orden de inserción.
- No permite duplicados.

### ✅ `construirTreeSet()`
- Usa `TreeSet`.
- Ordena los elementos en orden natural (alfabético en este caso).
- No permite duplicados.

### ✅ `construirTreeSetConComparador()`
- Usa `TreeSet` con un **comparador personalizado**.
- Ordena las palabras por **longitud ascendente** y alfabéticamente si tienen la misma longitud.

### ✅ `construirTreeSetConComparadorDescendente()`
- Usa `TreeSet` con un **comparador descendente**.
- Ordena las palabras por **longitud descendente** y alfabéticamente en orden inverso si tienen la misma longitud.

---
![alt text](image.png)