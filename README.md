# TP Secante Newton
### Integrantes:
- Facundo Díaz
- Franco Nicotra
- Tobías Riccone

Para el desarrollo del script se utilizó el lenguaje Java (jdk 17)

## Descripción de la solución:
La solución al problema planteado se resolvió creando un método llamado "newtonSecante" el cual recibe un punto de partida y un epsilon.
Este empieza aplicando Newton con el punto inicial recibido por parámetro, calcula el error (módulo de punto inicial menos aproximación) e ingresa en un bucle el cual empieza aplicando secante con la aproximación de Newton como punto de partida. Después de aplicar el primer Newton y el primer Secante, vuelve a aplicar Newton con la aproximación del último secante y verifica si el error es menor que el epsilon. Si no lo es, se repetirá Secante y Newton hasta cumplir la condición.
Imagen de los métodos principales:

![image](https://user-images.githubusercontent.com/95353442/231001728-9075ccb5-ce96-43fa-b68f-469181d90dce.png)
![image](https://user-images.githubusercontent.com/95353442/231001748-2fc31a7f-9fe1-4cfb-89ad-2a2178aaa46f.png)
![image](https://user-images.githubusercontent.com/95353442/231001772-ff6ee664-b980-473e-b226-d5485a0c0572.png)

## Ejecución de ejemplo:
Se aplica el script en la siguiente función
f(x) = x^3- x + 1
- Es C2 (derivable 2 veces)
- Es continua en todo el Dominio

Se hardcodea la función y su derivada:

![image](https://user-images.githubusercontent.com/95353442/231001822-ab376d61-5221-4818-a147-b8c0f48ccca1.png)

Y se ejecuta el algoritmo:

![image](https://user-images.githubusercontent.com/95353442/231001893-f35bfb84-c82c-461e-9af8-27b187b82f99.png)

Se verifica en Geogebra que la raíz es correcta:

![image](https://user-images.githubusercontent.com/95353442/231001957-a165a338-ce5c-455b-a8df-43f9e2529a90.png)
