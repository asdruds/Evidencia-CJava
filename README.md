# Evidencia final de Computación Avanzada en Java
### Calculadora de IMC
#### Emiliano Flores Sánchez | Asdruval Díaz Sánchez
Este proyecto consiste en una aplicación web desarrollada en Java que permite a los usuarios calcular su Índice de Masa Corporal (IMC), así como llevar un registro de sus cálculos a lo largo del tiempo.

## Objetivo
El objetivo fundamental de este sistema es brindar a los usuarios una herramienta confiable para calcular su Índice de Masa Corporal, al mismo tiempo que se les proporciona un registro histórico de sus cálculos anteriores. Se garantiza la privacidad de los usuarios mediante un registro único y el acceso controlado a través de la sesión para realizar cálculos de IMC y acceder a su historial personalizado.

## Uso

1. Accede a la aplicación desde tu navegador web.
2. Regístrate como nuevo usuario o inicia sesión si ya tienes una cuenta.
3. Utiliza la calculadora de IMC para obtener tu índice de masa corporal.
4. Visualiza tu historial de cálculos de IMC.

## Funciones
#### Cálculo del IMC con Sesión Iniciada
* Para calcular el IMC, los usuarios deberán iniciar sesión con su nombre de usuario y contraseña. Sin esta autenticación, no podrán realizar el cálculo.

#### Validación de Datos de Usuario
* Se solicitará la masa corporal al usuario para el cálculo del IMC. No se admitirán valores de masa corporal igual a 0 o negativos.

#### Visualización de Datos al Usuario
* Después de iniciar sesión, se presentará al usuario una tabla con su IMC actual y un historial de sus cálculos previos.

#### Acceso a Datos desde Base de Datos vía Servicio Web REST
* El historial de cálculos se obtendrá desde la base de datos utilizando un servicio web REST, asegurando la seguridad y el acceso remoto a la información.

### Contribuciones
Las contribuciones son bienvenidas. Siéntete libre de abrir un problema o enviar una solicitud de extracción para mejoras o correcciones.

### Autores
- Emiliano Flores Sánchez
- Asdruval Díaz Sánchez
