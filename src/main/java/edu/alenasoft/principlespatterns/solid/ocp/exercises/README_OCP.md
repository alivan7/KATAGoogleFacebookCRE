# Katas para OCP (Principio de Abierto/Cerrado)

El Principio de Abierto/Cerrado (OCP) establece que las entidades de software (clases, módulos, funciones, etc.) deben estar abiertas para extensión, pero cerradas para modificación.

---

## Kata 1: **Cálculo de Pagos**
**Objetivo:** Extender el cálculo de pagos sin modificar el código existente.

1. Crear una interfaz `Payable` con un método `getPay()`.
2. Implementar las clases `FixedEmployee`, `HourlyEmployee` y `ComissionEmployee`.
3. Introducir un nuevo tipo de empleado, `FreelanceEmployee`, que calcule el pago basado en entregas.
4. Refactorizar: Asegurarse de que el nuevo tipo de empleado se integre sin modificar las clases existentes.

---

## Kata 2: **Sistema de Notificaciones**
**Objetivo:** Agregar nuevos canales de notificación sin modificar el código existente.

1. Crear una interfaz `Notifier` con un método `sendNotification()`.
2. Implementar las clases `EmailNotifier` y `SMSNotifier`.
3. Introducir un nuevo canal de notificación, `PushNotifier`.
4. Refactorizar: Asegurarse de que el nuevo canal se integre sin modificar las clases existentes.

---

## Kata 3: **Gestión de Impuestos**
**Objetivo:** Calcular impuestos para diferentes países sin modificar el código existente.

1. Crear una interfaz `TaxCalculator` con un método `calculateTax()`.
2. Implementar las clases `USTaxCalculator` y `UKTaxCalculator`.
3. Introducir un nuevo cálculo de impuestos para `CanadaTaxCalculator`.
4. Refactorizar: Asegurarse de que el nuevo cálculo se integre sin modificar las clases existentes.

---

## Kata 4: **Sistema de Reportes**
**Objetivo:** Generar diferentes tipos de reportes sin modificar el código existente.

1. Crear una interfaz `ReportGenerator` con un método `generateReport()`.
2. Implementar las clases `PDFReportGenerator` y `ExcelReportGenerator`.
3. Introducir un nuevo tipo de reporte, `HTMLReportGenerator`.
4. Refactorizar: Asegurarse de que el nuevo tipo de reporte se integre sin modificar las clases existentes.

---

## Kata 5: **Procesamiento de Archivos**
**Objetivo:** Procesar diferentes tipos de archivos sin modificar el código existente.

1. Crear una interfaz `FileProcessor` con un método `processFile()`.
2. Implementar las clases `TextFileProcessor` y `CSVFileProcessor`.
3. Introducir un nuevo tipo de archivo, `XMLFileProcessor`.
4. Refactorizar: Asegurarse de que el nuevo tipo de archivo se integre sin modificar las clases existentes.

---

## Kata 6: **Sistema de Descuentos**
**Objetivo:** Agregar nuevos tipos de descuentos sin modificar el código existente.

1. Crear una interfaz `Discount` con un método `applyDiscount()`.
2. Implementar las clases `PercentageDiscount` y `FixedAmountDiscount`.
3. Introducir un nuevo tipo de descuento, `SeasonalDiscount`.
4. Refactorizar: Asegurarse de que el nuevo tipo de descuento se integre sin modificar las clases existentes.

---

## Kata 7: **Gestión de Vehículos**
**Objetivo:** Agregar nuevos tipos de vehículos sin modificar el código existente.

1. Crear una interfaz `Vehicle` con un método `getFuelEfficiency()`.
2. Implementar las clases `Car` y `Truck`.
3. Introducir un nuevo tipo de vehículo, `Motorcycle`.
4. Refactorizar: Asegurarse de que el nuevo tipo de vehículo se integre sin modificar las clases existentes.

---

### **Pasos para Cada Kata**

1. **Comprender el Problema:**
   - Leer la descripción de la kata.
   - Identificar cómo se puede extender el sistema sin modificar el código existente.

2. **Implementar el Código:**
   - Crear la interfaz y las clases iniciales como se describe.
   - Agregar nuevos casos de uso según sea necesario.

3. **Identificar la Necesidad de OCP:**
   - Analizar por qué el diseño actual puede ser problemático para la extensión.
   - Discutir cómo adherirse a OCP puede resolver el problema.

4. **Refactorizar el Código:**
   - Modificar el diseño para garantizar que el sistema sea extensible.
   - Usar interfaces, herencia o composición según sea necesario.

5. **Probar el Código Refactorizado:**
   - Asegurarse de que el código refactorizado funcione como se espera.
   - Verificar que las nuevas funcionalidades se integren sin modificar las clases existentes.

---

### **Resultados Esperados**

- Comprender la importancia de diseñar sistemas extensibles.
- Aprender a identificar y refactorizar violaciones de OCP.
- Escribir código más flexible y mantenible siguiendo OCP.

---