# FizzBuzz Kata

## Descripción

Este proyecto es una implementación de la **Kata FizzBuzz** en Java, siguiendo los principios del **Desarrollo Guiado por Pruebas (TDD)**. Su objetivo es practicar la estructura de un código limpio, centrado en realizar pruebas automáticas y refactorización para lograr una implementación robusta y flexible. Adicionalmente, el proyecto incluye funcionalidades ampliadas para trabajar con listas de números y objetos, siguiendo una lógica de filtrado específica.

## Tabla de Contenidos
1. [Objetivos](#objetivos)
2. [Requisitos](#requisitos)
3. [Instalación](#instalación)
4. [Uso](#uso)
5. [Características](#características)
6. [Contribución](#contribución)
7. [Autores y Agradecimientos](#autores-y-agradecimientos)
8. [Licencia](#licencia)

## Objetivos

El objetivo principal de esta kata es aprender y aplicar los principios básicos del lenguaje Java junto con la metodología TDD para mejorar la comprensión de la lógica de testeo automatizado y el proceso de refactorización.

## Requisitos

Este proyecto sigue la metodología TDD. Ten en cuenta:
- No puedes escribir código sin un test que falle.
- No puedes escribir nuevos tests que no fallen.
- Escribe siempre la solución más sencilla que haga pasar los tests. Refactoriza después.

**Ciclo de TDD**: 
- Test → Red → Green → Refactor 🔁

### Requisitos Funcionales

- **FizzBuzz Básico**:
  - Escribe un método que reciba un número del 1 al 100 y devuelva:
    - `"Fizz"` para múltiplos de tres
    - `"Buzz"` para múltiplos de cinco
    - `"FizzBuzz"` para múltiplos de tres y cinco
    - El número mismo si no es múltiplo de tres ni de cinco
  
- **Filtros de Listas**:
  - Crea una función que reciba una lista de números y un número divisor:
    - Devuelve otra lista con los números de la lista original que sean divisibles por el número divisor.
  
- **Filtrado de Usuarios Mayores de Edad**:
  - Crea una función que reciba una lista de objetos `Usuario` (con propiedades de `nombre` y `edad`):
    - Devuelve una lista con los usuarios mayores de edad.

## Instalación

1. Clona el repositorio en tu máquina local:
   ```bash
   git clone <https://github.com/Carlassanchez24/TDD.git>
   cd nombre-del-proyecto
