# TP Secante Newton
### Integrantes:
- Facundo Díaz
- Franco Nicotra
- Tobías Riccone

## Descripción de la solución:
La solucion al problema planteado se resolvio creando un método llamado "newtonSecante" el cual recibe un punto de partida y un epsilon. Este empieza aplicando newton a la función previamente definida en el código, con el punto inicial recibido por parámetro. Luego calcula el error actual (módulo de punto inicial menos aproxiamción) e ingresa en un bucle el cual empieza aplicando secante con el método llamado "secante" que recibe un punto de partida, este punto de partida va a ser la aproximación lograda con el newton previo. Despues de aplicar el primer Newton y el primer Secante, vuelve a aplicar newton con la aproximación del último secante y verifica si el error es menor que el epsilon, si no lo es, se repetirá secante y newton hasta cumplir la condición.

![image](https://user-images.githubusercontent.com/95353442/230974420-39d8b2d9-15b9-497c-949a-c80136a33d2b.png)

## Herramientas usadas:
- Java 17
- IntelliJ
- GitHub

## Evidencia:

![image](https://user-images.githubusercontent.com/95353442/230973083-710d563a-ec33-48f1-8c67-760d3c9196fa.png)

![image](https://user-images.githubusercontent.com/95353442/230973096-9cf69b99-3090-4582-9eb6-bcbf7f59c710.png)

![image](https://user-images.githubusercontent.com/95353442/230973106-6ebafcba-ce8f-48d0-9ce3-85421c7e62b6.png)

