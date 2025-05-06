# Katas para LSP (Principio de Sustitución de Liskov)

El Principio de Sustitución de Liskov (LSP) establece que los objetos de una superclase deben ser reemplazables por objetos de una subclase sin alterar la corrección del programa.

---

## Kata 1: **Rectángulo y Cuadrado**
**Objetivo:** Comprender cómo violar LSP puede llevar a un comportamiento inesperado.

1. Crear una clase `Rectangle` con los métodos `setWidth()` y `setHeight()`.
2. Crear una clase `Square` que extienda `Rectangle`.
3. Identificar el problema: Modificar el ancho o alto de un `Square` rompe el comportamiento esperado de un `Rectangle`.
4. Refactorizar: Evitar la herencia y usar composición en su lugar.

---

## Kata 2: **Aves y Vuelo**
**Objetivo:** Evitar violar LSP con herencia inapropiada.

1. Crear una clase `Bird` con un método `fly()`.
2. Crear subclases `Sparrow` y `Penguin`.
3. Identificar el problema: `Penguin` no puede volar, violando LSP.
4. Refactorizar: Introducir una interfaz `Flyable` e implementarla solo en aves que vuelan.

---

## Kata 3: **Procesadores de Pago**
**Objetivo:** Garantizar la sustituibilidad en un sistema de pagos.

1. Crear una clase `PaymentProcessor` con un método `processPayment()`.
2. Crear subclases `CreditCardProcessor` y `CryptoProcessor`.
3. Introducir un escenario donde `CryptoProcessor` lanza una excepción para monedas no soportadas.
4. Refactorizar: Usar una interfaz más específica o validación para garantizar la sustituibilidad.

---

## Kata 4: **Figuras y Cálculo de Área**
**Objetivo:** Garantizar un comportamiento consistente al calcular áreas.

1. Crear una clase `Shape` con un método `calculateArea()`.
2. Crear subclases `Circle` y `Triangle`.
3. Introducir un escenario donde `Triangle` requiere parámetros adicionales (por ejemplo, base y altura) que rompen la sustituibilidad.
4. Refactorizar: Usar inyección de constructor para garantizar que se proporcionen todos los parámetros necesarios.

---

## Kata 5: **Vehículos y Combustible**
**Objetivo:** Evitar problemas de sustituibilidad con vehículos de combustible y eléctricos.

1. Crear una clase `Vehicle` con un método `refuel()`.
2. Crear subclases `Car` y `ElectricCar`.
3. Identificar el problema: `ElectricCar` no usa combustible, violando LSP.
4. Refactorizar: Introducir una interfaz `Fuelable` e implementarla solo en vehículos que usan combustible.

---

## Kata 6: **Reproductores Multimedia**
**Objetivo:** Manejar formatos de medios no soportados.

1. Crear una clase `MediaPlayer` con un método `playAudio()`.
2. Crear subclases `MP3Player` y `VideoPlayer`.
3. Identificar el problema: `VideoPlayer` requiere funcionalidad adicional (por ejemplo, `playVideo()`), rompiendo LSP.
4. Refactorizar: Usar interfaces separadas para la reproducción de audio y video.

---

## Kata 7: **Descuentos en E-Commerce**
**Objetivo:** Garantizar la sustituibilidad en el cálculo de descuentos.

1. Crear una clase `Discount` con un método `applyDiscount()`.
2. Crear subclases `PercentageDiscount` y `FixedAmountDiscount`.
3. Introducir un escenario donde `FixedAmountDiscount` aplica un descuento mayor al precio total, rompiendo la sustituibilidad.
4. Refactorizar: Agregar lógica de validación para garantizar un comportamiento consistente en todos los tipos de descuento.

---

### **Pasos para Cada Kata**

1. **Comprender el Problema:**
   - Leer la descripción de la kata.
   - Identificar dónde se está violando LSP.

2. **Implementar el Código:**
   - Crear la clase base y sus subclases como se describe.
   - Observar las violaciones de LSP (por ejemplo, comportamiento inesperado, excepciones).

3. **Identificar la Necesidad de LSP:**
   - Analizar por qué el diseño actual es problemático.
   - Discutir cómo adherirse a LSP puede resolver el problema.

4. **Refactorizar el Código:**
   - Modificar el diseño para garantizar la sustituibilidad.
   - Usar interfaces, composición o validación según sea necesario.

5. **Probar el Código Refactorizado:**
   - Asegurarse de que el código refactorizado funcione como se espera.
   - Verificar que las clases derivadas puedan reemplazar a las clases base sin problemas.

---

### **Resultados Esperados**

- Comprender la importancia de la sustituibilidad en el diseño orientado a objetos.
- Aprender a identificar y refactorizar violaciones de LSP.
- Escribir código más limpio y robusto siguiendo LSP.

---