# Trabajo Práctico Nro 2

### Enunciado:
Un cliente nos solicitó el desarrollo de un sistema para administrar las ventas que se realizan en
un bar, donde se sirven comidas rápidas y bebidas.
Del análisis funcional de los requerimientos del cliente se llegó a las siguientes especificaciones.

## Módulo de gestión de mesas:
Este módulo se encargará de registrar todas las consumiciones que se realizan en una mesa del
bar. La cantidad de mesas con las que cuenta el bar se define con un parámetro del sistema.
Cada mesa se identifica con un número entero. Una mesa tiene un número, un estado y la lista de
consumiciones de los clientes que la están ocupando (si la mesa está disponible esta lista estará
vacía).


Las funcionalidades de este módulo son:
- ocupar una mesa
- cerrar una mesa
- pasar una mesa a estado disponible
- registrar consumición

Las mesas pueden tener los siguientes estados:

- **disponible** : Lista para recibir clientes. En este estado nunca puede tener consumiciones,
ni se pueden agregar nuevas consumiciones. Siempre puede pasar a los estados ocupada
o cerrada.
- **cerrada** : mesa que no puede ocuparse (porque está rota o porque no se va a usar). En
este estado nunca puede tener consumiciones, ni se pueden agregar nuevas
consumiciones. Siempre puede pasar a disponible.
- **ocupada** : mesa con clientes a la que se le puede agregar consumiciones. Pasa a
disponible cuando los clientes pagan o si deciden irse sin haber consumido nada. Solo
puede pasar a disponible, pero siempre que no tenga consumiciones.

![v](https://user-images.githubusercontent.com/60303079/75649690-ae437c80-5c32-11ea-942e-0e5df0bb2e31.png)

La situación normal sería que una mesa disponible se ocupe y pase al estado ocupada , el
cliente consume, se registran todas las consumiciones de la mesa, el cliente pide la cuenta, se
genera el ticket y la mesa pasa a estado disponible nuevamente. Este último cambio lo debe
realizar automáticamente el sistema una vez que se genera el ticket.
En la situación especial en que un cliente decide irse sin haber consumido nada se pasará en
forma manual la mesa al estado disponible .
Por cada consumición se registra el código de producto y la cantidad.

## Módulo de gestión de precios:
Este módulo agrupa toda la funcionalidad vinculada a la gestión de precios, tanto los precios de
venta al público como los precios de costo de los productos que se ofrecen en el bar.
Estos productos se pueden clasificar en las siguientes categorías:

- bebida
    - c/alcohol (bebida con alcohol)
    - s/alcohol (bebida sin alcohol)
- pizzas
- hamburguesas
- minutas
- combos

Estas categorías se usan para generar promociones.

Por cada producto que se ofrece en el bar que es plausible de generar una consumición. Se lleva
un registro con al menos la siguiente información:
- código de producto: es un número entero, único, que identifica unívocamente al producto.
- descripción: descripción del producto, por ejemplo, “STELLA ARTOIS 330 ML”,
“HAMBURGUESA DE POLLO”, “PIZZA NAPOLITANA”, etc.
- precio de costo
- precio de venta

El precio de venta nunca podrá ser inferior al precio de costo.

Las funcionalidades de este módulo son:
- consultar datos de un producto (por descripción o por código)
- dar de alta un nuevo producto
- dar de baja un producto
- modificar un producto existente
- generar un combo (en base a los productos existentes, incluso en base a otros combos).
- imprimir carta

## Combos:
Los combos son una lista de productos existentes (incluso otros combos) a los que se les aplica
un descuento sobre la suma de los precios de venta de los productos que lo componen. De los
combos se registra lo indicado en producto y además la siguiente información:
- descuento: número entero entre 0 y 100 (representa el porcentaje de descuento a aplicar)

## Imprimir carta:
Debe emitir un archivo de texto con la descripción y precio de venta de todos los productos en el
siguiente orden:
Bebidas sin alcohol
bebidas con alcohol
hamburguesas
pizzas
minutas
otros
combos
De los combos también se debe mostrar la lista de productos que contienen.

## Módulo de caja:
El módulo de caja genera los tickets, y los almacena para listarlos.
Las funcionalidades son:
- Generar ticket de una mesa dada: esta funcionalidad genera el ticket y lo imprime en
pantalla, además debe vaciar la lista de consumiciones de la mesa y pasarla al estado
disponible.
- Listar todos tickets (dentro de un rango de fechas dadas).

## Ticket
De cada ticket se registra:
- Número de ticket: único en todo el sistema.
- Fecha y hora
- Número de mesa
- Lista de consumiciones
- Monto total a cobrar

## Generar ticket:
Dada una mesa calcula el total como la suma de los precios de venta de cada producto. En el
caso de los combos el precio de venta se calcula como la suma de la lista de productos del combo
menos el descuento correspondiente.

## Listar todos tickets (dentro de un rango de fechas dadas)
Muestra por pantalla el número ticket y el monto total del mismo y al final la suma de todos los
ingresos.
