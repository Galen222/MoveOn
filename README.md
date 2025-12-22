MoveON - Aplicación Deportiva deportiva para guardar rutas de movimiento andando o corriendo.

Frontend: Android usando Java desarrollado en Android Studio.

Backend: Python desarrollado en Visual Studio Code (FastAPI).

Base de Datos: SQLite en Android / PostgreSQL en Servidor.


🚀 Guía para Colaboradores

1. Clonar el repositorio
Abre una terminal en tu carpeta de proyectos y ejecuta: git clone https://github.com/Galen222/MoveOn.git y después cd MoveOn

2. Frontend (Android Studio)

Abre Android Studio.

Selecciona Open.

Navega hasta MoveOn/android-app/ y abre esa carpeta.

Configuración del JDK: Si sale un aviso de JDK, ve a File > Settings > Build, Execution, Deployment > Build Tools > Gradle y asegúrate de que el Gradle JDK sea el JDK 21.

3. Backend (Visual Studio Code)

Abre Visual Studio Code.

Selecciona File > Open Folder... y elige la carpeta MoveOn/backend/.

Crear Entorno Virtual: Abre la terminal de VS Code y ejecuta: python -m venv venv

Activar Entorno:

Windows: .\venv\Scripts\activate

Mac/Linux: source venv/bin/activate

Instalar Dependencias: pip install -r requirements.txt

Configurar Intérprete: Pulsa Ctrl + Shift + P, escribe "Python: Select Interpreter" y elige el que indica ('venv': venv).

4. Flujo de trabajo (Git)

Para evitar conflictos, sigue siempre este orden tanto en Android Studio como en VS Code:

PULL: Antes de empezar, descarga los cambios de tus compañeros (Flecha azul en Android Studio / git pull en terminal).

COMMIT: Cuando termines un cambio, guarda tus avances con un mensaje descriptivo (Check verde en Android Studio / Icono de Source Control en VS Code).

PUSH: Envía tus cambios a GitHub (Flecha verde en Android Studio / git push en terminal).

5. Ejecución del Servidor Backend

Para probar la API localmente, con el entorno venv activo en la carpeta backend, ejecuta: uvicorn main:app --reload
