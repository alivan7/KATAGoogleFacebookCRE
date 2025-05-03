# Katas de Codificación para ISP (Principio de Segregación de Interfaces)

A continuación, se presentan seis katas diseñadas para sobre Principio de Segregación de Interfaces (ISP).
Cada kata incluye una breve descripción del problema, la necesidad de ISP y la refactorización esperada.

---

## Kata 1: **Interfaz Monolítica**
**Objetivo:** Crear una interfaz monolítica que viole ISP.

1. Crear una interfaz `Animal` con los métodos `fly()`, `swim()` y `run()`.
2. Implementar las clases `Bird`, `Fish` y `Dog` utilizando la interfaz `Animal`.
3. Identificar el problema: No todos los animales pueden realizar todas las acciones.
4. Refactorizar: Dividir `Animal` en interfaces más pequeñas (`Flyable`, `Swimmable`, `Runnable`) e implementar solo las relevantes en cada clase.

---

## Kata 2: **Sistema Legacy con Métodos No Utilizados**
**Objetivo:** Identificar métodos no utilizados en un sistema legacy.

1. Crear una interfaz `LegacyPrinter` con los métodos `print()`, `scan()` y `fax()`.
2. Implementar una clase `BasicPrinter` que solo utilice `print()`.
3. Identificar el problema: `BasicPrinter` se ve obligada a implementar métodos no utilizados.
4. Refactorizar: Dividir `LegacyPrinter` en `Printable`, `Scannable` y `Faxable`.

---

## Kata 3: **Operaciones No Soportadas**
**Objetivo:** Manejar operaciones no soportadas.

1. Crear una interfaz `Vehicle` con los métodos `drive()`, `fly()` y `sail()`.
2. Implementar las clases `Car`, `Plane` y `Boat`. Lanzar `UnsupportedOperationException` para los métodos no soportados.
3. Identificar el problema: Lanzar excepciones viola ISP.
4. Refactorizar: Crear interfaces separadas (`Drivable`, `Flyable`, `Sailable`) e implementarlas adecuadamente.

---

## Kata 4: **Gestión de Sensores en un Sistema de Monitoreo**
**Objetivo:** Diseñar interfaces específicas para diferentes tipos de sensores.

1. Crear una interfaz `Sensor` con los métodos `readTemperature()`, `readPressure()` y `readHumidity()`.
2. Implementar las clases `TemperatureSensor`, `PressureSensor` y `HumiditySensor`.
3. Identificar el problema: Cada sensor implementa métodos que no necesita.
4. Refactorizar: Dividir `Sensor` en interfaces más pequeñas (`TemperatureReadable`, `PressureReadable`, `HumidityReadable`) e implementar solo las relevantes en cada clase.

---

## Kata 5: **Interfaz de Dispositivo IoT**
**Objetivo:** Diseñar interfaces para capacidades específicas de dispositivos.

1. Crear una interfaz `SmartDevice` con los métodos `turnOn()`, `turnOff()`, `connectToWiFi()` y `playMusic()`.
2. Implementar las clases `SmartLight` y `SmartSpeaker`.
3. Identificar el problema: `SmartLight` no necesita `playMusic()`.
4. Refactorizar: Crear interfaces más pequeñas (`PowerControllable`, `WiFiConnectable`, `MusicPlayable`) e implementarlas selectivamente.

---

## Kata 6: **Sistema de Pago en E-Commerce**
**Objetivo:** Evitar que las clases implementen métodos irrelevantes.

1. Crear una interfaz `PaymentProcessor` con los métodos `processCreditCard()`, `processPayPal()` y `processCrypto()`.
2. Implementar las clases `CreditCardProcessor`, `PayPalProcessor` y `CryptoProcessor`.
3. Identificar el problema: Cada clase implementa métodos que no utiliza.
4. Refactorizar: Dividir `PaymentProcessor` en `CreditCardPayment`, `PayPalPayment` y `CryptoPayment`.

---

## **Pasos a seguir para la resolución de cada Kata**

1. **Comprender el Problema:**
   - Leer la descripción de la kata.
   - Identificar la interfaz monolítica o sobrecargada.

2. **Implementar el Código:**
   - Crear la interfaz y sus implementaciones como se describe.
   - Observar las violaciones de ISP (por ejemplo, métodos no utilizados, excepciones).

3. **Identificar la Necesidad de ISP:**
   - Analizar por qué el diseño actual es problemático.
   - Discutir cómo las interfaces más pequeñas y específicas pueden resolver el problema.

4. **Refactorizar el Código:**
   - Dividir la interfaz monolítica en interfaces más pequeñas y cohesivas.
   - Actualizar las implementaciones para usar solo las interfaces relevantes.

5. **Probar el Código Refactorizado:**
   - Asegurarse de que el código refactorizado funcione como se espera.
   - Verificar que ninguna clase dependa de métodos que no utiliza.

---

## **Resultados Esperados**

- Comprender la importancia de las interfaces cohesivas.
- Aprender a identificar y refactorizar violaciones de ISP.
- Escribir código más limpio y mantenible siguiendo ISP.

---