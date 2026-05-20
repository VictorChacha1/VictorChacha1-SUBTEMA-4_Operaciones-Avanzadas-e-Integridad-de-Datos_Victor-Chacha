# Práctica de Algoritmia: Búsqueda Lineal y Gestión Segura de Memoria

Este proyecto es parte de la formación en Ingeniería de Software en la Universidad Técnica de Ambato, enfocado en dominar estructuras de datos unidimensionales y algoritmos de recorrido. 
El código aquí presentado demuestra cómo gestionar información en memoria de forma eficiente y, sobre todo, segura.

### ¿Qué contiene este repositorio?

El desarrollo se divide en dos soluciones técnicas implementadas tanto en **C++** como en **Java**:

- **Sistema de Consulta de Inventario (Ejercicio 1):**
  Implementa un algoritmo de búsqueda lineal sobre arreglos paralelos para correlacionar productos y precios.
  La lógica está diseñada para optimizar el tiempo de procesamiento mediante la interrupción temprana del ciclo (uso estratégico de la sentencia `break`), ahorrando recursos una vez que se encuentra el dato objetivo.

- **Prevención de Vulnerabilidades en Memoria (Ejercicio 2):**
  Una demostración de cómo iterar sobre estructuras de longitud fija evitando el temido *Buffer Overflow* (desbordamiento de búfer).
  El código hace énfasis en la correcta delimitación de las fronteras de memoria dentro de los ciclos iterativos (`i < 6`), una práctica esencial para garantizar la estabilidad de cualquier programa.

### Ficha Técnica

- **Desarrollador:** Victor Manuel Chacha Chango
- **Carrera:** Ingeniería de Software (Primero - B)
- **Institución:** Universidad Técnica de Ambato
- **Docente:** Ing. José Caiza
